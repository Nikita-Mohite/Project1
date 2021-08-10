package All16042021;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,5,6,7,8,9};
		int b[]=new int[a.length];
		int j=0;
		System.out.println("Reverse the display of array permanantly");
		for(int i=a.length-1;i>=0;i--)
		{
				b[j]=a[i];
				j++;
			}
			a=b;
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		
	}

}
