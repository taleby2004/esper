package net.esper.eql.expression;

import net.esper.event.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Processor for select-clause expressions that handles a list of selection items represented by
 * expression nodes. Computes results based on matching events.
 */
public class SelectExprEvalProcessor implements SelectExprProcessor
{
    private final List<SelectExprElement> selectionList;
    private final EventType resultEventType;
    private final EventAdapterService eventAdapterService;

    /**
     * Ctor.
     * @param selectionList - list of select-clause items
     * @param eventAdapterService - service for generating events and handling event types
     * @throws ExprValidationException thrown if any of the expressions don't validate
     */
    public SelectExprEvalProcessor(List<SelectExprElement> selectionList, EventAdapterService eventAdapterService) throws ExprValidationException
    {
        if (selectionList.size() == 0)
        {
            throw new IllegalArgumentException("Empty selection list not supported");
        }

        for (SelectExprElement entry : selectionList)
        {
            if (entry.getAsName() == null)
            {
                throw new IllegalArgumentException("Expected name for each expression has not been supplied");
            }
        }

        this.selectionList = selectionList;
        this.eventAdapterService = eventAdapterService;

        // Determine the event type for the expressions
        Map<String, Class> types = new HashMap<String, Class>();
        for (SelectExprElement entry : selectionList)
        {
            types.put(entry.getAsName(), entry.getSelectExpression().getType());
        }
        resultEventType = eventAdapterService.createAnonymousMapType(types);
    }

    public EventBean process(EventBean[] eventsPerStream)
    {
        Map<String, Object> props = new HashMap<String, Object>();
        for (SelectExprElement entry : selectionList)
        {
            props.put(entry.getAsName(), entry.getSelectExpression().evaluate(eventsPerStream));
        }

        EventBean event = eventAdapterService.createMapFromValues(props, resultEventType);
        return event;
    }

    public EventType getResultEventType()
    {
        return resultEventType;
    }
}
