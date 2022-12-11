package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;
import java.lang.Float;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'EvaluateQoS' (specified as ACTION ASSL tier).
 */
public class EVALUATEQOS
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'EVALUATEQOS' class.
	 */
	static private EVALUATEQOS oInstance = null;
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
	public Float PERFORMANCERATE = new Float(0);

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  EVALUATEQOS (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'EVALUATEQOS' class.
	 */
	static public EVALUATEQOS getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new EVALUATEQOS();
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
		bResult =  generatedbyassl.as.aes.controller.aeself_management.self_configuring.INEVALUATION.getInstance().isFluentInitiated()  ;
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
		generatedbyassl.as.aes.controller.aeip.managed_elements.MONITORINGTOOL.getInstance().MONITORQOS(  );
		generatedbyassl.as.asip.functions.SENDMONITORINGMSG.getInstance().perform(  );
		generatedbyassl.as.aes.controller.aeip.managed_elements.MONITORINGTOOL.getInstance().REPORTPERFORMANCERATE(  );
		generatedbyassl.as.aes.controller.actions.EVALUATEQOS.getInstance().PERFORMANCERATE = new Float(   );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.controller.events.EVALUATIONDONE.getInstance().triggerEvent();
	}

}