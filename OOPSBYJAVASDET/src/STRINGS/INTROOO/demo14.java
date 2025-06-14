/*
 * String concatenatin:
 * ---------------
 * "java"+"10"
 */


package STRINGS.INTROOO;

public class demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  string right side addition not done conactenation done
		//stting left side addition done
		System.out.println("java"+10+20);//concatenation
       System.out.println(10+20+"java");//addition+concatenation
       
       System.out.println(10+90+"java"+30+60);//after string everthing will be concatenated.
       
       
       //Arthimetic operators:   +  -  *  * /  %
       
       //concatenation+substraction
       
       //string right side if we do subtarction we nedd (10-29)
       //string left side we need 10+29
       System.out.println("java"+(100-90));//directly - not work 
       
       
       System.out.println(100+70+"java"+(200-120));
       
       //concatenation+mulploication
       
       System.out.println("java"+10*20);
       System.out.println(10*23+"java"+90*87);
       
       System.out.println(100/20+"java");
       System.out.println(500/100+"java"+40/20);
       
       System.out.println(300%100+"java");
       System.out.println(200%100+"java"+400%3);
       System.out.println("java"+700%5);
       
       
       
       
       
       
       
       
	}

}
