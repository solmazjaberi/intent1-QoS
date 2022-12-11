package generatedbyassl.as.aes.controller.aeself_management.self_configuring;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inQoSGoldSetting' (specified as FLUENT ASSL tier).
 */
public class INQOSGOLDSETTING
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INQOSGOLDSETTING' class.
	 */
	static private INQOSGOLDSETTING oInstance = null;
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
	private  INQOSGOLDSETTING (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.controller.events.EVALUATIONDONE.getInstance() );
		generatedbyassl.as.aes.controller.events.EVALUATIONDONE.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.controller.events.QOSGOLDSET.getInstance() );
		generatedbyassl.as.aes.controller.events.QOSGOLDSET.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INQOSGOLDSETTING' class.
	 */
	static public INQOSGOLDSETTING getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INQOSGOLDSETTING();
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