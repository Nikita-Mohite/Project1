package All_01_05_2021;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a[]= {33,44,55,66,77,88};
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
