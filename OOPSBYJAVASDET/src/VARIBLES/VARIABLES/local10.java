/*
 * if we are not declaring with any modofier then by default it is default.
 * but this rule is applicable only for instance and static varible but not for local varibles.
 * 
 * 2)CONCLUSION:
 * --------------------------------
 *  i)For instance and static varibles JVM will provide default values and we are not required to provide
 *  intialization explicitly and but local varibles JVM  will not provide default values complusory
 *  we should perform intialization explicitly before using the varible.
 *  
 *  ii)Instance varible is the part of object this  s object (copy)can be accessed by multiple threads 
 *  then instance varibles is not thread safetly.
 *  
 *  iii)sttaic varible  can created single copy at class level that single copy can be accessed 
 *  by multiple threads  at a time then sttaic varibles is not  thread safetly.   
 *  
 *  
 *  IN static and instance variable a single copy of objects is maintained by all thread 
 *  
 *  multiple threads accessed by the single copy of object simultaneously.
 *  
 *  
 *  iv)Local variables  is thread safety  for every thread a separate copy of  object is maintained.
 *  
 * -----------------------------------------------------------------------
 *   TYPE OF VARIBLE                                 IS thread-safe?
 *  ----------------------------------------------------------------------------
 *  1.instance variable                             not thread safe
 *  
 *  2.static variables                               not thread safe
 *  
 *  
 *  3.local variables                            thread safe
 *    
 * -----------------------------------------------------------------------------
 * 
 *    
 *    
 *    
 *  
 *  
 */


package VARIBLES.VARIABLES;

public class local10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
