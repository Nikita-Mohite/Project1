package all_22_04_2021;

public class Arm_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Armstrong program using for loop");
		int sum,r,temp;
		for(int i=1;i<=500;i++)//no bet 0-500 limit
		{
			temp=i;
			sum=0;
		//for(int i=0;i<=8;i++)
			for(;temp!=0;temp/=10)//logic of program//i++=,i=i+1 //i+=5,i=i+5//temp/=10=temp=temp/10
			//371!=0;371/10=37
			//37!=0
			{
				r=temp%10;//371%10=1,7,3
				sum=sum+(r*r*r);//0+1=1//1+343=344//371
				//temp++;
			}
		
			if(sum==i)
			{
				System.out.println(i);
			}
		}	
	}
}


