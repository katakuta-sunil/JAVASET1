/*
 * NOTE:
 * 1.)IT IS HIGHLY RECOMMENDED TO PERFORM INTIALIZATION FOR local variables  AT THE TIME OF DECLARATION.
 * 
 * 2)It is not recommended to perform intialization for local varibles inside local blocks
 *  because there is no gurantee for the execution of these blocks always at run time.
 *  
 *  
 */


package VARIBLES.VARIABLES;

public class local8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		if(args.length > 0)
		{
			x=10;
		}
		else
		{
			x=20;
		}
		//if not pass any command line argument then x value is 25 default.
		System.out.println(x);

	}

}

