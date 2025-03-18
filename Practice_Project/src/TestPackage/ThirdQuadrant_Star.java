package TestPackage;

public class ThirdQuadrant_Star {
	public static void main(String[] args) {
		for(int i=6;i>=0;i--)
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
