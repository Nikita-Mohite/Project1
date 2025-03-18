package for_Loop05042021;

public class For_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print 1st & 4th quadrant");
		
		for(int b=1;b<=6;b++)
		{
			for(int a=1;a<=b;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int b=5;b>=1;b--)
		{
			for(int a=1;a<=b;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
