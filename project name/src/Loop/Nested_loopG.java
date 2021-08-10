package Loop;

public class Nested_loopG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print Pyramid ");
		 
		int line=7;
		
		for(int x=1;x<=line;x++)
		{
			for(int b=line-x;b>=1;b--)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=x;a++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		int line2=6;
		for(int m=line2;m>=1;m--)
		{
			System.out.print(" ");
			for(int n=line2-1;n>=m;n--)
			{
				System.out.print(" ");
				
			}
			for(int i=1;i<=m;i++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}	
	}

}

