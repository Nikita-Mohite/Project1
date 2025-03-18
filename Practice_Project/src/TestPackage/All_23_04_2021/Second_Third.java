package All_23_04_2021;

public class Second_Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			}
			System.out.println();
		}
		int count=5;
		for(int b=count;b>=1;b--)
			System.out.print(" ");
		{
			for(int a=count-1;a>=1;a--)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=5;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
