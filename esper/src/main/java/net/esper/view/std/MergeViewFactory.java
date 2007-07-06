package net.esper.view.std;

import net.esper.view.*;
import net.esper.event.EventType;
import net.esper.eql.core.ViewResourceCallback;
import net.esper.core.StatementContext;

import java.util.List;
import java.util.Arrays;

/**
 * Factory for {@link MergeView} instances. 
 */
public class MergeViewFactory implements ViewFactory
{
    private String[] fieldNames;
    private EventType eventType;

    public void setViewParameters(ViewFactoryContext viewFactoryContext, List<Object> viewParameters) throws ViewParameterException
    {
        fieldNames = GroupByViewFactory.getFieldNameParams(viewParameters, "Group-by-merge");
    }

    public void attach(EventType parentEventType, StatementContext statementContext, ViewFactory optionalParentFactory, List<ViewFactory> parentViewFactories) throws ViewAttachException
    {
        // Find the group by view matching the merge view
        ViewFactory groupByViewFactory = null;
        for (ViewFactory parentView : parentViewFactories)
        {
            if (!(parentView instanceof GroupByViewFactory))
            {
                continue;
            }
            GroupByViewFactory candidateGroupByView = (GroupByViewFactory) parentView;
            if (Arrays.equals(candidateGroupByView.getGroupFieldNames(), this.fieldNames))
            {
                groupByViewFactory = candidateGroupByView;
            }
        }

        if (groupByViewFactory == null)
        {
            throw new ViewAttachException("Group by view for this merge view could not be found among parent views");
        }

        // determine types of fields
        Class[] fieldTypes = new Class[fieldNames.length];
        for (int i = 0; i < fieldTypes.length; i++)
        {
            fieldTypes[i] = groupByViewFactory.getEventType().getPropertyType(fieldNames[i]);
        }

        // Determine the final event type that the merge view generates
        // This event type is ultimatly generated by AddPropertyValueView which is added to each view branch for each
        // group key.

        // If the parent event type contains the merge fields, we use the same event type
        boolean parentContainsMergeKeys = true;
        for (int i = 0; i < fieldNames.length; i++)
        {
            if (!(parentEventType.isProperty(fieldNames[i])))
            {
                parentContainsMergeKeys = false;
            }            
        }

        // If the parent view contains the fields to group by, the event type after merging stays the same
        if (parentContainsMergeKeys)
        {
            eventType = parentEventType;
        }
        else
        // If the parent event type does not contain the fields, such as when a statistics views is
        // grouped which simply provides a map of calculated values,
        // then we need to add in the merge field as an event property thus changing event types.
        {
            eventType = statementContext.getEventAdapterService().createAddToEventType(
                    parentEventType, fieldNames, fieldTypes);
        }
    }

    public boolean canProvideCapability(ViewCapability viewCapability)
    {
        return false;
    }

    public void setProvideCapability(ViewCapability viewCapability, ViewResourceCallback resourceCallback)
    {
        throw new UnsupportedOperationException("View capability " + viewCapability.getClass().getSimpleName() + " not supported");
    }

    public View makeView(StatementContext statementContext)
    {
        return new MergeView(statementContext, fieldNames, eventType);
    }

    public EventType getEventType()
    {
        return eventType;
    }

    public boolean canReuse(View view)
    {
        if (!(view instanceof MergeView))
        {
            return false;
        }

        MergeView myView = (MergeView) view;
        if (!Arrays.deepEquals(myView.getGroupFieldNames(), fieldNames))
        {
            return false;
        }
        return true;
    }
}
