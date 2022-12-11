package generatedbyassl.as.aes.goldlevelsubscriber.controlloop;

import generatedbyassl.as.controlloop.ASSLANALYZER;
import generatedbyassl.as.ASSLMETRIC;
import generatedbyassl.as.ASSLSLO;

/**
 * Generated by ASSL Framework
 * 
 * This is the analyzer class of the goldlevelsubscriber's control loop. An instance of this class participates in the monitor-analyzer-simulator-executor control loop of goldlevelsubscriber.
 */
public class GOLDLEVELSUBSCRIBER_ASSLANALYZER
	extends ASSLANALYZER
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * The superclass ASSLANALYZER makes this class fully operational but not functional. Complete the methods below.
	 */

	/**
	 * Generated by ASSL Framework
	 * 
	 * Evaluates the invalid metric to find appropriate actions to fix the problem.
	 */
	public boolean analyze ( ASSLMETRIC poMetric )
	{
		//**** This method overrides the superclass's method.
		//**** Complete the method to find (where it is possible) 'problem-solving' actions for the invalid metric.
		//**** Each 'problem-solving' action must be added to the 'ACTIONS' vector declared in the superclass.
		//**** If the needed 'problem-solving' actions have been found then return 'true' else 'false'.
		return false;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Evaluates the unsatisfied SLO to find appropriate actions to fix the problem.
	 */
	public boolean analyze ( ASSLSLO poSLO )
	{
		//**** This method overrides the superclass's method.
		//**** Complete the method to find (where it is possible) 'problem-solving' actions for the unsatisfied SLO.
		//**** Each 'problem-solving' action must be added to the 'ACTIONS' vector declared in the superclass.
		//**** If the needed 'problem-solving' actions have been found then return 'true' else 'false'.
		return false;
	}

}