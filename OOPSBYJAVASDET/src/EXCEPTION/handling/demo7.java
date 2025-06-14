/*
 * checekd exception:
 * -------------------
 * the exception which are identified by the java compiler.
 * ex:
 * 1)InterupteException
 * 2)file not found Exception
 * 
 * Checked exception handling in two ways:
 * ----------------------------------------------------
 * 1)using try and catch
 * 2)using throws keyword
 * 
 * 
 * 
 */

package EXCEPTION.handling;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program started ");
		System.out.println("progarm in progress");
		
		
		try
		{
		Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("");
		}
		
		System.out.println("program finished.................");
		System.out.println("program existed..........");

	}

}
