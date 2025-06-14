/*
 * OVERIDING: feb 24/02/2025
 * -------------------------
 * 1)Method overriding is a feature in object-oriented programming that allows a subclass
 *  to redefine a method from its superclass.
 *  The overridden method has the same name, parameters, and return type as the method in the superclass.
 *  
 *  (rennovation is nothIng but oveRriding).
 * 
 * ==>IN OVERRIDING the body of the method only change not declartion.
 *===>definition not should and we should change body of method.
 *  
 *  2)Overriding is possible only with inheritance. (TWO CLASSES NEEDED TO ACHEIVE INHERITANCE).
 *  
 *  3)we can override the all the methods and variables from SUPER CLASS TO THE SUB CLASS.
 *  ----------------------------------------------------------------------------------------
 *  What Are the Rules for Method Overriding in Java? 
 *  ----------------------------------------
Laws of Method Overriding in JAVA: 

1.The method name should be common and the same as it is in the parent class.
2.The method signature (parameter list, return type) in the method must be the same as in the parent class.
3.There must be an inheritance connection between classes.
4.All the abstract methods in the parent class should be overridden in the child class.
5.If it declared the methods as static or final, then those methods cannot be overridden
------------------------------------------------------------
METHOD OVERRIDING:
---------------
1)possible only in multiple classes.
2)we should not change signature of the method but body we should change.
3)method names are same.
4)belongs to inheritance.
---------------------------------------------
method overloading:
---------------------
1)possible in single and multiple inheriatnce.
2)we should change the signature of the method.
3)method names are same.
4)belongs to polymorphism.


 *  
 */
package OVERRIDE.JAVA;
//THIS IS HIERARCHY INHERITANCE one parent multiple childs.
//one parent can have multiple childs.
class Bank
{
	double Roi()
	{
	return 10.8;
	}
}

class ICIC extends Bank
{
	double Roi()    //same parent class method we can  overide in child classes,
	{
		return 43.6;  
	}
}
class SBI extends Bank
{
	double Roi()   //overidig the methods from the child class
	{
		return 12.6;
	}
}
public class demoridride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of icic
		ICIC ic=new ICIC();
		System.out.println(ic.Roi());   //43.6    //always override method will be executed.
		
		SBI sbi=new SBI();
		System.out.println(sbi.Roi());//always override method will be executed
	

	}

}
