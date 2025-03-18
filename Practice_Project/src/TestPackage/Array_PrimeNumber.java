package TestPackage;

public class Array_PrimeNumber {
	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5,8,23,24,31,33,34};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=2;j<a[i]-1;j++)
			{
				if(a[i]%j==0)
				{
					temp=temp+1;
				}
				
			}
			if(temp==0)
				
					System.out.println(a[i]);
				
			else
				temp=0;
			
		}
		
	}

}
