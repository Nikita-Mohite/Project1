package Armstrong;

public class Whil_method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arm,i=0;
		System.out.println("To find Armstong Numbers between 0 to 10000");
		
		while(i<10000)
		{
			arm=Armstrong(i);
			if(arm==i)
				System.out.println(i);
				i++;
				
		}
	}
	public static int Armstrong(int num)
	{
		int a=0,x;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num=num/10;
		}
		return a;
	}

}
