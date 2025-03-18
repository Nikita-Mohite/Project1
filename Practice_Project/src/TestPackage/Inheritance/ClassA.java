package Inheritance;

public class ClassA {
	
	public static int a=10;//global variable
	public int b=20;
	//public char s='S';
	/*
	ClassA()
	{
		
		b=2000;
	}
	*/
	public static void Test()
	{
		System.out.println("This is Method of Super Class ClassA");
	}
	public int Add()
	{
		int c;//local variable
		c=a+a+b+b;
		System.out.println("This is non-static method of ClassA");
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);//10
		ClassA x=new ClassA();
		//System.out.println(x.s);//,R
		System.out.println(x.b);//2000
		Test();//static method call
		x.Add();//nonstatic method call
		System.out.println(x.Add());//6000
	}

}
