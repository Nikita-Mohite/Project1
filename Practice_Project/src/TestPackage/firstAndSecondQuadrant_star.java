package TestPackage;

public class firstAndSecondQuadrant_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print 1st &2nd quadrant");
		int line=6;
		for(int b=1;b<=line;b++)
		{
			for(int a=line-b;a>=1;a--)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=b;i++)
			{
				
				System.out.print("*");
				System.out.print(" ");
			}
			for(int j=2*b;j<=b-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int line2=5;
		for(int b=line2;b>=1;b--)
		{
			System.out.print(" ");
			for(int a=line2-b;a>=1;a--)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=b;i++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			for(int j=2*b;j<=b-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
