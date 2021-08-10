package String;

public class Sequence_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Convert given string into given no of characters");
		String s="Welcome";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.println("Sequence of char: "+c);
		}
		
		
		//to print 1st char of string
		char ch=s.charAt(0);
		System.out.println("This is 1st character of String"+ch);
	}

}
