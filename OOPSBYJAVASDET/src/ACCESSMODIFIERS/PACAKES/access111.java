/*
 * access modifiers:acess modifiers defines scope of variables and methods.
 * ---------------------------------------------------------------
 * 
 * 
 * protected:access within the package using the inheritance. (outside package also access) 
 * 
 * public:any where can access.
 * 
 * 
 * private:access only within the class
 * 
 * default: only within the package.
 * ----------------------------------------------------------------
 * 1)public:  (every where we can access)
 * 
 *    public also access outside pacakage also.
 *     
 * 2)protected:  (ouside pacakge can also access using inheritance)
 * 
 * though inheritance we can access the  protected  varibles can be access outside pacakage also.
 * and outside package also.
 * 3)default : default is not a keyword when we not specify anything  specify then it is default we use this.
 * 
 * default we can access with in the package.
 * 
 * default has higher scope than private.
 * 4)private  : only within the class we can access (where we declared).
 * 
 * "inside project we have packages in every packages they have multiple packages."
 * 
 * 
 * 
 * 
 */


package ACCESSMODIFIERS.PACAKES;



public class access111 {
	
	
	int x=1888;
	private int u=90;
	
	protected int y=98;
	
	void m1()   //default method can access within the same package.
	{
		System.out.println("public access specifier anywhere the class");
		
	}
	
	protected void s()
	{
		System.out.println("proteree");
	}
	


}
