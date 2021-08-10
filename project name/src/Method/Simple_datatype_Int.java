package Method;

public class Simple_datatype_Int {
	static int Test()
	{
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("This method has return type: "+c);
		return c;
	}

	public static void main(String[] args) 
	{
		int x;
		System.out.println("For accessing return type value we need to take one variable here: ");
		x=Test();
		
		System.out.println(x);
		

	}

}
