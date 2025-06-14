/*
 * WAP TO COUNT OCCURENCE OF A GIVEN CAHARCTER?
 * count the occurence?
 * ------------------
 * 1)String str="java string example";
 * 
 * 

 */


package STRINGS.INTROOO;

public class demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Java Strings Example";
		
		int len=str.length();
		System.out.println(len);
		
		int temp=str.replace("a","").length(); //where ever a is there replace with null
		
		System.out.println(temp);
		
		int count=len-temp; //this will count of a occurences
		
		System.out.println("a occurence is" + count);
	
		
		//logic-2
	//	remove specifuc word
		
		String s="ssuunniiaaaaaa";
		
		int l=s.length();
		
		s=s.replace("a","");
		
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
