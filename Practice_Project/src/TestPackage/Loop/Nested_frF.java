package Loop;

public class Nested_frF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line=7;
		
		for(int x=line;x>=1;x--)
		{
			for(int b=line-1;b>=x;b--)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=x;a++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}

//*******
 //******
  //*****
  // ****
  //  ***
  //   **
  //    *
