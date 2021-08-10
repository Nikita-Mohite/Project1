package String;
import java.util.Scanner;
public class Scanner_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		char[] str=s.nextLine().toCharArray();
		s.close();
		System.out.println("Reverse String");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}
		System.out.print("\n");
		
		
		
	}

}
