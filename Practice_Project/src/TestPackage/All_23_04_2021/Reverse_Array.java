package All_23_04_2021;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,5,6,7,8};
		int b[]=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>0;i--)
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
