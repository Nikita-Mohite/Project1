package Loop;

public class Nested_loop_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int line=6;
		for(int i=line;i>=1;i--)
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
	}

}
