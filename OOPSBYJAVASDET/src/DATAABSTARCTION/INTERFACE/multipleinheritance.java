/*
 * Another way to achieve abtrction in java is interface.
 * 
 * 1)we cannot achieve multiple inheritance and hybrid inheritance using classes but with interface
 * we can achieve  both multiple inheritance and hybrid inheritance.
 * 
 * 2)interface variables are by default public,sttaic,final.
 * 
 * 3)Interface is just like  a class,which is only abstract methods(writing only method declration but not its
 * implementation) and final data members.
 * 
 * 4)two keywords used in interarces
 *     1)interface
 *     2)implementaion
 * 5)TO PROVE IMPLEMENTTAION DETAILS FOR ABSTARCT METHODS WE REQUIRE CLASSES.
 * 
 * 6)
 * 
 */
package DATAABSTARCTION.INTERFACE;
//public has higher level modifier    default is lower level modifier.
//when we want to implement method from interface in class we must make it "public".
interface A
{
	void show(); //absatrct method   //by default it access modifier is default
	//we are providing implementaion detalis  in classs
	
}
interface B
{
	void display(); //abdtarct method
}
class c implements A,B
{
	public void show()
	{
		System.out.println("present in interafce in ");
	}
	
	public void display()
	{
		System.out.println("interafce b");
	}
	
}
public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		c ce=new c();
		ce.show();
		ce.display();
		
		
	}

}
