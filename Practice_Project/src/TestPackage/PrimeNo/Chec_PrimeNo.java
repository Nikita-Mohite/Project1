package PrimeNo;

public class Chec_PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=10,temp=0;
		System.out.println("To check given number is prime number or not");
		for(int i=1;i<=no-1;i++)
		{
			if(no%i==0)//2,3,4,5,6,7,8....22
				//23%2==0
			{
				temp=temp+1;
			}
		}
		if(temp>0)//0>0
		{
			System.out.println(no+" is not prime no");
		}
		else
		{
			System.out.println(no+" is prime no");
		}
	}

}
