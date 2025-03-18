package All_23_04_2021;

public class Arm_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rem,temp,arm;
		System.out.println("Find arm using for loop");
		for(int i=0;i<=999;i++)
		{
			temp=i;
			arm=0;
			for(;temp!=0;temp/=10)
			{
				rem=temp%10;
				arm=arm+(rem*rem*rem);
			}
			if(arm==i)
			{
				System.out.println(i);
			}
		}
	}

}
