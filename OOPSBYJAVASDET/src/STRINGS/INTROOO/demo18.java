/*
 * WAP EACH WORD OF A STRING?
 * 
 * STRING STR="SWAROOP NADELLA ACADEMY";
 * 
 * OUTPUT STRING: POORAWS ALLEDAN  YMEDACA
 */


package STRINGS.INTROOO;

public class demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse each word in  a string

		String str="sunil academy nellore";
		
		//split method return array of strings
		
		String a[]=str.split(" ");  //three strngs genersted
		
		String emptystring="";
		
		
		for(String s:a)
		{
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);    //reverse each word chat by char
				
			}
			emptystring=emptystring+rev+" ";
		}
		System.out.println(emptystring);
		
		
	}

}
