package All_01_05_2021;

public class Descending_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {44,33,56,22,75,88};
		int temp=0;
		//int b[]=new int[a.length];
		
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
			System.out.println(a[i]);
		}

	}

}
