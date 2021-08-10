package All_23_04_2021;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int no=50,temp=0;
		for(int i=1;i<=no-1;i++)
		{
			if(no%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		
			System.out.println(no+ " is not prime");
		
		else
		
			System.out.println(no+ " is  prime");
		
		*/
		
		int temp1=0;
		for(int i=0;i<=50;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp1=temp1+1;
				}
			}
			if(temp1==0)
			{
				System.out.println(i);
			}
			else
			{
				temp1=0;
			}
		}
	}

}

	