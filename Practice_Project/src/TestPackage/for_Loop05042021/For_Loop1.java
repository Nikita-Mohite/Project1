package for_Loop05042021;

public class For_Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print 2nd and 4th quadrant ");
		
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
		int line2=5;
		for(int x=line2;x>=1;x--)
		{
			System.out.print(" ");
			for(int y=line2-x;y>=1;y--)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
