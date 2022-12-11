package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'classifyPackets' (specified as ACTION ASSL tier).
 */
public class CLASSIFYPACKETS
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'CLASSIFYPACKETS' class.
	 */
	static private CLASSIFYPACKETS oInstance = null;
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
	private  CLASSIFYPACKETS (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'CLASSIFYPACKETS' class.
	 */
	static public CLASSIFYPACKETS getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new CLASSIFYPACKETS();
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
		bResult =  generatedbyassl.as.aes.controller.aeself_management.self_configuring.INCLASSIFICATION.getInstance().isFluentInitiated()  ;
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
		if (  generatedbyassl.as.AUTONOMICNETWORK.getInstance().VIDTAG  ==  "VidTag"  ) 
		{
			generatedbyassl.as.aes.controller.actions.CREATEVIDACL.getInstance().perform(  );
			//generatedbyassl.as.aes.controller.metrics.COS.getInstance().VALUE = 4 ;
		}
		else if (  generatedbyassl.as.AUTONOMICNETWORK.getInstance().VOICETAG  ==  "VoiceTag"  ) 
		{
			generatedbyassl.as.aes.controller.actions.CREATEVOICEACL.getInstance().perform(  );
			//generatedbyassl.as.aes.controller.metrics.COS.getInstance().VALUE = 5 ;
		}
		else if (  generatedbyassl.as.AUTONOMICNETWORK.getInstance().DATATAG  ==  "dataTag"  ) 
		{
			generatedbyassl.as.aes.controller.actions.CREATEDATAACL.getInstance().perform(  );
			//generatedbyassl.as.aes.controller.metrics.COS.getInstance().VALUE = 1 ;
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.controller.events.CLASSIFICATIONDONE.getInstance().triggerEvent();
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is not successfully performed.
	 */
	public void ONERR_TRIGGERS (  )
	{
		generatedbyassl.as.aes.controller.events.DEFAULTOPTION.getInstance().triggerEvent();
	}

}