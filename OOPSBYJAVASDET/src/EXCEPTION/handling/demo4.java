/*
 * single try block with multiple catch block
 * 
 * one try can have n type of catch blocks.
 * 
 * 
 * limitation sof one tr and multiple catch:
 * ---------------------------------------------------
 * 1)code size increses.
 * 2)if exception not there in all catches.
 */
package EXCEPTION.handling;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program is started");
		
		String s=null;
		
		try
		{
		System.out.println(s.length());//null point exception
		}
		//if we donot known 
		catch(ArithmeticException e)
		{
			System.out.println("handeled exception");
			System.out.println(e.getMessage()); // this method give detailed info about exception
		}
		catch(NumberFormatException e)
		{
			System.out.println("handeled exception");
			System.out.println(e.getMessage());	
		}
		catch(NullPointerException e)
		{
			System.out.println("handeled exception");
			System.out.println(e.getMessage());
		}
               System.out.println("program finsihed");
	}

}
