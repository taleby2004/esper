package net.esper.view;

/**
 * Views use this interface to indicate that the view requires services out of the context,
 * such as the scheduling service.
 */
public interface ContextAwareView
{
    /**
     * Set the services context containing service handles.
     * @param context with service handles
     */
    public void setContextAware(ViewServiceContext context);
}
