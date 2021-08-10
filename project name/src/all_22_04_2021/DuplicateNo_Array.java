package all_22_04_2021;

public class DuplicateNo_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,2,3,5,6};
		System.out.println("Find duplicate number from an array A");
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
