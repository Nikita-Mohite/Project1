package TestPackage;

public class LowerDiamand_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line=6;
		for(int b=line;b>=0;b--)
		{
			for(int a=line-b;a>=0;a--)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=b;i++)
			{
				System.out.print("*");
			}
			for(int i=0;i<=b;i++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}


	}

}
