/*
 *WAP  Remove junk or special character from a string
 *
 *
 *Regular expression: removenumbers, and alphabets, it will retain numbers of alphabets
 *
 *replaceAll(regex,replacemnt);
 *[0-9a-z-Z]==>remove these cahrac from the string
 *[^0-9a-zA-Z]====>retains these characters
 */



package STRINGS.INTROOO;

public class dremoveJUNK9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="#@#$%%%#$#@@##########JAVA STRINGS #(@##$$$$$@PROGRAM@@@)";
		
		
		String fr="SU67##$$$sunil1aqqq@@###########SUNILREDDY";
		
		
		//remove all
		 String g=str.replaceAll("[^a-zA-Z0-9]","");  //replaceALL(olcCHAR,NEWCHAR) //
		 //^ this is negation except a-zA-Z0-9 all are removed 
		 //negation means 
          System.out.println(g);
		
          
          //ex:2 here replacement is null
          //below all are a-zA-Z0-9 are removed
          String r=fr.replaceAll("[a-zA-z0-9]","");  //replaceAll(String regulaeExpeession,repalcemnt)
          System.out.println(r);
          
          
          //TO RETAIN NUMBERS
          
          String abc="sunil987711222";
          String e=abc.replaceAll("[0-9]",""); //it removes numbers
          System.out.println(e);
          
          //TO REMOVE ONLY ALPHABETS
          
          String j="sunil67779899$$$";
          String jj=j.replaceAll("[a-zA-Z]","");
          System.out.println(jj);
          
          //remove numbers
          System.out.println(j.replaceAll("[^0-9]",""));  //retaining only numbers
          
          
	}

}
