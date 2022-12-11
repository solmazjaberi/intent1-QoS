package generatedbyassl.as.autonomicnetwork;

import java.io.Serializable;
import generatedbyassl.as.ASSLDEPENDENCY;
import generatedbyassl.as.ASSLGROUP;
import generatedbyassl.as.ASSLAE;
import java.util.Hashtable;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'ASARCHITECTURE' (specified as ASARCHITECTURE ASSL tier).
 */
public class ASARCHITECTURE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'ASARCHITECTURE' class.
	 */
	static private ASARCHITECTURE oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'AE name'-'AE reference' of all the autonomic elements specified by the AELIST clause of the ASARCHITECTURE tier.
	 */
	protected Hashtable<String, ASSLAE> AELIST = new Hashtable<String, ASSLAE>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'DEPENDENCY name'-'DEPENDENCY reference' of all the DEPENDENCYs specified by the DIRECT_DEPENDENCIES clause.
	 */
	protected Hashtable<String, ASSLDEPENDENCY> DIRECT_DEPENDENCIES = new Hashtable<String, ASSLDEPENDENCY>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'DEPENDENCY name'-'DEPENDENCY reference' of all the DEPENDENCYs specified by the TRANSITIVE_DEPENDENCIES clause.
	 */
	protected Hashtable<String, ASSLDEPENDENCY> TRANSITIVE_DEPENDENCIES = new Hashtable<String, ASSLDEPENDENCY>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'group name'-'group reference' of all the groups specified by ASARCHITECTURE.
	 */
	protected Hashtable<String, ASSLGROUP> GROUPS = new Hashtable<String, ASSLGROUP>();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  ASARCHITECTURE (  )
	{
		ASSLGROUP oGROUP = null;
		ASSLDEPENDENCY oDEPENDENCY = null;
		//**** adds AELIST
		AELIST.put( "GOLDLEVELSUBSCRIBER", generatedbyassl.as.aes.GOLDLEVELSUBSCRIBER.getInstance() );
		AELIST.put( "CONTROLLER", generatedbyassl.as.aes.CONTROLLER.getInstance() );
		//**** adds DIRECT_DEPENDENCIES
		oDEPENDENCY = new ASSLDEPENDENCY( "GOLDLEVELSUBSCRIBER" );
		oDEPENDENCY.addToDependency( "CONTROLLER", generatedbyassl.as.aes.CONTROLLER.getInstance() );
		DIRECT_DEPENDENCIES.put( "GOLDLEVELSUBSCRIBER", oDEPENDENCY );
		//**** adds TRANSITIVE_DEPENDENCIES
		oDEPENDENCY = new ASSLDEPENDENCY( "CONTROLLER" );
		oDEPENDENCY.addToDependency( "GOLDLEVELSUBSCRIBER", generatedbyassl.as.aes.GOLDLEVELSUBSCRIBER.getInstance() );
		TRANSITIVE_DEPENDENCIES.put( "CONTROLLER", oDEPENDENCY );
		//**** adds GROUPS
		oGROUP = new ASSLGROUP( "GOLDLEVEL" );
		oGROUP.addToMembers( "GOLDLEVELSUBSCRIBER", generatedbyassl.as.aes.GOLDLEVELSUBSCRIBER.getInstance() );
		oGROUP.addToMembers( "CONTROLLER", generatedbyassl.as.aes.CONTROLLER.getInstance() );
		oGROUP.addToCouncil( "CONTROLLER", generatedbyassl.as.aes.CONTROLLER.getInstance() );
		GROUPS.put( "GOLDLEVEL", oGROUP );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'ASARCHITECTURE' class.
	 */
	static public ASARCHITECTURE getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new ASARCHITECTURE();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to an AELIST member specified by name.
	 */
	public ASSLAE getAELISTMember ( String psAEName )
	{
		return AELIST.get(psAEName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a direct DEPENDENCY  specified by name.
	 */
	public ASSLDEPENDENCY getDirectDependency ( String psDependencyName )
	{
		return DIRECT_DEPENDENCIES.get(psDependencyName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a transitive DEPENDENCY  specified by name.
	 */
	public ASSLDEPENDENCY getTransitiveDependency ( String psDependencyName )
	{
		return TRANSITIVE_DEPENDENCIES.get(psDependencyName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a group specified by name.
	 */
	public ASSLGROUP getGroup ( String psGroupName )
	{
		return GROUPS.get(psGroupName);
	}

}