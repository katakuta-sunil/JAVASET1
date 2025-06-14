/*
 * Strings in java:
 * -----------------
 * 1)String is a class in java it have many buldin methods.
 * 
 * String str="swaroop";
 * 
 * string is a class and it has many buildin classe
 * 
 */



package STRINGS.INTROOO;

import java.util.Arrays;

public class ASTRINGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiple ways to declare strings:
		//aproach 1:
		String str ="swaroop";
		//approach 2
		
		String str1=new String("suniill is in nellore  ");
		
		
		  System.out.println(str1);
		  
		  //in build methods strings
		  //length()==>it return the number of characters in the given string.
		  
		   System.out.println(str.length());  //7
		  System.out.println(str1.length());  //31
		  System.out.println("ssuunniill".length());//10
		  
		  //concat method=====>it joins  the two new strings  
		  //concatenatipn: jpoining two strings is called concatenation.
		  //+ ===>on two strings it is concatenation
		  System.out.println(str+str1);
		  String v="prabhas";
		  String v1="sunillevel";
		  String v2="logo";
		  System.out.println(v.concat(v1));//prabhassunillevel
		  System.out.println(v+v1+v2);//prabhassunillevellogo
		  System.out.println(v2.concat(v1)); //logosunillevel
		  
		  System.out.println(v.concat(v1).concat(v2));
		  
		  
		  //trim()==>it removes spaces from the both end in the string.
		  String t="  sunil   ";
		  System.out.println(t.trim());
		  String t1="  s u n i l         ";
		  System.out.println(t1.length());
		  System.out.println(t1.trim());
		  
		  
		  
		  //CharAt()----returns an specified index in the string
		  
		  String n="javaprogramming";
		  
		   System.out.println(n.charAt(1));
		   System.out.println(n.charAt(3));
		   System.out.println(n.charAt(6));
		  
		 
		   
		   //contains()===>it return a boolean value ==>true/fasle
		   //conatins method compares two strings   (it return booelan values)
		   //checks for the given string is part  of the main string.
		   	String c="sunilreddy";  //main string
		   	String c1="sunil";  //part of main string 
		   System.out.println(c.contains(c1));//true  (sunil is a part of mainstring)
		   System.out.println(c1.contains(c));//false  (sunilreddy is not a part of sunil)
		   
		   
		   String x="abc";//main string
		   String xx="a";//part of main string
		   System.out.println(x.contains(xx));
				 
		   
		   //equals==> comapare strings  and return boolen value true or false
		   
		   String g="sunil";
		   String gg="sunil";
		   System.out.println(g.equals(gg));  //true  =>if exactly matches.
		   
		   //equalsIgnoreCase-----.comapreStrings ==>it will ignore cases
		   
		   String ggg="SUNIL";
		   
		   System.out.println(g.equalsIgnoreCase(ggg));//true
		   
		   
		   
		   //contentEquals
		   
		   String r="reddy";
		   String rr="reddy";
		   System.out.println(r.contentEquals(rr));//true.
		   
		   
		   //replace==>it repalce either single or multiple cahracters
		   
		   String  e="javaprogrammingreplace";
		   System.out.println(e.replace('a','B'));  //all "a" are removed and repalce with B
		   
		   System.out.println(e.replace('j','Z'));
		   
		   //to replace strings
		   
		   String m="java is fastest langauge";
		   System.out.println(m.replace("is","IS"));
		   
		   //substring()
		   //retrieve part of the string
		   
		   String q="sunilisthejavaprogrammer";
		   
		   System.out.println(q.substring(6));
		   
		   System.out.println(q.substring(2));
		   
		   System.out.println(q.substring(7));
		   
		   
		   String l="sunilreddyyy";
		   
		   System.out.println(l.substring(2,7));
		   
		   System.out.println(l.substring(3,9));
		   
		   System.out.println(l.substring(0,3));
		   
		 		  
		  //to upper case
		   //to lower case
		   
		  String r1="sunil";
		  System.out.println(r1.toUpperCase());
		  String r2="KALKIRANE";
		  System.out.println(r2.toLowerCase());
		  
		  
		  //split()===>it will create multiple strings based on delimitter
		  
		  String zz="Swaroop nadella academy";
		  
		 String qw[]=zz.split(" ");
		 
		 System.out.println(Arrays.toString(qw));
		 System.out.println(qw[0]);
		 System.out.println(qw[2]);
		 
		 String u="katakutasunul@gmail.com";
		 String uu[]=u.split("@");
		 System.out.println(Arrays.toString(uu));
		 
		 String h="$1,23,2444";
		 
		 String re[]=h.split(",");
		 
		 System.out.println(Arrays.toString(re));
		 
				 
		  
		 String hq="$1,23,2444";
		 
		 System.out.println(hq.replace(',',' ').replace('$',' '));
		  
		  
		  
		  
		  
		
		
		
		   
		   
		   
		   
		   
		   
		   
	}

}
