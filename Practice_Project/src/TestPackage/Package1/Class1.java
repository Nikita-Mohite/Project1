package Package1;

public class Class1 {	
	
	public static int a=10;//public AS
	static int b=20;//default AS
	private static int c=30;//private AS
	protected static int d=40;//protected AS
	public int e=50;
	int f=60;
	private int g=70;
	protected int h=80;	
	
	public Class1()
	{
		e=100;
		f=150;
	}
	
	Class1(int e)
	{
		a=e;	
		g=e;
	}	
	
	private Class1(int g,float h)
	{
		e=g;
		h=10.10f;
	}
	
	protected Class1(int a,int b,int c)
	{
		e=a;
		f=b;
		g=c;		
	}
	
	public int Sub()
	{
		d=b-a;//20-33=-13
		return d;
	}
	
    int Add()
	{
    	int a=22;   
    	int b=12;  
    	c=a+b;//static variable//22+12=34
		return c;
	}
    /*
	private void Display()
	{
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
	}
	*/
	protected int Mult()
	{
		e=a*a;	
		return e;
	}
	
	public static void Ans()
	{
		System.out.println(c+" "+d+" ");
	}	
	
	static int Day()
	{ 
		int a=7;
		return a;
	}
	/*
	private static int Month()
	{
		int b=12;
		return b;
	}
	*/
	protected static int Year()
	{
		int c=1;
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);//33
		System.out.println(b);//20
		System.out.println(c);//12+22=34
		System.out.println(d);//20-33=-13
		Class1 x=new Class1();
		Class1 y=new Class1(11);
		Class1 z=new Class1(22,33);
		Class1 u=new Class1(44,55,66);
		System.out.println(x.e);//100
		System.out.println(x.f);//150
		System.out.println(x.g);//70
		System.out.println(x.h);//80
		System.out.println();
		System.out.println(y.e);//11
		System.out.println(y.f);//22
		System.out.println(y.g);//70
		System.out.println(y.h);//80
		System.out.println();
		System.out.println(z.e);//33*33=1089
		System.out.println(z.f);//60
		System.out.println(z.g);//33
		System.out.println(z.h);//80	
		System.out.println();
		System.out.println(u.e);//11
		System.out.println(u.f);//22
		System.out.println(u.g);//70
		System.out.println(u.h);//80
		System.out.println();
		System.out.println();
		System.out.println();
		
		Year();//static method call
		System.out.println(Year());
		System.out.println(x.Sub());
		x.Sub();
		x.Mult();
		x.Add();
	}
}