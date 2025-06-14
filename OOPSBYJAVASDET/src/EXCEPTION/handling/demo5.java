/*
 * instead of writing multiple catch block write only single catch block.
 * try and catch block used to handled exception.
 * 
 * finally block:
 * --------------------
 * finally block always followed by the catch block.
 * finally block statements always executed irrrespective of exception.
 * 
 * case1:
 * ---------
 * 1)exception occured,catch block handled---------->finally block execute.
 * 
 * 2)exception occured,catch block NOT handled----->finally block will execute.
 * 
 * 
 * 3)exception  doesnot  occured  catch block is ignored,---------->finally block execute.
 * 
 * FINALLY BLOCK ALWAYS EXECUTE IRRESPECTIVE OF EXCEPTION.
 * 
 * ALL THE STATEMNTS IN THE FIANLLY BLOCK ALWAYS EXECUTES.
 * 
 * 
 * 
 * --------------------------------------
 * WHY WE USE FINALLY BLOCK?
 * -------------------------
 * finally is a optional block.
 * 
 * 
 * 
 * 
 * 
 */
package EXCEPTION.handling;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      System.out.println("program is started");
		
		String s=null;
		
		try
		{
		System.out.println(s.length());//null point exception
		}
		//single catch
		catch(Exception e)  //exception is a super class  aruthmetic,null all are derived from exception
		{
			System.out.println("handled");
			System.out.println(e.getMessage());  //get msg describe about
			
			
			
		}
		

	}

}
