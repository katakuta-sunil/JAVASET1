/*
 * FINAL KEYWORD:
 * -------------]
 * final keyword appiled to the varibles,methods and classes.
 * 
 * "final keyword malkes mutable to unmutable".
 * ---------------------------------
 * 1)Varibles-we cannot change the value of the variable.
 * 2)methods-we cannot override those methods in  child classes.
 * 3)class-we cannot extends the class.
 * --------------------------------------
 * 
 * 
1) In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.

Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,

  i)the final variable cannot be reinitialized with another value
  ii)the final method cannot be overridden
  iii)the final class cannot be extended
  --------------------------------------------------------
  the values of the varibles are same among different object then make that varibles as static.
  
  static object make single copy .
  instance  varibles has every obejct has 
 */
package OVERRIDE.JAVA;

class Test
{
	int x=100;
	final int y=900; //value of the variable cannot change.
	
	
}
public class FINALKEYWPORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test a=new Test();
		a.x=19; //change the value of the varible we can change
		System.out.println(a.x);
		
		//if we apply final keyword on a varible we cannot change the value of a varible. 
		//a.y=99; //error we cannot change the value.
		System.out.println(a.y);

	}

}
