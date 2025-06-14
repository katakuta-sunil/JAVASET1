/*
 * final keyword apply on the method.
 * 
 * to make that method a final method that method cannot override in childclass.
 * 
 * final keyword :
 * --------
 * 1)varibles:we cannot change the value of the varible.
 * 2)method: we cannot override those methods in child class.
 * 
 * i)the final variable cannot be reinitialized with another value
  ii)the final method cannot be overridden
  iii)the final class cannot be extended
 */
package OVERRIDE.JAVA;

class TEST1
{
	//to remove final keyword we can override
	final void v1()     //final keyword cannot override taht method in child class.
	{
		System.out.println("thsi is method from test1 method");
	}
}
class Test2 extends TEST1
{
	void v1()
	{
		System.out.println("this is method from test2 ");
	}
}

public class FINAL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
