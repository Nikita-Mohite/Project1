package TestPackage;

public class Prime_Numaber 
{
	public static void main(String[] args) 
	{
		int no=10, temp=0;
		for(int i=1;i<no-1;i++)
		{
			if(no%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(no+" is not a prime no");
		}
		else
		{
			System.out.println(no+" is prime no");
		}
	}
	

}
