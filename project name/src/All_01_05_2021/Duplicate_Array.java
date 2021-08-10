package All_01_05_2021;

public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,45,6,7,45,3,6};
		
		
		for(int i=0;i<a.length;i++)
		
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
				System.out.println(a[j]);
		}
		}
	}

}
