package TestPackage;

public class Descending_Array 
{
	public static void main(String[] args)
	{
		int a[]= {33,77,55,85,75,40,64,67,29,93};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Descending array is:- "+a[i]);
		}
	 	
	}

}
