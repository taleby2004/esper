package net.esper.csv;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.TreeMap;

import junit.framework.TestCase;

public class TestCSVTimer extends TestCase
{
	private final Map<Integer, List<Long>> callbackTimes = new TreeMap<Integer, List<Long>>();
	private Long startTime;
	
	public void testStart() throws Exception
	{
		CSVTimer timer = new CSVTimer();
		
		// Schedule two timer normal timer tasks
		timer.schedule(new TestTimerTask(1), 40);
		timer.schedule(new TestTimerTask(2), 60);
		
		timer.start();
		Thread.sleep(200);
		
		// TODO Check when each timer task executed
		// System.out.println(callbackTimes);
	}
	
	private class TestTimerTask extends TimerTask
	{
		private final int ident;
		
		public TestTimerTask(int ident)
		{
			this.ident = ident;
		}
		
		public void run()
		{
			long currentTime = System.currentTimeMillis();
			if(startTime == null)
			{
				startTime = currentTime;
			}

			Long callbackTime = System.currentTimeMillis() - startTime;
			List<Long> previousCallbacks = callbackTimes.get(ident);
			if(previousCallbacks == null)
			{
				previousCallbacks = new ArrayList<Long>();
			}
			previousCallbacks.add(callbackTime);
			callbackTimes.put(ident, previousCallbacks);
		}
	}
}
