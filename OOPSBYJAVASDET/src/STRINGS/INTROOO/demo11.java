/*
 * Reverse alphabets alone in the given string?
 * 
 * input String:  "abc123pqr45xyz"
 * outputstring:"zyx123rpq45abc"
 */


package STRINGS.INTROOO;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="reddy1234pqr45sunil";
		
		int left=0;
		
		int right=str.length()-1;
	
		//converting string to array
		
		char[] arr=str.toCharArray();
		
		while(left<right)
		{
		   //when it is digit then then skip reversing 	
			if(Character.isDigit(arr[left]))  //isdigit method accept a character
				//character is an inbuild keyword 
				//character hold the all the characters
			{
	              left++;
				
			}
			else if(Character.isDigit(arr[right]))   //whenever number encountered right decreass
			{
				right--;
			}
			else
			{
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		
		System.out.println(new String(arr));//it convert chararray to string
		
		System.out.println(arr);
		

	}

}
