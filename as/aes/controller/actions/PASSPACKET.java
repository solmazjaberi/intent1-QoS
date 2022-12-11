package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'PassPacket' (specified as ACTION ASSL tier).
 */
public class PASSPACKET
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'PASSPACKET' class.
	 */
	static private PASSPACKET oInstance = null;
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
	private  PASSPACKET (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'PASSPACKET' class.
	 */
	static public PASSPACKET getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new PASSPACKET();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be ensured at the end of the action execution.
	 */
	public boolean ENSURES (  )
	{
		boolean bResult = true;
		bResult =  generatedbyassl.as.aes.controller.events.PASSED.getInstance().isPrompted()  ;
		return bResult;
	}

}