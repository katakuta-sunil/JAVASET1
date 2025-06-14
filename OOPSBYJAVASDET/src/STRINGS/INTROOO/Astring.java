package STRINGS.INTROOO;

public class Astring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ss="sunil";
		
		String rev=" ";
		for(int i=ss.length()-1;i>=0;i--)
		{
			rev=rev+ss.charAt(i);
		}
		System.out.println(rev);

	}

}
