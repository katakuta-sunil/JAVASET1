/*
 * WHat is ANAGRAM?  ==>both words can have same alphabets.
 * --------------------------------------------------------
 * String str = "slient";
 * 
 * String str1="listen";
 * 
 * anagram means both string can have same  words.
 * An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different. For example, "abcd" and "dabc" are an anagram of each other.
 * 
 * 
 * 
 */


package STRINGS.INTROOO;

import java.util.Arrays;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//whatv is anagram?
		//two string can have same alphabets  irrespective of order. 
		
		String str1="Slient";//6
		String str2="listen";//6
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
		//when lengths is match only then we perforn operation.
		
		
		if(str1.length()==str2.length())
		{
			//convert strings to char arrays
			char[] arr1=str1.toCharArray();
			
			char[] arr2=str2.toCharArray();
			Arrays.sort(arr1);//directly sorting happens in memory
			
			Arrays.sort(arr2);//directlt sorting happens in memeory
			
			boolean res=Arrays.equals(arr1,arr2);
			
			if(res)
			{
				System.out.println("they are anagram strings");
			}
			else
			{
				System.out.println("not anagram");
			}
			
			
			
			
			
		}
		else
		{
			System.out.println("str1 and str2 are not anagram" +str1 +" "+ str2);
		}
	}

}
