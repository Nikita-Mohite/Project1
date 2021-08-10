package String;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Velocity";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Print string in reverse: "+rev);
		
//		if(s.equals(rev))
//		{
//			System.out.println("String is pallindrome: "+rev);
//		}
//		else
//		{
//			System.out.println("String is not pallindrome: "+rev);
//		}
		
		
	}
	
	

}
