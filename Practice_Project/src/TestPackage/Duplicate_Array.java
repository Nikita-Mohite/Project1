package TestPackage;

public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {45,4,5,65,45,4,5,32,45,89,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
