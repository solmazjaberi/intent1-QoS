package generatedbyassl.as.asip.channels;

import java.io.Serializable;
import generatedbyassl.as.ASSLCHANNEL;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'PUBLIC_LINK' (specified as CHANNEL ASSL tier).
 */
public class PUBLIC_LINK
	extends ASSLCHANNEL
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'PUBLIC_LINK' class.
	 */
	static private PUBLIC_LINK oInstance = null;
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
	private  PUBLIC_LINK (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'PUBLIC_LINK' class.
	 */
	static public PUBLIC_LINK getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new PUBLIC_LINK();
		}
		return oInstance;
	}

}