package Method_Overloading;

public class ClassA {
		
		public static int a=123;
		public int b=200;
	    char c='R';
		
		ClassA(int g,int h)
		{
			a=g;
			b=h;
		}
		ClassA(char r)
		{
			c=r;
		}
		public int Test(int a,int b)
		{
			b=a*a;
			System.out.println("Multiplication of 2 nos: "+b);
			System.out.println("This is non-static method of ClassA");
			return b;
		}
		public void Test(char c)
		{
			System.out.println("This is static method of ClassA"+c);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA x=new ClassA(1,2);
		ClassA y=new ClassA('c');
		System.out.println(a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(y.b);
		System.out.println(y.c);
		
		x.Test('n');
		x.Test(2,3);
		y.Test(4,5);
		
	}

}
