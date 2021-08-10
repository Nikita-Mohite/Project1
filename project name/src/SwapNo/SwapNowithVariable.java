package SwapNo;

public class SwapNowithVariable {
	
	public static void main(String[] args)
	{

	int a,b,t;
	a=10;
	b=20;
	System.out.println("value of A before swap is: "+a);
	System.out.println("value of B before swap is: "+b);
	System.out.println("Swap two numbers using 3rd variable");
	t=a;
	a=b;
	b=t;
	System.out.println("value of A after swap is: "+a);
	System.out.println("value of B after swap is: "+b);	
}
}
