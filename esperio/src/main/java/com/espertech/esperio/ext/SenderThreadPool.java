package com.espertech.esperio.ext;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.espertech.esperio.DirectSender;

/**
 * Implementation of Sender to send to esper engine using a thread pool
 * @author Jerry Shea
 */
public class SenderThreadPool extends DirectSender {

	private ExecutorService executorService;

    /**
     * Ctor.
     * @param threadPoolSize size of pool
     */
    public SenderThreadPool(int threadPoolSize) {
		executorService = Executors.newFixedThreadPool(threadPoolSize);
	}

    /**
     * Ctor.
     * @param executorService threadpool to use
     */
    public SenderThreadPool(ExecutorService executorService) {
        this.executorService = executorService;
    }

    /**
     * Send an event.
     * @param beanToSend event to send
     */
    public void sendEvent(final Object beanToSend) {
		executorService.execute(new Runnable() {
			public void run() {
				runtime.sendEvent(beanToSend);
			}
		});
	}

    /**
     * Send an event.
     * @param mapToSend event to send
     * @param eventTypeAlias alias of event
     */
    public void sendEvent(final Map mapToSend, final String eventTypeAlias) {
		executorService.execute(new Runnable() {
			public void run() {
				runtime.sendEvent(mapToSend, eventTypeAlias);
			}
		});
	}
}
