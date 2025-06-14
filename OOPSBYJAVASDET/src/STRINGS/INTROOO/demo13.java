/*
 * dev 28/02/2025
 * --------------------
 * Pnagram string:
 * 
 * 1)String all the alphabets from a to z  ==>26 alphabets
 * What is a pangram string?
A string is a pangram string if it contains all the character of the alphabets ignoring 
the case of the alphabets. Examples: Input: str = “Abcdefghijklmnopqrstuvwxyz” 
Output: Yes. Explanation: The given string contains all the letters from a to z (ignoring case)
 */



package STRINGS.INTROOO;

public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pangram string===> it contain all 26 alphabets
	int flag =1; //this is [p
		String str1="qwertyuioplkjhgfdsazxcvbnm";
	     str1=str1.toLowerCase();  //convert everything to lowercase
		if(str1.length()<26)
		{
		System.out.println(str1 + "is not pangram string");	
		}
		
		else
		{
			//pangram string
			//ascii cod
			for(char ch='a';ch<='z';ch++)  //ascii code
			{
				
				//indexOf() return -1 when there is no specific alpahbet
				//if one alphabet missing it returns "-1"
				if(str1.indexOf(ch)<0)
				{
					flag=0; //not a pangram string
				 //one alphabet missing then it is not a panagram.
					
				}
							
		      }
				
			if(flag==1)
			{
				System.out.println("it is a pangram string");
			}
			else
			{
				System.out.println("it is not a pngram string");
			}		

	}

}
}