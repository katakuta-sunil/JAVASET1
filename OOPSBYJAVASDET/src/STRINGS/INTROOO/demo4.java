/*
 * 
 * NOTE: IN HEAP MEMORY VARIBLES ALLOCATES AT RUNTIME.
 * 
 * =>STRING STORED IN SPECIAL MEMEORY CALLED STRING CONSTANT POOL.
 * 
 *  SCP not allowed string duplicated
 * --------------------------------------------------------------
 * =>IN HEAP MEMORY ALL RUNTIME VARIBLES ARE STORED.
 * 
 * => IN HEAP MEMORY ALL RUNTIME VARIBLES ARE STORED.
 * 
 * SCP(string constant pool)==>when ever we creating values .
 * in string pool every thing has its maintained single copy.
 * 
 *" StringCosntantpool is not allowed duplicated and it always always allow unique values."
 *
 *When ever we creating value like String a="welcome"    every thing in string poll is allow one occurence.
 *
 *String consant pool is one of the part of the HEAP MEMORY.
 *
 *
 *
 *
 *
 * 
 * string s="sunilreddy";
 * string s1="sunilreddy";
 * in SCP single block only allocated if we declare more number of times.
 * 
 * 
 * 
 * if i created same string 10 times then stringconstantpool maintained only one copy.
 * --------------------------------------------------------------------------------------   
 * 
 */



package STRINGS.INTROOO;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SCP=====>STRING CONSTANT POOL
		//SCP not alloacted dupliactes.
		//in SCP only welcome memory alloctaed  (not for three times).
		
		//all three str1,str2,str3  point to the single loaction in SCP.
		String str1="welcome";  //immutable
		
		String str2="welcome";
		
		String str3="welcome";
		
		    //str1.append("aaas");//not possible beacsue once mmeory allocated in SCP  we cannot change.
		   str1="wel"; //it will start point to the another constant
		   
		   //if constant is already inn SCP its fine if not there means it will be created in  SCP.
		   //not updates in string constant pool
		   
		   System.out.println(str1);
		
		
		
		

	}

}
