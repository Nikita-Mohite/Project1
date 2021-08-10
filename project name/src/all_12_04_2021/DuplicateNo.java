package all_12_04_2021;

public class DuplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find duplicate Numbers");
		int a[]= {2,3,4,2,5,6,3,4};
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
