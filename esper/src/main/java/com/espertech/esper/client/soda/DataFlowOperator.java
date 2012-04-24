/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.client.soda;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

public class DataFlowOperator implements Serializable {

    private List<AnnotationPart> annotations;
    private String operatorName;
    private List<DataFlowOperatorInput> input;
    private List<DataFlowOperatorOutput> output;
    private Map<String, Object> parameters;

    public DataFlowOperator(List<AnnotationPart> annotations, String operatorName, List<DataFlowOperatorInput> input, List<DataFlowOperatorOutput> output, Map<String, Object> parameters) {
        this.annotations = annotations;
        this.operatorName = operatorName;
        this.input = input;
        this.output = output;
        this.parameters = parameters;
    }

    public DataFlowOperator() {
    }

    public List<AnnotationPart> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<AnnotationPart> annotations) {
        this.annotations = annotations;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public List<DataFlowOperatorInput> getInput() {
        return input;
    }

    public void setInput(List<DataFlowOperatorInput> input) {
        this.input = input;
    }

    public List<DataFlowOperatorOutput> getOutput() {
        return output;
    }

    public void setOutput(List<DataFlowOperatorOutput> output) {
        this.output = output;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public void toEPL(StringWriter writer, EPStatementFormatter formatter) {
        writer.write(operatorName);

        if (!input.isEmpty()) {
            writer.write("(");
            String delimiter = "";
            for (DataFlowOperatorInput inputItem : input) {
                writer.write(delimiter);
                writeInput(inputItem, writer);
                if (inputItem.getOptionalAsName() != null) {
                    writer.write(" as ");
                    writer.write(inputItem.getOptionalAsName());
                }
                delimiter = ", ";
            }
            writer.write(")");
        }

        if (!output.isEmpty()) {
            writer.write(" -> ");
            String delimiter = "";
            for (DataFlowOperatorOutput outputItem : output) {
                writer.write(delimiter);
                writer.write(outputItem.getStreamName());
                writeTypes(outputItem.getTypeInfo(), writer);
                delimiter = ",";
            }
        }

        if (parameters.isEmpty()) {
            writer.write(" {}");
            formatter.endDataFlowOperatorDetails(writer);
        }
        else {
            writer.write(" {");
            formatter.beginDataFlowOperatorDetails(writer);
            String delimiter = "";
            for (Map.Entry<String, Object> entry : parameters.entrySet()) {
                writer.write(delimiter);
                writer.write(entry.getKey());
                writer.write(": ");
                if (entry.getValue() instanceof EPStatementObjectModel) {
                    writer.write("(");
                    ((EPStatementObjectModel) entry.getValue()).toEPL(writer);
                    writer.write(")");
                }
                else if (entry.getValue() instanceof Expression) {
                    ((Expression) entry.getValue()).toEPL(writer, ExpressionPrecedenceEnum.MINIMUM);
                }
                else {
                    writer.write(entry.getValue().toString());
                }
                delimiter = ",";
                formatter.endDataFlowOperatorConfig(writer);
            }
            writer.write("}");
            formatter.endDataFlowOperatorDetails(writer);
        }
    }

    private void writeInput(DataFlowOperatorInput inputItem, StringWriter writer) {
        if (inputItem.getInputStreamNames().size() > 1) {
            String delimiterNames = "";
            writer.write("(");
            for (String name : inputItem.getInputStreamNames()) {
                writer.write(delimiterNames);
                writer.write(name);
                delimiterNames = ",";
            }
            writer.write(")");
        }
        else {
            writer.write(inputItem.getInputStreamNames().get(0));
        }
    }

    private void writeTypes(List<DataFlowOperatorOutputType> types, StringWriter writer) {
        if (types == null || types.isEmpty()) {
            return;
        }

        writer.write("<");
        String typeDelimiter = "";
        for (DataFlowOperatorOutputType type : types) {
            writer.write(typeDelimiter);
            writeType(type, writer);
            typeDelimiter = ",";
        }
        writer.write(">");
    }

    private void writeType(DataFlowOperatorOutputType type, StringWriter writer) {
        if (type.isWildcard()) {
            writer.append('?');
            return;
        }
        writer.append(type.getTypeOrClassname());
        writeTypes(type.getTypeParameters(), writer);
    }
}
