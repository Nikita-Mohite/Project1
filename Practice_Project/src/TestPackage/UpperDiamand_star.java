package TestPackage;

public class UpperDiamand_star 
{
	public static void main(String[] args) 
	{
		
		int line=6;
		for(int a=0;a<=line;a++)
		{
			for(int b=line-a;b>=1;b--)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=a;i++)
			{
				System.out.print("*");
			}
			for(int j=2;j<=a;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
