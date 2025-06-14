/*
 * REMOVE WHITE SPACES IN THE STRING?
 * -----------------------------------------
   String str="  s   u  n i ll  r e ddd yy aaa aa  dhhh";
   
 */


package STRINGS.INTROOO;

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="s uu nnn  iii ll  nn a  i  dd  uu  aa bb aa";
		
		  str=str.replaceAll("\s",""); // ==>\\s  is removes the single or double gaps with null
		   
		  
		  System.out.println(str);
		

	}

}
