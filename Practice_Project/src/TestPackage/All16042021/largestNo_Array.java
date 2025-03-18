package All16042021;

public class largestNo_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,7,9,2,11,44,22};
		int max=a[0];
		int min=a[0];
		System.out.println("Find largest no in given array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
	
		}
		System.out.println(max);
		System.out.println();
		System.out.println("Find lowest no in given array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
	
		}
		System.out.println(min);
	}

}
