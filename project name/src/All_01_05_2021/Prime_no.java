package All_01_05_2021;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=23,temp=0;
		
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(no+" is not a prime no");
		}
		else
		{
			System.out.println(no+" is a prime no");
		}
	}

}
