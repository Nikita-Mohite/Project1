package All16042021;

public class duplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,2,3,3,4,5,6,5,6};
		System.out.println("Find duplicate no");
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
