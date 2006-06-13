package net.esper.eql.expression;

import net.esper.event.EventType;
import net.esper.event.EventBean;
import net.esper.event.EventTypeFactory;
import net.esper.event.EventBeanFactory;
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

    /**
     * Ctor.
     * @param selectionList - list of select-clause items
     * @throws ExprValidationException thrown if any of the expressions don't validate
     */
    public SelectExprEvalProcessor(List<SelectExprElement> selectionList) throws ExprValidationException
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

        // Determine the event type for the expressions
        Map<String, Class> types = new HashMap<String, Class>();
        for (SelectExprElement entry : selectionList)
        {
            types.put(entry.getAsName(), entry.getSelectExpression().getType());
        }
        resultEventType = EventTypeFactory.getInstance().createMapType(types);
    }

    public EventBean process(EventBean[] eventsPerStream)
    {
        Map<String, Object> props = new HashMap<String, Object>();
        for (SelectExprElement entry : selectionList)
        {
            props.put(entry.getAsName(), entry.getSelectExpression().evaluate(eventsPerStream));
        }

        EventBean event = EventBeanFactory.createMapFromValues(props, resultEventType);
        return event;
    }

    public EventType getResultEventType()
    {
        return resultEventType;
    }
}
