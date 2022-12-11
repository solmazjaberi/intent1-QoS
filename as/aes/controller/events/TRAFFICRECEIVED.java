package generatedbyassl.as.aes.controller.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'TrafficReceived' (specified as EVENT ASSL tier).
 */
public class TRAFFICRECEIVED
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'TRAFFICRECEIVED' class.
	 */
	static private TRAFFICRECEIVED oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  TRAFFICRECEIVED (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'TRAFFICRECEIVED' class.
	 */
	static public TRAFFICRECEIVED getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new TRAFFICRECEIVED();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Initialises the event after the system has been started.
	 */
	public synchronized void postStartInit (  )
	{
		generatedbyassl.as.aes.controller.events.TRAFFICIDENTIFIED.getInstance().addEventCatcher(this);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
		//**** triggers the event if the event conditions are satisfied
		if (  isEventOccurred(generatedbyassl.as.aes.controller.events.TRAFFICIDENTIFIED.getInstance())  ) 
		{
			triggerEvent();
		}
		vOccurredEvents.clear();
		vReceivedMessages.clear();
		vSentMessages.clear();
	}

}