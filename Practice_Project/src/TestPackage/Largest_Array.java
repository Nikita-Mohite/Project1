package TestPackage;

public class Largest_Array {
	public static void main(String[] args) {
		
		int a[]= {55,34,6,87,34,78,98,65,43,76,11};
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
