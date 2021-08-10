package All_01_05_2021;

public class Prime_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {34,54,23,2,7,5};
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
