/*
 * mutable vs immutable object:
 * --------------------------------
 * String is an imutable=====>we cannot change the value.
 * 
 * StringBuffer and StringBuiler=====> mutable objects-we can change  value in the memory.
 * ----------------------------------------------------------------------------
 * 1) StringBuffer vs StringBuilder ----->difference in terms of memeory
 * ----------------------------------------------------------------
 * =>STRINGBUFFER VS STRINGBUILDER
 *  Synchromized==>thread safetly.
 *  Asynchronized==>not thread safetly.
 * --------------------------------------------
 11)StringBuffer is synchronized. This means that multiple threads cannot call the 
 methods of StringBuffer simultaneously.
 2)StringBuilder is asynchronized.
  This means that multiple threads can call the methods of StringBuilder simultaneously.
 3)Due to synchronization, StringBuffer is called a thread safe class.	
 4)Due to its asynchronous nature, StringBuilder is not a thread safe class.
 5)StringBuffer is slow (program execute slowly beacuse thread safety)
   and stringbuilder is fast(beacuse no thread safetly).
 6)Stringbuffer introduced in  1.6   string builder in 1.8
 7)Stringbuffer is less efficient and stringBuilder is more efficient.
   PRESENT java version is java 21
 * =>
 * =>
 * --------------------------------------------------------------------------------------
 * 
 */



package STRINGS.INTROOO;

import java.util.Arrays;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {21,142,03,14,7895,32,1};
		
		System.out.println(Arrays.toString(arr));  //sorting happens in the memory
		
		 Arrays.sort(arr);  //sorting the array
		 
		System.out.println(Arrays.toString(arr));
		
		//immutable====>we cannot change value in the mmeory
		
		String str=new String("welcome");
		    str.concat("sunil");  //String is immutable
		    System.out.println(str);
		    
		    
		    String str2=str.concat("welome to ahva");
		    
		    System.out.println(str); //orginal  (we cannot change value in memory)
		    
		    System.out.println(str2); //concatenation
		    
		    
		    //mutable-->we can change value in the memory
		    
		    StringBuffer sb=new StringBuffer("welcome");
		    
		    sb.append("nellore is in ANDHRAPRADESH");
		    
		    System.out.println(sb);
		    
		    
		    //mutable--->we can change value in the memory
		    
		    StringBuilder sq=new StringBuilder("nellore");
		    sq.append("nellore is in ap");
		    
		    System.out.println(sq);
		    
		    
		    
		    
		

	}

}
