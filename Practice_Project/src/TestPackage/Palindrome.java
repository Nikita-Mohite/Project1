package TestPackage;

public class Palindrome {
	public static void main(String[] args)
	{
		int no=12521,temp,rev=0,a;
		temp=no;
		for(;temp!=0;temp/=10)
		{
			a=temp%10;
			rev=rev*10+a;
		}
		if(no==rev)
		
			System.out.println(rev);
		else
			System.out.println(rev+ " is not pallin");
	}
	
		
	}

