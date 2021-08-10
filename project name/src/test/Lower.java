package test;

public class Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=6;i>0;i--)
		{
			for(int j=6;j>i;j--)
				
			{
				System.out.print(" ");
			}
			for(int k=0;k<6;k++)
			{
				System.out.print("*");
			}
			for(int k=0;k<2*i-2;k+=2)
			{
				System.out.print("00");
			}
			for(int k=0;k<6;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
