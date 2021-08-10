package Method;

public class Constructor_Overloading {
	
		int a;
		static int b=100;
		Constructor_Overloading()//zero constructor
		{
			a=10;
			b=20;
		}
		Constructor_Overloading(int i,int j)//parameterized constructor
		{
			a=i;
			b=j;
		}
		
public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println(b);//100
	Constructor_Overloading x=new Constructor_Overloading();
	System.out.println(x.a);//calling of non-static element through object reference
	System.out.println(b);
	System.out.println(b);
	Constructor_Overloading y=new Constructor_Overloading(50,500);
		System.out.println(y.a);
		System.out.println(b);
		
		System.out.println(b);
	}

}
