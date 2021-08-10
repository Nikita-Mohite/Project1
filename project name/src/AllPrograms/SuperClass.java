package AllPrograms;

public class SuperClass {

	public static int a=10;
	public int b=20;
	
	void test()
	{
		int a=50;
		int b=60;
		System.out.println("Value of a is: "+a);//50
		System.out.println("Value of a using This keyword is: "+a);//10
		System.out.println("Value of b is: "+b);//60
		System.out.println("Value of b using This keyword is: "+this.b);//20
	}
	
	public static void main(String[] args) 
	
	{
		
		
		SuperClass s=new SuperClass();
		s.test();

	}

}
