package Method_Hiding;

public class Parent {

	static void Demo()
	{
		System.out.println("Hello Class");
	}
	
	static int Test(int c)
	{
		System.out.println("This is parent class method");
		System.out.println("value of"+c+ "is printed");
		return c;
	}

}
