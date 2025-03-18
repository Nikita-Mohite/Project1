package TestPackage;

public class Reverse_Array 
{
	public static void main(String[] args) 
	{
		int a[]= {44,55,66,77,88,99,33,22,11};
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
