package Armstrong;

public class While_Method {

	public static int ArmstrongNumber(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num=num/10;
		}
		return a;
	}
	
	public static void main(String[]args)
	{
		int arm,i=0;
		
		System.out.println("To find Armstrong number between 0-1000");
		while(i<1000)
		{
			arm=ArmstrongNumber(i);
			if(arm==i)
				System.out.println(i);
			i++;
		}
	}
}
