package String;


public class Char_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Welcome In Programming LAnguage";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Print count of String is: "+count);
	}

}
