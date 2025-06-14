/*
 * Methods======>
class is a collection of variables and  methods.
1)A method is a block/group of code which only runs when it is called.
 You can pass data, known as parameters, into a method.
2)method is a group of statement which will perform certain task.
we have to call the method though the object.
1)no parameters  no return value
2)no parameters   Return value
3)Takes parameters   no return value
4)TAKES PARAMETER    RETURN VALUE
-------------------------------------------------------------------------------------------------------------------

2) NO PARAMETER RETURN VALUE
String s = new String("suunniill");
s.length(); // no parameter but return value 
3)

int len=s.length();===>no parameters returns value
String sub=s.substring(2,5);

-----------------------------------------------------------------------------------------------------------------------------------------
2)HOW MANY WAYS WE CAN STORE DATA INTO THE VARAIBLES?
-------------------------------------------------------------------
A)1)using object reference varaible.
2)by just creating one extra method to store data into the method.
------------------------------------------------------------------------------------------------------------
 DIFFERNCE METHOD VS  CONSTRUCTOR
 ----------------------------------------------------------------------------------------------
 1)METHOD NAME SHOULD BE ANYTHING WHILE CONSTRUCTOR NAME SHOULD BE SAME AS CLASS NAME.
 2)IF METHOD MAY OR MAY NOT RETURN A VALUE WHILE CONSTRUCTOR WILL NEVER RETURN A VALUE.
 3)IF METHOD IS NOT RETURNING NAY VALUE THEN SPECIFY THE VOID , WE DONOT SPECIFY THE VOID.
 4)METHOD CAN TAKE PARAMETERS/ ARGUMENTS WHILE CONSTRUCTOR ALSO TAKE  PARAMETERS/ARGUMENTS.
 5)WE HAVE TO INVOKE/CALL METHODS EXPILICITY THROUGH HE OBJECTS WHILE CONSTRUCTOR AUTOMATICALLY INVOKED AT THE TIME
 OF OBJECT CREATION.
 6)METHOD  USED FOR SPECIFYING THE LOGIC WHILE CONSTRUCTOR USED FOR INTIALIZING THE VALUES OF the VARAIBLES.
 ------------------------------------------------------------------------------------------------
 TYPES OF CONSTRUCTORS==>
 1)DEFAULT CONSTRUCTOR==. CONSTRUCTOR NOT TAKING ANY PARAMETERs.
 2)Parameterized constructors ==> constructor accepting parameters.
 --------------------------------------------------------------------------------------------------------------------------------
1)METHOD MAY OR MAYNOT RETURN VALUE BUT CONSTRUCTOR RETURN VALUE.
2)in method we can write any thing in constructor we can write only intializing the data.;
purpose of constructor is just to intialize the data into the varaible.

---------why constructor not return any value?
METHOD IS FOR IMPLEMENTING THE LOGIC CONSTRUCTOR IS only for assignment the values of a  variables.
we cannot do operations in the constructor.
A)reason==> in constructor we only intialize the data into the varaible.
in constructor we cannot write the logics inside the constructor.

constructor invoked automatically  at the time of object creation.
-------------------------------------------------------
MOST OF THE TIMES WE USE CONSTRUCTORS TO ASSIGN DATA INTO THE VARAIBLES.
----------------------------------------------------------------------------------


 * 
 * 
 * 
 * 
 */



package CONSTRUCTOR.JAVA;


public class demo1 {
	
	int x, y;
	//constructor intializing the values of a varaibles
	 demo1()   //default constructor
	{
		x=100;
		y=200;
	}
    demo1(int a ,int b)     // parameterized constructor
    {
    	x=a;
    	y=b;
    }
    void sum()
    {
    	System.out.println(x+y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling default constructor
		demo1 da=new demo1();
		da.sum();
		//callingf poarmetrized the constructor
		demo1 ds=new demo1(200,300);
		ds.sum();

	}
	

}

