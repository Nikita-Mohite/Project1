package AllPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121,temp,rev=0,remainder;
		System.out.println("To find the palindrome number using While Loop");
		temp=num;
		while(temp!=0)
		{
			//while()
			
			remainder=temp%10;
			rev=rev*10+remainder;
			temp=temp/10;
		}
		if(num==rev)
		
			System.out.println(num+" is palindrom");
		
		else
		
			System.out.println(num+" is not palindrom");
		
	}

}
