package net.esper.view;

import net.esper.schedule.SchedulingService;

/**
 * Contains handles to the implementation of the the scheduling service for use in view evaluation.
 */
public final class ViewServiceContext
{
    private final SchedulingService schedulingService;

    /**
     * Constructor.
     * @param schedulingService implementation for schedule registration
     */
    public ViewServiceContext(SchedulingService schedulingService)
    {
        this.schedulingService = schedulingService;
    }

    /**
     * Returns service to use for schedule evaluation.
     * @return schedule evaluation service implemetation
     */
    public final SchedulingService getSchedulingService()
    {
        return schedulingService;
    }
}