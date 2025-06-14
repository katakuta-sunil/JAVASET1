package CONSTRUCTOR.JAVA;

public class demo3 {
	
	int sid;
	String sname;
	char grad;
	void printStudentdata()
	{
		System.out.println(sid+ " " + sname + " "+ grad);
	}
      void setstudentdata(int id,String name,char re)
      {
    	  // LOCAL VARAIBLES CAN ACCESS WITH IN THE SAME FUNCTION
    	  sid=id;
    	  sname=name;
    	  grad=re;
      }
      demo3(int id,String name,char re)    // constructor not return any value
      {
    	  // purpose of constructors is just used to  intailize the object
    	 sid=id;
    	 sname=name;
    	 grad=re;
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 we=new demo3(321,"asss",'s');
		we.printStudentdata();
		//how many ways we can store data into the varaibles
		//1)using object reference varaibles
		 we.sid=11111;
		 we.sname="sunil naidduuuuu";
		 we.grad='s';
		 we.printStudentdata();
		 //2)USING THE  set method we can store data into the varaibles
		 //set function storing data into the class vara8ibles
                we.setstudentdata(101,"sweeeee",'u');
                we.printStudentdata();
          //3)using constructor   
          // constructor has no retun typpe 
          // constructor name same as the class name.
          // constructot kae parmeter
                demo3 rr=new demo3(121222,"ewwwww",'k');
                rr.printStudentdata();
                
	}
	

}

