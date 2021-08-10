package All_28_04_2021;

public class Arm_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WAP Armstrong no using For Loop ");
		
		int sum,r,temp,num=372;
		
		temp=num;
		sum=0;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+(r*r*r);
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println(sum+ "is an arm no");
		}
		else
		{
			System.out.println(sum+ "is not an arm no");
		}
	}
}
