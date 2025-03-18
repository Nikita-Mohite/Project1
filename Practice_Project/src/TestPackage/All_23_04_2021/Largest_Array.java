package All_23_04_2021;

public class Largest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,56,85,98,11,24,21,345,765,54,44,999};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
