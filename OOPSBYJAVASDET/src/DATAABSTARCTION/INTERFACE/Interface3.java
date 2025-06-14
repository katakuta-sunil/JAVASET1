/*
 * multiple inheritance: multiple pareents have single child
 * 
 * v1 and v2 are implemented by interafce3 class.
 * 
 * 
 */





package DATAABSTARCTION.INTERFACE;


 public interface v1
  {
	  int y=200;
	  void c1(); //abstarct method
  }
 public interface v2
  {
	  int x=122;
	  void c2();  //abstarct
	  //by default void v2() is default method
  }
 

public class Interface3 implements v1,v2{
	
	
	public void  c1()
	{
		System.out.println("aa");
	}
	public void c2()
	{
		System.out.println("aaaaaaaaaaaa");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Interface3 aaa=new Interface3();
		aaa.c1();
		aaa.c2();
		
	}

	

}
