/*
 * Generate random numbers and strings:
 * ---------------------------------------------
 * we use library called 
 */


package STRINGS.INTROOO;

import java.util.Random;

public class demo8 {

	private static final String RandomStringUtils = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach1:random inbuilt class in java
		
		Random ran=new Random();
		
		int a=ran.nextInt(10);//it generate random numbers between o to 9
		System.out.println(a);
		
		
		int b=ran.nextInt(100); //0 - 99
		System.out.println(b);
		
		int c=ran.nextDouble();
		System.out.println(c);
		
		//Appriach2: Math.random();
		
		
	   System.out.println(Math.random());  //o.o to 1.0 decimal value  //it dispalys value between o to 1
	   
	   
	   
	   
	   //apparoach:3
	   
 //  String  num=RandomStringUtils.randomNumeric(5);
	 //  System.out.println();
	   
	   
	   

		
		
		

	}

}
