/*
 * both classes present in same package.
 */

package ACCESSMODIFIERS.PACAKES;

public class acess222 extends access111 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		access111 a=new access111();
		  a.m1(); //public method can be access anywhere
		  
		  //System.out.println(a.u);//private cannot access outside the  class
		  
		  acess222 aa=new acess222();
		  //protected variables/methods can access in child class with inheritance.
		  aa.s();
	}

}
