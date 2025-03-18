package All_23_04_2021;

public class Arm_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rem,temp,arm,i=100;
		System.out.println("Find arm using for loop");
		while(i<999)
		{
			temp=i;
			arm=0;
			while(temp>0)
			{
				rem=temp%10;
				arm=arm+(rem*rem*rem);
				temp=temp/10;
			}
			if(arm==i)
			
				System.out.println(i);
				i++;
			
		}
	}

}
