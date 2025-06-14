/*
 * datatypes : PRIMITIVE  , reference
 * 
 * Varibles : sttaic , local , instance
 * 
 * types;
 * sttaic primitive , sttaic reference
 * 
 * local primitive, static reference
 * 
 * instance primitive, static reference
 * --------------------------------------------------------------------------
 * IMP POINTS:
 * ---------------
 * 1)every array in java is object only.
 * 
 * 2)every varible in java should be either isntance or sttaic or local.
 * 
 * 3)every varible in java should be either primitive or refernce.
 * 
 *   hence various possible combinations in JAVA are:
 *   
 *   i)instance primitive, instance reference
 *   ii)static primitive , sttaic reference
 *   iii)local primitiev , local reference 
 *   
 * 
 * 
 */


package VARIBLES.VARIABLES;
public class local11 {
	
	
	int x =10; //  firts varible is  instance -primitive
	static String s ="suniul"; //static reference varible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] y=new int[6]; // local  reference varibale.
	}

}
