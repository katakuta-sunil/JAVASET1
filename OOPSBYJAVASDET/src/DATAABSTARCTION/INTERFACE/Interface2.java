/*
 * Interface:
 * ----------------
 * 1)an interface is a blue print of class.
 * 
 * 2)interface contain final and static variables.
 * 
 * 3)interface contain abstract method(also allowed default methods and static methods from java 8 onward).
 * 
 * 4)An abstract method is a method contain signature but not body(un-implementatioed method).
 * 
 * void m1();  //signature
 * 5)Methods in interface are public.   (BY DEFAULT).
 * 
 * 6)INterface supports the funtionality of multiple interface.
 * 
 * 7)we can define interface with interface keyword.
 * 
 * 8)A class extends another class,an interface extends another interface but a
 *  class implemented a interface.
 * 
 * 9)WE can create  OBJECT REFERENCE FOR INTERAFCE BUT WE CANNOT INSTANTIATE INTERFACE. 
 * (we cannot create object for interface).
 * 
 * TEST X=NEW test();   //x is pointing to the object
 * instantiate means new test() is object creation  
 * 
 * new Test(); //this is called object (or) intiazation//is create object of test type
    to work with object
 * 
 * 
 * before java 8 only abstraction method allowed (implementation not allowed)
 * after java 8 default and static methods are allowed.
 * 
 * (interface contain abstraction method(no implementaion) 
 * default and stataic methods has implementaion).
 * 
 * 1)class to class (extends)
 * 2)interface to interface (extends)
 * 3)Interface to class (implements)
 * class is not allowed
 * --------------------------------------------------------------------------------------------------
 * 
 * NOTE:
 * ---------------------------------------------------------------------------------------------------------------
 * 1)VARIBLE OF INTERFACE HOLD THE OBEJCT OF CHILD CLASS.
 *
     INTERFACE VARIBLE HOLD THE OBEJCT OF CHILD CLASS.
    
 * 2)WE WILL CREATE THE OBJECT OF CLASS WHICH WAS IMPLEMENTED BY THE INTERAFCE.
 * 
 * 3)THE VARIBLE OF INTERFACE HOLD THE OBEJCT OF THE CLASS.
 * 
 * 4)WE CAN CREATE OBEJCT REFERENCE BUT WE CANNOT ISNTANTIATE.
 * 
 * -------------------------------------------------------------------------
 * ABSTARCT METHOD();contain only signature not contain implementation.
 * 
 * 
 * 
 * 
 * 
 */
package DATAABSTARCTION.INTERFACE;


interface shape
{
	int length=10;  // by default it is final and static keyword.
	int width=2; //by default the variable is default and final. 
	//implemented methods are not allowed in interface.
   //from java  8 onwards only default methods and static methods are allows
	//void m1() { sys(a) }  //error normal methods not allowed
    //normal methods are not allowed and default methods are allowed in interface.
	
	//circle method is default.
	void circle(); //absatrct class // if we don not specify access specifier default access specifier is "default".
	
	default void sqaure()  //only default and static methods allowed
	{
		System.out.println("this  is from interafce");
	}
	static void rectangle()  //static method
	{
		System.out.println("this is rectangle-stataic method");
	}
} //interface implements the class

public class Interface2 implements shape
{
	//public has higher level modifier    defaiult is lower level modifier
	
	//when we want to implement method from interface in class we must make it "public".
	public void circle()
	{
		System.out.println("this is circle-absatract method");
	}
	
	//interface2 has three methods.
	
	void traingle()
	{
		System.out.println("aaaaaaaaaaaaaaa");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scenario-1
		Interface2 aa=new Interface2();
		aa.circle();    //abstarct method we implemented in child class
	     aa.sqaure();
	     
	     //rectangle is not direcly created in class    
	     //if static method is created in classs then it access directly without creatimg object
	     //here static method created in interafce we shouls acces using  interface
	     
	     //if sttaic method created in interafce we should access using the interafce name.
	       shape.rectangle();//sttaic method directly access from interface
	       aa.traingle();
	       
	       //scnenario-2
	       
	       //CREARING OBJECT 
	       //we can create only reference  only for interface
	       shape sp=new Interface2();
	       //object for class storing in the interaface
	       
	       sp.circle();
	       sp.sqaure(); //default method
	       shape.rectangle();//sttaic method can directly access from interfrace
	     //  sp.traingle(); // in interafce not avaliable in imterafce error we cannot implements
	       
	       System.out.println(shape.length * shape.width);//acessing  sttaic varibles directly.
	     
		
	
		

	}

}
