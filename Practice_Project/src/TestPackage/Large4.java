package TestPackage;

public class Large4 
{

	public static void main(String[] args) 
	{
		int a=300;
		int b=200;
		int c=89;
		int d=400;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("A is greater than d:-"+a);
				}
				else
				{
					System.out.println("D is greater than A:-"+d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("B is greater than d:-"+b);
				}
				else
				{
					System.out.println("D is greater than B:-"+d);
				}			
			}	
			else
			{
				if(c>d)
				{
					System.out.println("C is greater than d:-"+c);
				}
				else
				System.out.println("D is greater than C:-"+d);
			}
		}
		
	}
}
