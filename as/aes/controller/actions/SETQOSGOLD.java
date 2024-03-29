package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;
import java.lang.Boolean;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'setQoSGold' (specified as ACTION ASSL tier).
 */
public class SETQOSGOLD
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'SETQOSGOLD' class.
	 */
	static private SETQOSGOLD oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a variable/collection specified in the ASSL specification.
	 */
	public Boolean HIGHPERFORMANCE = Boolean.FALSE;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  SETQOSGOLD (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'SETQOSGOLD' class.
	 */
	static public SETQOSGOLD getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new SETQOSGOLD();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be fulfilled before processing the action.
	 */
	public boolean GUARDS (  )
	{
		boolean bResult = true;
		bResult =  generatedbyassl.as.aes.controller.aeself_management.self_configuring.INQOSGOLDSETTING.getInstance().isFluentInitiated()  ;
		return bResult;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the action if the GURADS conditions are fulfilled.
	 */
	public void DOES (  )
	{
		super.DOES();
		generatedbyassl.as.aes.controller.actions.SETQOSGOLD.getInstance().HIGHPERFORMANCE = true ;
		generatedbyassl.as.aes.controller.aeip.functions.SENDMSGQOSGOLD.getInstance().perform(  );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		if (  (  !  generatedbyassl.as.aes.controller.actions.SETQOSGOLD.getInstance().HIGHPERFORMANCE  )  ) 
		{
			generatedbyassl.as.aes.controller.events.TIMETORECONFIGURE.getInstance().triggerEvent();
		}
	}

}