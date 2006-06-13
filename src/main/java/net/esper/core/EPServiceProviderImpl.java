package net.esper.core;

import net.esper.client.*;

/**
 * Service provider encapsulates the engine's services for runtime and administration interfaces.
 */
public class EPServiceProviderImpl implements EPServiceProvider
{
    private EPServicesContext services;
    private EPRuntimeImpl runtime;
    private EPAdministratorImpl admin;

    private final EventTypeResolutionService eventTypeResolutionService;

    /**
     * Constructor - initializes services.
     * @param configuration is the engine configuration
     * @throws ConfigurationException is thrown to indicate a configuraton error
     */
    public EPServiceProviderImpl(Configuration configuration) throws ConfigurationException
    {
        // We take a snapshot of the configuration here, maintained by the config service
        eventTypeResolutionService = new EventTypeResolutionServiceImpl(configuration.getEventTypeAliases());

        initialize();
    }

    public EPRuntime getEPRuntime()
    {
        return runtime;
    }

    public EPAdministrator getEPAdministrator()
    {
        return admin;
    }

    public void initialize()
    {
        if (services != null)
        {
            services.getTimerService().stopInternalClock(false);
            try
            {
                // Give the timer thread a little moment to catch up
                Thread.sleep(100);
            }
            catch (InterruptedException ex)
            {
                // No logic required here
            }
        }

        // New services and runtime
        services = new EPServicesContext(eventTypeResolutionService);
        runtime = new EPRuntimeImpl(services);
        services.getTimerService().setCallback(runtime);
        admin = new EPAdministratorImpl(services);

        // Start clocking
        services.getTimerService().startInternalClock();
    }
}
