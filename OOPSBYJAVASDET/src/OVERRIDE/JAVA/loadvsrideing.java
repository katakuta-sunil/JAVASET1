/*NOTE: OVERLOADING HAPPENS IN SAME CLASS.
 * OVERRIODING HAPPENS IN TWO CLASSES
 * 
 * void sum(); //declaration
 * 
 * void sum()   //definition
 * {
 * Sys(a+b);    //body of method
 * }
 * OVERLOADING VS OVERRIDING:
 * ------------------------------
 * 1)Method overloading is a compile-time polymorphism.
 * 	Method overriding is a run-time polymorphism.
 * 
 *2) Method overloading may or may not require inheritance.	
 * Method overriding always needs inheritance.
 * .
 * 
 *3) In method overloading, the return type can or can not be the same, 
 * but we just have to change the parameter.	
 * In method overriding, the return type must be the same or co-variant.
 * 
4)Static binding is being used for overloaded methods.	
Dynamic binding is being used for overriding methods.

 * 5)Method overloading may or may not require inheritance.	
 * Method overriding always needs inheritance.
 * 
 * 6)In method overloading, methods must have the same name and different signatures.
 * 	In method overriding, methods must have the same name and same signature.
 * 
 *7) Method overloading is a compile-time polymorphism.	
 * Method overriding is a run-time polymorphism.
 * 
 *8)
 * Private and final methods can be overloaded.	
 * Private and final methods can’t be overridden.
 * 
 * 9_The argument list should be different while doing method overloading.	
 * The argument list should be the same in method overriding.
 * --------------
 * Method Overloading in Java
 * -----------------
Method Overloading is a Compile time polymorphism. In method overloading,
 more than one method shares the same method name with a different signature in the class. 
 In method overloading, the return type can or can not be the same, 
 but we have to change the parameter because, in java, we can not achieve method overloading 
 by changing only the return type of the method. 
 ----------------
 Method Overriding in Java
 -----------------------
Method Overriding is a type of runtime polymorphism.
 In method overriding, a method in a derived class has the same name, return type,
  and parameters as a method in its parent class. The derived class provides a 
  specific implementation for the method that is already defined in the parent class.

 * 
 */
package OVERRIDE.JAVA;
class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)   //overridig: same method recreating in child class with different implementation.
	{
		System.out.println(a*a);
	}
	void m2(int a,int b)  //overloading: different types of definition with same implementation.
	{
		System.out.println(b*a);
	}
}

public class loadvsrideing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ ab=new XYZ();
		 ab.m1(2); //always return overide method as result
		 
		 ab.m2(10,20);//m2 is overloaded
		 

	}

}
