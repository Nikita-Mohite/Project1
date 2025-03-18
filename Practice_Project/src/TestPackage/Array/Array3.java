package Array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {34,43,25,52,67,87,65,66};//Length=8,index=0,1,2,3,4,5,6,7;
		int f=a.length;
		System.out.println("Print array a");
		for(int i=0;i<8;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Length of array a is: "+f);
		
		System.out.println();
		int[] b= {11,22,33,44,55,66,77,88};
		System.out.println("Reverse the array b");
		for(int i=7;i>=0;i--)
		{
			System.out.println(b[i]);
		}
	}

}
