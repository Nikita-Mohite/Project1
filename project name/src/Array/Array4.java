package Array;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9};//length=9,index=0-8;
		int b[]=new int[a.length];
		int j=0;
		System.out.println("Reverse the display of array a permanantly");
		
		for(int i=a.length-1;i>=0;i--)
		{ 
			b[j]=a[i];
			j++;
		}
		a=b;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
