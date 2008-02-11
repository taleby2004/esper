/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.timer;

import java.util.TimerTask;

/**
 * Timer task to simply invoke the callback when triggered.
 */
final class EPLTimerTask extends TimerTask
{
    private final TimerCallback callback;
    private boolean isCancelled;

    protected boolean _enableStats;
    protected long _lastDrift;
    protected long _maxDrift;
    protected long _totalDrift;
    protected long _invocationCount;

    public EPLTimerTask(TimerCallback callback)
    {
        this.callback = callback;
        _enableStats = false;
        _lastDrift = 0;
        _maxDrift = 0;
        _totalDrift = 0;
        _invocationCount = 0;
    }

    public final void run()
    {
        if (!isCancelled)
        {
            if (_enableStats) {
                _lastDrift = System.currentTimeMillis()-scheduledExecutionTime();
                _totalDrift += _lastDrift;
                _invocationCount++;
                if (_lastDrift > _maxDrift) _maxDrift = _lastDrift;
            }
            callback.timerCallback();
        }
    }

    protected void resetStats()
    {
        _invocationCount = 0;
        _lastDrift = 0;
        _totalDrift = 0;
        _maxDrift = 0;
    }

    public void setCancelled(boolean cancelled)
    {
        isCancelled = cancelled;
    }
}