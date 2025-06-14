/*feb:26/02/2025
 * ---------------
 * Wrapper classes:What do you mean by wrapper class?
 * 
 * FOR EVERY primitive type corresponding wrapper class also used.
 * -----------------------------------------
AI Overview
Wrapper Class In Java:
---------------------
A wrapper class in Java is a class that represents a primitive data type as an object.
This allows you to use primitive data types in situations that require objects, like collections and generics.
 * ---------------------------------------------------------------------------------------------------------------
 * in java we can store data in two formats  1)primitive format   2)object format
 * 
 * 1)String s="welcome";    (primitive format)
 * 
 * String s=new String("welcome");  (object format)
 * 
 * int x=10;
 * 
 * integer x=new integer(10);
 * --------------------------------------------------------------
 * For every primitive datatype a wrapper class is available:
 * --------------------------------------------------
 * 1)
 * int-----Integer
 * float----Float
 * double---Double
 * char----Character
 * boolean----Boolean
 * ---------------------------------------------------------------------
 * USE OF WRAPPER:
 * -------------------
 * wrapper class convert data from one format to other format.
 * 
 * String price1="145";
 * String price2="120.5";
 * 
 * price1+price1
 * 
 * SCENARIO:1
 * ------------
 * if we want to convert string data to the decimal format:
 * 1)STRING --------------->int,double,boolean,char     (string to all primitive types)
 * 
 * 
 * 
 * 2)int,double,boolean,char---------->string              (convertion all primitive to string)
 * 
 * 
 * i)String---->int     Integer.parseInt(String value)   
 *   (it convert string to integer formar)
 *   parseInt is a static method
 * ii)String----->double                Double.parseDouble(String);   
 * iii)String------>bool              Boolean.parseBoolean(String);
 * iv)String to character   (is not possible)
 * ---------------------------------------------------------------------------
 * Advantages of Wrapper Classes
1.Collections allow only object data.
2.On object data we can call multiple methods compareTo(), equals(), toString()
3.The cloning process only works on objects
4.Object data allows null values.
5.Serialization allows only object data.

------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


package WRAPERCLASS.JAVA;

public class DEMO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//convertion of string to primitive datatypes
		//string to character is noot supported
		
		//1)String----->int
		String s="welcome";   //not possible to convert to integer
		
		String se="1234";
		int ss=Integer.parseInt(se);
		System.out.println(ss);
		
		
		//EX:2 String --->integer
		
		String q="10";
		String q1="20";
		System.out.println(q+q1);
		
		System.out.println(Integer.parseInt(q)+Integer.parseInt(q1));
		
		
		//EX:3  String---->double
		String d1 ="10.6";
		String d2 ="20.0";
		
	System.out.println(Double.parseDouble(d1)+Double.parseDouble(d2));
	
	
	//ex:4  string---->boolean
	//other than true if we pass any string it will return false
	String b1="selemium";
	System.out.println(Boolean.parseBoolean(b1));
	
	
		
	//primitive type to string type:
	//primitive to String format
	
	//int,double,bool,char------->String
	
	int a=10;
	double dd=10.7;
	char c='a';
	boolean ea= true;
	//using valueOf method we can convert any data
	//any datatype====>string()  use ValueOf
	//String.valueof()=====>convert all primitive data types to string format
	
	
	
	
	//int --->string
	   System.out.println(String.valueOf(a));
	   
	   
	   //double =====>string
	   String g=String.valueOf(dd);
	   System.out.println(g);
	   
	   
	   //char====>string
	   
	   String ch=String.valueOf(c);
	   System.out.println(ch);
	   
	   
	   //
	   String f=String.valueOf(ea);
	   System.out.println(f);
	   
		
		
		
		
		

	}

}
