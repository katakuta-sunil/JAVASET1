/*
 * *1.JVM WILL PROVIDE DEFAULT VALUE TO VARIABLES BY DEFAULT.
 *2.for instance varible we donnot provide intialization explicitly JVM will always provide default values
	and we not required to perform explicity.
	
	3.Instance varibles also knowns attributes / Object level varibles.
 */



package VARIBLES.VARIABLES;

public class demo2 {
	
	//for instance varible we donnot provide intialization explicitly JVM will always provide default values
	//and we not required to perform explicity.
	
	//instance varaibles
	int x;
	double d;
	boolean b;
	String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo2 w=new demo2();
		System.out.println(w.x);
		System.out.println(w.d);
		System.out.println(w.b);
		System.out.println(w.s);
	}
}