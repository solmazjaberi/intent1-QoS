package generatedbyassl.as.aes.goldlevelsubscriber.aeself_management;

import java.io.Serializable;
import generatedbyassl.as.ASSLPOLICY;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'QoSGold' (specified as POLICY ASSL tier).
 */
public class QOSGOLD
	extends ASSLPOLICY
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'QOSGOLD' class.
	 */
	static private QOSGOLD oInstance = null;
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
	private  QOSGOLD (  )
	{
		vFluents.put( "INQOSGOLD", generatedbyassl.as.aes.goldlevelsubscriber.aeself_management.qosgold.INQOSGOLD.getInstance() );
		vFluents.put( "INMONITORINGQOSGOLD", generatedbyassl.as.aes.goldlevelsubscriber.aeself_management.qosgold.INMONITORINGQOSGOLD.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'QOSGOLD' class.
	 */
	static public QOSGOLD getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new QOSGOLD();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * For each specified MAPPING, checks if the MAPPING conditions are fulfilled and if so spawn a thread to perform the MAPPING actions.
	 */
	public synchronized void doAllMappings (  )
	{
		//************************ MAPPING ***********************
		if ( generatedbyassl.as.aes.goldlevelsubscriber.aeself_management.qosgold.INQOSGOLD.getInstance().isFluentInitiated() ) 
		{
			//**** runs a thread that performs the actions mapped to these fluents
			Runnable actionsRunner = new Runnable()
			{
				/**
				 * Generated by ASSL Framework
				 * 
				 * This method runs the mapping thread until all the mapped actions have been performed.
				 */
				public void run (  )
				{
					try
					{
						generatedbyassl.as.aes.goldlevelsubscriber.actions.QOSGOLD.getInstance().perform(  );
					}
					catch ( Exception ex ) 
					{
						System.err.println( ex.getMessage() );
					}
				}

			};
			//**** creates and starts the thread if the latter is not currently running
			if ( !isMappingRunning( "INQOSGOLD" ) ) 
			{
				Thread runActions = new Thread(thrdgrMappings, actionsRunner, "INQOSGOLD");
				runActions.start();
			}
		}
		//************************ MAPPING ***********************
		if ( generatedbyassl.as.aes.goldlevelsubscriber.aeself_management.qosgold.INMONITORINGQOSGOLD.getInstance().isFluentInitiated() ) 
		{
			//**** runs a thread that performs the actions mapped to these fluents
			Runnable actionsRunner = new Runnable()
			{
				/**
				 * Generated by ASSL Framework
				 * 
				 * This method runs the mapping thread until all the mapped actions have been performed.
				 */
				public void run (  )
				{
					try
					{
						generatedbyassl.as.aes.goldlevelsubscriber.actions.MONITORQOSGOLD.getInstance().perform(  );
					}
					catch ( Exception ex ) 
					{
						System.err.println( ex.getMessage() );
					}
				}

			};
			//**** creates and starts the thread if the latter is not currently running
			if ( !isMappingRunning( "INMONITORINGQOSGOLD" ) ) 
			{
				Thread runActions = new Thread(thrdgrMappings, actionsRunner, "INMONITORINGQOSGOLD");
				runActions.start();
			}
		}
	}

}