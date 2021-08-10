package Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,7,23,12,56,76};//length=6,index=0,1,2,3,4,5;
		
											   
		int b[]= {5,4,3,2,1,0};//length=6, index=0,1,2,3,4,5;
		
		System.out.println("Numbers in array a are as follows: ");
		for(int i=0;i<=5;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Numbers in array b  in reverse(Only display of numbers sre reverse) are as follows: ");
		for(int j=5;j>=0;j--)
		{
			System.out.println(b[j]);
		}
		
		System.out.println();
		
		b[3]=8;
		System.out.println(b[3]);
		
		
		System.out.println();
		//int f=a.length;
		for(int j=0;j<=5;j++)
		{
			System.out.println(b[j]);
		}
		
		}
}
