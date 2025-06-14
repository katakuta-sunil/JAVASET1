/*
 * HOW TO HANDLE EXCEPTION?
 * --------------------------------------
 * 1)using try and  catch and final keywords.
 * 
 * THE STATEMENT WHICH ARE GIVING EXCEPTIPON PUT IN TRY BLOCK.
 * 
 * -----------------------------------------------------------------------------------
 * What is try and catch in Java?
The Try Block of Try Catch in Java

A try block is the block of code (contains a set of statements) in which exceptions can occur; 
it's used to enclose the code that might throw an exception. 
The try block is always followed by a catch block, 
which handles the exception that occurs in the associated try block.

one try block can have "n" number of catches.
 * 
 * ==>
 */
package EXCEPTION.handling;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner bb=new Scanner(System.in);
		
		int a=bb.nextInt();
		
		try   //
		{
			System.out.println(100/a);
		}
		//if try block excutes only catch block executed
	    catch(ArithmeticException y)  //catch block handles if it is only if arithmetic exception
		{
			System.out.println("catchede arithmetic exception");
		}
		
		System.out.println("exception is handled. ");
		
		
		
		
	}

}
