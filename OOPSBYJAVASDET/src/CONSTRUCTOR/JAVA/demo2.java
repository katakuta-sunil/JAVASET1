package CONSTRUCTOR.JAVA;


//when wver method calls it will invoke the methpod

public class demo2 {
	// 1)no parameter  no return value
	  void m1()      // void ==> not return any value
	  {
		  System.out.println("no parameters  no return value in java ");
	  }
    
	  //2) no parameters returns value
	  String  m2()
	  {
		  return "no paremerts but it return values in java " ; 
	  }
	  //3) takes parameters but no return value
	   void m3(String name)
	   {
		   System.out.println("takes parameters with no return value ");
	   }
	   //4)TAKES PARMETERS  WITH RETURN VALUE
	  String m4(String nam)
	   {
		   return "hello" + nam ;
	   }
			   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 nw= new demo2();
		nw.m1();
		System.out.println(nw.m2());
		String as=nw.m2();
		System.out.println(as);
	     nw.m3("sunniillllll");
	     System.out.println(nw.m4("takes parameters ans return values"));

}

}
