package Method;

public class method_Parameterpassing {
	public static int test(int s)
	{
		System.out.println(3);
		int a=54;
		a=a+5;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		int x=test(6);//method call
		System.out.println(x);
	}

}
