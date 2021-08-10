package Loop;

public class Nested_loop_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int line=7;
		for(int i=1;i<=line;i++)
		{
			for(int j=line-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
				for(int m=1;m<=i-1;m++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
		
		int line2=6;
		for(int i=line2;i>=1;i--)
		{
			System.out.print(" ");
			for(int j=line2-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
				for(int m=1;m<=i-1;m++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
