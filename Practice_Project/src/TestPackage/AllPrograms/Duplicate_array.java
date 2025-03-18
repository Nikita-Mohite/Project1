package AllPrograms;

public class Duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {6,9,3,6,4,9};
		
		
		int length=a.length;
		
		System.out.println("Find duplicate no from given array");
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
			if(a[i]==a[j]);
			{
			System.out.println(a[j]);
			}
			}
		}
	}

}
