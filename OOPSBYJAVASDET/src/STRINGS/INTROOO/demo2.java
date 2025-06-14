/*
 * STRINGS IN JAVA:   feb 26/02/2026
 * -------------------------
 * 
 * 
 * 
 * 1)String is a class and stringBuffer also a class.
 * 
 * 2)String is called immutable object StringBuffer and StringBuilder is mutable objects.
 * 
 * immutable -->we cannot change the value.  (String is immutable)
 * mutable-----> WE can change the value.(stringBuilder and StringBuffer)
 *
 * 3)
 */



package STRINGS.INTROOO;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		//reversing a string wiuthout using the inbuild method?
		
		
		
		String str="welcome";
		//there is no method like str.reverse(),in java string class
		
		//APPROCAH1:REVERSE THE STRING
		String sv="sunil";
		String rev=" "; //empty string
		//index start from 0    //sv.length()==>4   sv.length()-1==>4 it will extraxt 5
		for( int i=sv.length()-1;i>=0;i--)
		{
			rev=rev+sv.charAt(i);    
	
		}
		System.out.println("revered string is :" + rev);
		
		
		//APPROACH 2: Reverse a string
		
		String s="swaroopsunil";
		String re=" "; //empty string
		
	    char arr[]=s.toCharArray();  //string is converted to new character array
	    
	    for(int j=arr.length-1;j>=0;j--)
	    {
	    	re=re+arr[j];
	    	
	    }
	    System.out.println(re);
	
	  //approach3: using string builder
	    
		StringBuffer str2=new StringBuffer("bahubali");
	
		//StringBuilder str3="welcome";//not possible  //cannot convert from string to stringbulder.
		
		str2.reverse();
		System.out.println(str2);
		
		
		
		//approach: 4
		 //using StringBuilder
		
		StringBuilder aa=new StringBuilder("KALKI2342");
		
		aa.reverse();
      System.out.println(aa);
		
		
		
		 
		 
		
		
		
		
		
		
		
		

	}

}
