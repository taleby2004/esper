package com.espertech.esperio;

import java.util.Map;

/**
 * Sender that sends without a threadpool.
 */
public class DirectSender extends AbstractSender {

	public void sendEvent(AbstractSendableEvent event, Object beanToSend) {
		runtime.sendEvent(beanToSend);
	}

	public void sendEvent(AbstractSendableEvent event, Map mapToSend, String eventTypeAlias) {
		runtime.sendEvent(mapToSend, eventTypeAlias);
	}

	public void onFinish() {
		// do nothing
	}
}
