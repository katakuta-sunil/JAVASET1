/*
 * INSTANCE VARIBLE VS STATIC VARIBLE
 * ------------------------------------
 * 1)for instance variable for every object copy will be created while in static entire class single copy
 * created.
 * 
 * 2)WHEN variable is static the value of a variable is not varied from one object to other object
 *    while in instance variable the value of  a variable is varied from one object to other object.
 *    
 *  3)Instance variable is created whenever the object is created and instance variable is destroyed
 *  whenever the object is destroyed.
 *  static variable is created whenever the class files are loading
 *   when classfiles are unlaoded the static variables are destroyed.
 *   static variable created at class loading.
 *   static variables destroyed at class unloading.
 *   
 *   
 * 4)Static variables stored in "method area"
 * instance variable stored in "heap memory".
 * 
 * 
 * 5)both static and instance varibles are Decalared inside of class and outside of the
 *   method/costructor.
 *   
 *  6)static variables access directly from both static and instance area.
 *  instance variables access directly from only instance area only.
 *  
 *  
 *  JVM PROVIDE STATIC VARIABLES FOR both sttaic varibles an instance varibles.
 *  
 */


package VARIBLES.VARIABLES;

public class stVSins{

	   static int x=10;
	   int y=20;      //instantic varobls
	   	   
	
	
	public static void main(String[] args) {
		
		stVSins b=new stVSins();
		
		  b.x=8888;   // x =12
		  b.y=999;
		  System.out.println(b.x);
			System.out.println(b.y);	  
				  
		  
			 stVSins bb=new  stVSins();
		  // for static single copy mainted for all objects
		  //if i changed static varible it changes  refleced on the entire copy.
		  //if i changed instance varible  it changed reflect for specific obeject copy only.
 System.out.println("changes reflected on entire copym: " +bb.x);  // single copy created  for entire class
	System.out.println("changes reflected on specific object:" +bb.y);	  //for every objcet separe copy created
		  
		
		
	}
}

