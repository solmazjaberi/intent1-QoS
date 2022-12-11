package generatedbyassl.as.aes.goldlevelsubscriber.aeself_management.qosgold;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inMonitoringQoSGold' (specified as FLUENT ASSL tier).
 */
public class INMONITORINGQOSGOLD
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INMONITORINGQOSGOLD' class.
	 */
	static private INMONITORINGQOSGOLD oInstance = null;
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
	private  INMONITORINGQOSGOLD (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.goldlevelsubscriber.events.QOSINITIATED.getInstance() );
		generatedbyassl.as.aes.goldlevelsubscriber.events.QOSINITIATED.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.goldlevelsubscriber.events.QOSGOLDMONITORED.getInstance() );
		generatedbyassl.as.aes.goldlevelsubscriber.events.QOSGOLDMONITORED.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INMONITORINGQOSGOLD' class.
	 */
	static public INMONITORINGQOSGOLD getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INMONITORINGQOSGOLD();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}