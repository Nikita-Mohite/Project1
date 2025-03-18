package All_23_04_2021;

public class Descending_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,4,6,2,7,8,1};
		int temp;
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
