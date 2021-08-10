package AllPrograms;

public class Duplicate_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Find duplicare numbers among given numbers");
		int a[]= {3,4,5,6,2,2,3,6,5};
		int length=a.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]==a[j])
				//{
					System.out.println(a[j]);
				//}
			}
		}
	}

}
