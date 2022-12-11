package generatedbyassl.as.aes.controller.aeip.managed_elements;

import java.io.Serializable;
import generatedbyassl.as.ASSLMANAGED_ELEMENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'monitoringTool' (specified as MANAGED_ELEMENT ASSL tier).
 */
public class MONITORINGTOOL
	extends ASSLMANAGED_ELEMENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MONITORINGTOOL' class.
	 */
	static private MONITORINGTOOL oInstance = null;
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
	private  MONITORINGTOOL (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MONITORINGTOOL' class.
	 */
	static public MONITORINGTOOL getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MONITORINGTOOL();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void CHECKHEADER (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void GETCOS (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void CHECKSOURCE (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void CHECKDESTINATION (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void DEVICEADDRESS (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void CHECKBANDWIDTH (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void MONITORQOS (  )
	{
		//**** Implement this method.
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Management element interface function.
	 */
	public void REPORTPERFORMANCERATE (  )
	{
		//**** Implement this method.
	}

}