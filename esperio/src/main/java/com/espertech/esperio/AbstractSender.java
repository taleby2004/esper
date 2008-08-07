package com.espertech.esperio;

import java.util.Map;

import com.espertech.esper.client.EPRuntime;

public abstract class AbstractSender {
	
	protected EPRuntime runtime;
	
	public void setRuntime(EPRuntime runtime) {
		this.runtime = runtime;
	}

	public abstract void sendEvent(AbstractSendableEvent event, Object beanToSend);
	public abstract void sendEvent(AbstractSendableEvent event, Map mapToSend, String eventTypeAlias);
	public abstract void onFinish();
}
