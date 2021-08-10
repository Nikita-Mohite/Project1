package SwapNo;

public class ArraySwap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,4,5,6,7,8};
		int temp;	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i] !=b[j])
				{
					temp=a[i];
					a[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("Elements of Array a is: "+a[i]);
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("Elements of Array b is: "+b[i]);
		}
	}

}
