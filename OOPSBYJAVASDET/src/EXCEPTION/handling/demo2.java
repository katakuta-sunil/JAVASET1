/*
 * exception handling:   (user mistake)  (giving invalid input).
 * ----------------
 * 1)exception is a unwanted event which will cause program termination.
 * 
 * 
 * 
 * ERRORS:
 * --------------
 *1)syntax errors   ==> we cannot execute program    (user's  mistake)
 * 2)logical errors   ==>program will execute output  will not expected. 
 * 
 * "SYNTAX ND LOGICAL ERRORS CAUSE BECAUSE OF DEVELOPERS MISTAKE".
 * 
 * errors are devlopers mistakes.
 * 
 * EXCEPTION ARE USERS MISTAKE.
 * 
 * ---------------------------------------------------------------------------------------------------------------
 * TYPES OF EXCEPTION IN JAVA:
 * -------------------------
 * 1)checked exception: exceptions identified by the java compiler.
 * ex:filenotfound
 * IOEXCEPTION
 * INTERUPTEXCEPTION
 * 
 * 2)unchecked exception:
 * The exceptions are not identified by the java compiler.
 * 
 * EX:arthmeticEXCEPTION
 * 2)NULLPOINTEXCEPTION.
 * 
 * ----------------------
 * CHECKED EXCEPTION ARE VERY ESAY TO HANDLIE
 * UNCHECKED EXCEPTION HARD TO HANDLE.
 * ------------------------------------------------------------------------------------
 * 1)ARTHIMETIC EXCEPTION: IF ANY NUMBER DIVIDED BY ZERO ARTHMETIC EXCEPTION ENCOUNTERED.
 *   ex: 233/0 =arthmetic exception
 *   
 * 2)
 */
package EXCEPTION.handling;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program is started");
		
		Scanner b=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=b.nextInt();
		//EX:1 ARTHIMETIC EXCETION
		System.out.println(100/num);  //arthimetic exception.
		
		//EX:2 array index out of bound exception
		int a[]=new int[5];
		
		System.out.println("enter position to enter(0-4) :");
		
		int pos=b.nextInt();
		
		System.out.println("enter a value : ");
		
		int val=b.nextInt();
		
		a[pos]=val; //arrayindex out of bound exception
		
		System.out.println(a[pos]);
		
		System.out.println("progarm is completed");
		System.out.println("program is exited");
		
		
		//example:3
		
		String s="12345";
		//convert integr tos tring
		
		int aa=Integer.parseInt(s);
		
		System.out.println(aa);
		
		
		String ss="welcome";  //NUMBER FORMAT EXCEPTION
		//we cannot convert  this string to the integer
		
		int num=Integer.parseInt(ss)
				
		
	//exam:3
    	String s="null";   //null is an unknown value.
		System.out.println(s.length()); //null point exception
		
		
		
		

	}

}
