package All_28_04_2021;

public class Arm_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("WAP Armstrong no between 1-1000using For Loop ");
		
		int sum,r,temp,i=1;
		while(i<1000)
		{
		temp=i;
		sum=0;
		while(temp>0)
		{
			r=temp%10;
			sum=sum+(r*r*r);
			temp=temp/10;
		}
		if(i==sum)
		
			System.out.println(sum);
			i++;
		}
	}

}
