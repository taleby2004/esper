package com.espertech.esper.view.window;

import com.espertech.esper.event.EventType;
import com.espertech.esper.type.TimePeriodParameter;
import com.espertech.esper.util.JavaClassHelper;
import com.espertech.esper.view.ViewParameterException;

public class TimeBatchViewFactoryParams {

    protected static final String FORCE_UPDATE_KEYWORD = "force_update";
    protected static final String START_EAGER_KEYWORD = "start_eager";

    /**
     * Event type
     */
    protected EventType eventType;

    /**
     * Number of msec before batch fires (either interval or number of events).
     */
    protected long millisecondsBeforeExpiry;
    
    /**
     * Indicate whether to output only if there is data, or to keep outputting empty batches.
     */
    protected boolean isForceUpdate;

    /**
     * Indicate whether to output only if there is data, or to keep outputting empty batches.
     */
    protected boolean isStartEager;

    /**
     * Process view expiry parameter
     * @param parameter
     * @param errorMessage
     * @param errorMessage2
     * @throws ViewParameterException
     */
	protected void processExpiry(Object parameter, String errorMessage, String errorMessage2) throws ViewParameterException {
		if (parameter instanceof TimePeriodParameter)
        {
            TimePeriodParameter param = (TimePeriodParameter) parameter;
            millisecondsBeforeExpiry = Math.round(1000d * param.getNumSeconds());
        }
        else if (!(parameter instanceof Number))
        {
            throw new ViewParameterException(errorMessage);
        }
        else
        {
            Number param = (Number) parameter;
            if (JavaClassHelper.isFloatingPointNumber(param))
            {
            	millisecondsBeforeExpiry = Math.round(1000d * param.doubleValue());
            }
            else
            {
                millisecondsBeforeExpiry = 1000 * param.longValue();
            }
        }

        if (millisecondsBeforeExpiry < 1)
        {
            throw new ViewParameterException(errorMessage2);
        }
	}

	/**
	 * Convert keywords into isForceUpdate and isStartEager members
	 * @param keywords
	 * @param errorMessage
	 * @throws ViewParameterException
	 */
	protected void processKeywords(Object keywords, String errorMessage) throws ViewParameterException {

		if (!(keywords instanceof String))
		{
		    throw new ViewParameterException(errorMessage);
		}

		String[] keyword = ((String) keywords).split(",");
		for (int i = 0; i < keyword.length; i++)
		{
		    String keywordText = keyword[i].toLowerCase().trim();
		    if (keywordText.length() == 0)
		    {
		        continue;
		    }
		    if (keywordText.equals(FORCE_UPDATE_KEYWORD))
		    {
		        isForceUpdate = true;
		    }
		    else if (keywordText.equals(START_EAGER_KEYWORD))
		    {
		        isForceUpdate = true;
		        isStartEager = true;
		    }
		    else
		    {
		        String keywordRange = FORCE_UPDATE_KEYWORD + "," + START_EAGER_KEYWORD;
		        throw new ViewParameterException("Time-length-combination view encountered an invalid keyword '" + keywordText + "', valid control keywords are: " + keywordRange);
		    }
		}
	}
}
