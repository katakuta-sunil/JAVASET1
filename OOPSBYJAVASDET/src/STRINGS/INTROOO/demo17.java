/*
 * COUNT NUMBER OF WORDS IN A STRING:
 * -------------------
 * 
 * Strings str="swar0op nadella academy";//3 words
 * 
 * 
 */

package STRINGS.INTROOO;

public class demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sunil tution acdemy  serr  u n i l";
	
		int count=1;//intialize with 1
		
		
		for(int i=0;i<str.length();i++)
		{
		   if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')  //' ' single space 
		   {
			  count++; 
		   }
			  
		}
		
		System.out.println(count);

	}

}
