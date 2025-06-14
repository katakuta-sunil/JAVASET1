/*
 * )FOR static variables JVM will provide default values and we are not required to perform intialization
 *   explicitly.
 * 2)JVM will provide default values explicitly.
 * 
 * 3)staicVaribles also known as class level variables or fields.
 *   
 */

package VARIBLES.VARIABLES;

public class demo4 {

	static int x;
	static double d;
	static String s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo4 b=new demo4();
		
		System.out.println(x);
		System.out.println(d);
		System.out.println(s);
		

	}

}

