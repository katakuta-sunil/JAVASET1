/*
 * VARIABLES intro   feb 15/02/2025
------------------------------------------
int x =12; 


reference varaible:
-----------------------------------------------
student s = new student();
reference varaibles can be used to refer objects.




All varibles divided into three types:
--------------------------------------------------
1)Instance variables
2)Static varaible
3)local varaibles

Instance varibles:
-------------------------------
1)In Java, an instance variable is a variable that is defined in a class 
but outside of any method, constructor, or block.

=>if the value of the varaible is varied from object to object such type of 
varaible is called instance varible.

IMP point : Each object of the class has its own copy of the instance variable

For every object separate copy of instance varaibles is avaliable.

===>HOW MANY COPIES OF INSTANCES VARAIBLES IS CREATED?
For every object a separarte copy of instances varaible is created.


===>Instance varibles should be decalred within the class directly but outside of any method/block/constructor.

===>WHEN INSTANCE VARIABLES IS CREATED?
at the time of object creation.

====>SCOPE OF instance varible is same as object.

=====>instance varible will be created at the time of object creation and destroyed at the time of 
object destruction.Hence the scope of isntance variable is same as  the scope of object.


=====>Where indtance varible is stored?
in the heap memory.
Both object and instance varible stored in the heap memory.


======>HOW CAN YOY access the instance varibles?
WE CAN ACCESS USIUNG THE object reference.

===>wE CANNOT  access instance varibles diretly from the static area  by using 

---------------------------------------------------------------------------------------
How instance variables work
--------------------------------------
Instance variables are created when an object is instantiated. 
They are destroyed when the object is garbage collected. 
They are stored in the heap section of the memory. 
They are accessible to all the constructors, methods, or blocks in the class. 
They are unique to each object, allowing them to maintain their state.
------------------------------------------

class Test
{
     
     
   int x =10;
   
   
   
   public static void main(string[] args)
   
   {
   // instatic area we can access using object refeence 
     Test t= new test();
     
      SOP(x); // compile sttaic error
        (non static varible x cannot be referenced from a static context)
      Sop(t.x);
      
     }
      
      public void m1()
      {
      //in instance area we can access directly.
      SOP(x);  // 10
      }
   
   }
 */

package VARIBLES.VARIABLES;

public class demo1 {
	
	
	int x=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in static area we can access using object refeence 
	     demo1 t= new demo1();
	     
	    //  System.out.println(x); // compile sttaic error
	     //(non static varible x cannot be referenced from a static context)
	      System.out.println(t.x);
	      
	     }
	      
	      public void m1()
	      {
	      //in instance area we can access directly.
	      System.out.println(x);  // 10
	      }
		

	}


