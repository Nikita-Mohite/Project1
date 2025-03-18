package Method;

public class simple3 {
	
	public static int test()
	{
		System.out.println("HI");
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		System.out.println("Start execution of the program");
		x=test();
		test();
		System.out.println(x);
		
	}

}
