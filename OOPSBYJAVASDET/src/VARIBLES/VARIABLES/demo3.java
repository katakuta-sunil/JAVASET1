/*
 *march 4/02/2025
 * Static varibles:
 * ---------------------------
 * 1)if the value of a object is not varied from one object to other object then that varible is
 * declared as static varibles.
 * 
 * 2)only one copy created at class level.
 * 
 * 3)Static variables will be decalred with in the class directly 
 * but outside of any method or block or cosntructor.
 * 
 * ==> STatic varibles stores in "method area".
 * 
 * ===>local variables stored in method area.
 * 5) STATIC VARIBLES CAN BE ACCESED USING TWO APPROACHES?
 *  ----------------------------------------------------------
 *     1)using object reference.
 *     2)using class name.
 *         but recommended to use class name (while accessing).
 *   
 *     3)within the same class it is note recoommended to use classname we can access directy.
 *     4)we can access static varibles directly from static area and instance arera directly .
 *       reason : static varibles created at begining.
 *       
 * 
 * 6)What is scope of sttaic varible?
 * -----------------------------------------
 * 
 * AT the time class loading  static variables will be  created.
 *  And at the time of class unloading static variables  will be destroyed. 
 *  hence scope of sttaic varibles is exactly same as scope of .classfiles.
 * -----------------------------------------------------------
 * classlaoding vs class unlaoding
 * ---------------------------
 * 1)In Java, "class loading" refers to the process of finding and loading a class file into the
 *  Java Virtual Machine (JVM) at runtime, making it accessible to your program, while "class unloading" 
 *  is the process of removing a loaded class from the JVM's memory when it is no longer needed,
 *   essentially freeing up memory space; essentially, loading brings a class into memory,
 *    while unloading removes it.
 * --------------------------------------------------------------------
 * 
 * 7) INSTANCE VS STATIC VARIBALES:
 *    ---------------------------
 *     1) FOR instance variable  for every object separate object created incase of static varible
 *    a single copy will be created at a class level and shared by every object of the class.
 *  ----------------------------------------------------------------------------------------------------------
 *   2)IN JAVA program
 * 
 *     i)Start JVM
 *     ii)Create and start MAIN tHREAD
 *     III)LOACTE test.class file                   (text.classfile is taken example of .classfile)
 *     iv)load test.class file
 *     v)execute main method
 *     vi)unload test.calssfile
 *     vii)terminate main thread
 *     viii)shutdown JVM.
 *     
 *     
 *     at steps4 static varibles creation happens.
 *     at step6  sttaic varibles destruction happens.
 *     -----------------------------------------------------------
 *   
 * 
 */


package VARIBLES.VARIABLES;

public class static3 {
	   
	String name;  // value of a varible is varied from object to object
	int rollno;  // value of the vatrible is varied from object to object
	static String sname;// if the value of  varible is not varied from object to objet then that variable
	                     // decalred as static varible.
	
	static int x=10;
	
	
	public static void main(String[] args) {
		
		static3 ab=new static3();
		//STATIC VARIBLES CAN BE ACCESED USING TWO APPROACHES?
				
				 //1)using object reference.
				 //    2)using class name.
				 // but recommended to use class name for accessing the static avaliable.
		          //3)we can access directly.
		
		System.out.println(ab.x);  // accessed using object reference
		System.out.println(static3.x); // accessing using class name
		// but recommended to use the access using the class name
		System.out.println(x);
		ab.m1();
		
	}
	// we can access sttaic varibles from both instance and static area.
	public void m1()
	{
		System.out.println(x);
	}
	
}
