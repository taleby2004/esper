package com.espertech.esper.epl.thread;

public class ThreadingOption
{
    /**
     * Public access.
     */
    public static boolean isThreadingEnabled = false;

    public static void setThreadingEnabled(Boolean threadingEnabled)
    {
        isThreadingEnabled = threadingEnabled;
    }

    public static boolean isThreadingEnabled()
    {
        return isThreadingEnabled;
    }
}
