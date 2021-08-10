package Method;

public class constructor {
	
	int a;//declaration of non-static elements(variable)
	static int b=20;
	int c;//non-static elements(variable)
	constructor()
	{
		a=10;
		c=100;
		//a=a+c;
	}

	public static void main(String[] args)
	{
		System.out.println("So this is a simple program of constructor ");
		constructor x=new constructor();//object creation for non-static variable
		System.out.println(x.a);//calling of non-static variables/elements
		System.out.println(b);//calling of static variable
		//System.out.println(x.b);
		System.out.println(x.c);//calling of non-static variables/elements
		
	}

}
