/*
 * 11
 * divide by 1,11
 * 11%i=0
 */


package All_28_04_2021;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find given no is prime no or not");
		int no=11,temp=0;
		for(int i=1;i<no-1;i++)//1,2,3,4,5,6,7,8,9,10,11
		{
			if(no%i==0)//10%2==0
			{
				temp=temp+1;//0+1=1
			}
			if(temp==0)
			{
				System.out.println(temp+"is a prime no");
			}
			else
			{
				System.out.println(temp+"is not a prime");
			}
		}
	}

}
