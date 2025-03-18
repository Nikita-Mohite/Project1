package All_28_04_2021;

public class Arm_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,temp,arm;
		System.out.println("Find arm no between 1-1000 using for while loop");
		for(int i=1;i<1000;i++)
		{
			temp=i;
			arm=0;
			for(;temp>0;)
			{
				rem=temp%10;
				arm=arm+(rem*rem*rem);
				temp=temp/10;
			}
			if(arm==i)
			
				System.out.println(i);
			
		}
	}

}
