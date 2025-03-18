package TestPackage;

public class SecondQuadrant_star {
	public static void main(String[] args) {
		
		for(int i=0;i<=6;i++)
		{
			for(int j=6;j>=i-1;j--)
			{
				System.out.print(" ");
			}
			for(int a=0;a<=i;a++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
