/*
 * STRING PROGRAMS: FEB27/02/2025
 * -----------------------------------
 * String concepts with programs:
 * ---------------
 * 1)PALINDROME string
 * 
 * Reverse of the string
 * String str="swaroop";
 * 
 * Reverse of the string is not the same string.
 * 
 * String str1="madam";
 * reverse of the string is also same.
 * 
 * madam,racecar
 * 
 * 
 * 
 */



package STRINGS.INTROOO;

public class dpalindrome7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="madam";
		
		
		String rev="";  //empty string
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
		if(str.equals(rev))   //it comapare data
		{
			System.out.println("yes it is palindrome string : " +rev);
			
		}
		else
		{
			System.out.println("no it is not palindrom : "+rev);
		}
		
	}

}
