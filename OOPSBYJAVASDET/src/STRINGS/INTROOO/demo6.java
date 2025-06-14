/*
 * intern()=====>it will add to the constant to SCP.
 * ----------------------------------------------
 * WHAT IS THREADSAFE?
 * ---------------
 * Thread safety in Java refers to the property of a program or system where 
 * it can handle multiple threads concurrently without causing data corruption 
 * or race conditions or unexpected behavior.
 * 
 * ------------------------------------------------------------------------
 * 
 * 	STRINGBUFFER VS STRINGBUILDER
 * --------------------------------------------
 11)StringBuffer is synchronized. This means that multiple threads cannot call the 
 methods of StringBuffer simultaneously.
 2)StringBuilder is asynchronized.
  This means that multiple threads can call the methods of StringBuilder simultaneously.
 3)Due to synchronization, StringBuffer is called a thread safe class.	
 4)Due to its asynchronous nature, StringBuilder is not a thread safe class.
 5)StringBuffer is slow (program execute slowly beacuse threas safety)
   and stringbuilder is fast(beacuse no thread safetly).
 6)Stringbuffer introduced in  1.6   string bulder in 1.8
 7)Stringbuffer is less efficient and stringBuilder is more efficient.
   
 * --------------------------------------------------------------------------------------
 * STRING VS STRINGFBUFFER VS STRINGBUILDER
 * ------------------------------------------
 * 1)String---->Immutable object---we cannot change the value.
 * 
 * String str="welcome"; mapping to scp
 * 
 * str="swaroop"; //str is mappd to different constnat
 * str=-"nadella";
 * str="javastring";
 *every time new string is mapped and  old string is not released.
 * 
 * 2)StringBuffer and StringBuilder ====>mutable====>we can change the values.
 * 
 * String buffer and stringBuilder are more memory efficiint.
 * MORE EFFICIENT IN MEMEORY UTLIZATION THAN STRINGS.
 * 
 * 
 * 3)StringBuffer is Synchronized 
 * Synhronized means thread safe.
 * 
 * 
 * 4)StringBuilder is not synchronized.  (not thread safe)
 * 
 * 
 */


package STRINGS.INTROOO;

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------------------------");
		
		//intern() method:it will map the constant to the SCP.
		//it will add the to the constant to the SCP.
		
		String s1="swaroop";//scp
		String s2="swaroop";//scp
		String s3=new String("swaroopNandella");//heap memeory -->outside SCP
		
		System.out.println(s3);
		String s4=s3.intern();//it will add cosntant to the SCP.
		
		System.out.println(s4);
		

	}

}
