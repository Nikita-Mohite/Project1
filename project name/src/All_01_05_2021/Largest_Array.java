package All_01_05_2021;

public class Largest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {44,33,55,34,65,77,11};
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
