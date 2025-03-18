package TestPackage;

public class Large2 
{
	public static void main(String[] args) 
	{
		
		int a=467;
		int b=386;
		int c=876;
		
		if(a>b)
		{
			if (a>c)
			{
				System.out.println("A is greater than C:-"+a);
			}
			else 
				System.out.println("C is greater than A:-"+c);
			
		}
		if(b>c)
		{
			System.out.println("B is greater than C:-"+b);
		}
		else
			System.out.println("C is greater than B:-"+c);
		
	}

}
