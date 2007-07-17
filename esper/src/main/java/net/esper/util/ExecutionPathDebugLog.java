package net.esper.util;

public class ExecutionPathDebugLog
{
    private static Boolean isDebugEnabled;

    public static boolean isEnabled()
    {
        if (isDebugEnabled != null)
        {
            return isDebugEnabled;
        }

        // TODO
        isDebugEnabled = false;
        return isDebugEnabled;
    }
}
