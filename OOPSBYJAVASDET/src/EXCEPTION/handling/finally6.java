/*
 * finally block always come at the end of the catch block.
 * 
 */



package EXCEPTION.handling;

public class finally6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         System.out.println("program is started");
		
		String s = "no exception";
		
		try
		{
		System.out.println(s.length());//null point exception
		}
		catch(Exception e)
		{
			System.out.println("handles exception");
			System.out.println(e.getMessage());
		}
		
		finally
		{
	       System.out.println("irrrespective of the  result always execute the finally block");
		}

	}

}
