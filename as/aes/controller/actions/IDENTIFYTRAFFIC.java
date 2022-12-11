package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;
import java.lang.Float;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'IdentifyTraffic' (specified as ACTION ASSL tier).
 */
public class IDENTIFYTRAFFIC
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'IDENTIFYTRAFFIC' class.
	 */
	static private IDENTIFYTRAFFIC oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Action parameter.
	 */
	protected String TAG = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Action parameter.
	 */
	protected Float PROTOCOLNUM = null;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  IDENTIFYTRAFFIC (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'IDENTIFYTRAFFIC' class.
	 */
	static public IDENTIFYTRAFFIC getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new IDENTIFYTRAFFIC();
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
		bResult =  generatedbyassl.as.aes.controller.aeself_management.self_configuring.INIDENTIFYTRAFFICTYPE.getInstance().isFluentInitiated()  ;
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
		generatedbyassl.as.aes.controller.aeip.managed_elements.MONITORINGTOOL.getInstance().CHECKHEADER(  );
		if (  generatedbyassl.as.aes.controller.actions.IDENTIFYTRAFFIC.getInstance().PROTOCOLNUM  ==  6  ) 
		{
			generatedbyassl.as.aes.controller.actions.IDENTIFYTRAFFIC.getInstance().TAG = "vid" ;
			generatedbyassl.as.AUTONOMICNETWORK.getInstance().VIDTAG = "VidTag" ;
		}
		else if (  generatedbyassl.as.aes.controller.actions.IDENTIFYTRAFFIC.getInstance().PROTOCOLNUM  ==  17  ) 
		{
			generatedbyassl.as.aes.controller.actions.IDENTIFYTRAFFIC.getInstance().TAG = "voice" ;
			generatedbyassl.as.AUTONOMICNETWORK.getInstance().VOICETAG = "VoiceTag" ;
		}
		else if (  generatedbyassl.as.aes.controller.actions.IDENTIFYTRAFFIC.getInstance().PROTOCOLNUM  ==  27  ) 
		{
			generatedbyassl.as.aes.controller.actions.IDENTIFYTRAFFIC.getInstance().TAG = "data" ;
			generatedbyassl.as.AUTONOMICNETWORK.getInstance().DATATAG = "dataTag" ;
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.controller.events.TRAFFICIDENTIFIED.getInstance().triggerEvent();
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the action (performs with default arguments).
	 */
	public synchronized void perform (  )
	{
		//**** Calls perform() with arguments by default.
		//**** If needed, change the arguments by default with appropriate ones.
		//****************************************************
		perform("", "0");
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the action.
	 */
	public synchronized void perform ( String TAG, String pPROTOCOLNUM )
	{
		this.TAG = TAG;
		try
		{
			PROTOCOLNUM = new Float( pPROTOCOLNUM );
		}
		catch ( Exception ex ) 
		{
			PROTOCOLNUM = new Float(0);
		}
		super.perform();
	}

}