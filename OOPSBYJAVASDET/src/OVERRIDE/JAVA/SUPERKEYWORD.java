
/*1)SUPER KEYWORD WILL BE USED TO INVOKE IMMEDIATE PARENT CLASS VARIBLE.
 * 2)SUPER KEYWORD WILL BE USED TO INVOKE IMMEDIATE PARENT CLASS METHOD.
 *   super keyword represent immediate parent class.
 *   -----------------------------------------------------------------------------
 * Super keyword only work in inheritance.
 * ----------------------------------------------------
 * 1)The super keyword refers to superclass (parent) objects.

2)It is used to call superclass methods, and to access the superclass constructor.

3)The most common use of the super keyword is to eliminate the confusion between
 superclasses and subclasses that have methods with the same name.

4)To understand the super keyword, you should have a basic understanding of Inheritance and Polymorphism.
--------------------------------------------------------
What is the super keyword in Java?
Super Keyword in Java | How Super Keyword Work in Java with ...
The super keyword in Java is a reference variable that allows a subclass to access its parent class. 
It's used to access the parent class's methods, constructors, and data members. 
When to use the super keyword
-----------------------------
To access a parent class method that has been overridden in the subclass 
To access a parent class constructor 
To access a parent class field when the parent and child classes have the same field 
To eliminate confusion between super classes and subclasses that have methods with the same
 */

package OVERRIDE.JAVA;

class tt
{
	String color="strawberryyy";
	
	void eat()
	{
		System.out.println("eatimg in super class class");
	}
}


class yy extends tt
{
	String color="blue";
	
	void diss()
	{
		//super class invoke thebimmediate latest parent class variable.
		System.out.println(super.color);  // super keyword invoke the parent class keyword
		System.out.println(color);  //display for latest changes
	}
	void eat()
	{
		System.out.println("eatimg bread in child class");
		super.eat();//invoke the parent class
	}
}
public class SUPERKEYWORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yy d=new yy();
		d.diss();
		//
		d.eat();

	}

}
