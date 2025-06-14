/*
 * 
 * 
 * ==  it will comapares the memory address
 * String comparison:
 * ----------------------------
 * 1)n Java, the equals() method and the == operator are used to compare objects. 
 * The main difference is that string equals() method compares the content equality of two strings
 *  while the == operator compares the reference or memory location of objects in a heap,
 *   whether they point to the same location or not.
 *   
 *   ---------------------------------------------------------------------------
Equality (==) Operator
Compares if two references point to the same memory location.

.equals() Method

Compares the content of objects.
 */
package STRINGS.INTROOO;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//EX;1==>STRING CONSTANT POOL
		//both are pointing to same loaction in  "scp"
		String st1="welcome";
		String st2="welcome";
				
		System.out.println(st1==st2);  //comapres refernec of emmeory location
		
		System.out.println(st1.equals(st2));  //compares content
		
		
		
		//EX:2  ==>heap memory (string is created in heap memory)  
		//The ‘new’ keyword forces a new instance to always be created regardless of whether 
		//the same value was used previously or not. Using ‘new’ forces the instance to be 
		//created in the heap outside the string constant pool which is clear, since 
		//caching and re-using of instances isn’t allowed here. 
		
		//when ever we use new keyword memory allocated in heap memory which is outside the SCP
		//and it allows the duplicated.
		
		String s1=new String("ravi"); //created one memory in heap
		
		String s2= new String("ravi");// creataed one more memory
		
		
		String s3=new String("ravi");  //crested memory
		
	//WHEN EVER WE USE new keyword to create string it store in heap memory.
		//in heap memeory dupliacte copies also allowed
		
		String s4="usingkeyword";// SCP
		String s5=new String("usingkeyword"); //HEAP MEMORY
		
		System.out.println(s4==s5);//false  //it compare memory location
		System.out.println(s4.equals(s5));//true   //it comapres content
		
		
		
		//Example:3 
		//if welcome already present it map to the previous memory allocation.
		String tr="we";  //created in SCP
		String tr1=new String("we");  // created in heap (outside the SCP);
		
		System.out.println(tr==tr1);//it will comapre objects
		System.out.println(tr.equals(tr1));//true  //comapre the contents
		
		
		
		//ex:4
		String a1="welcome";  //scp  object
		String a2=new String("welcome"); //heap memory   object
		String a3=a1;
		
		System.out.println(a1==a2);//comapare memory  //false
		
		System.out.println(a1.equals(a2));//true
		
		
		
	
	

	}

}
