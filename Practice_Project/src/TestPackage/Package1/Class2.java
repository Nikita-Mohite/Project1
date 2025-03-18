package Package1;

public class Class2 {
	
	public static void Display()
	{
		System.out.println("It is method of Class2 ");
	}
	public static void main(String[] args)
	{
     	Class1 x=new Class1();
		Class1 z=new Class1(111);
		Class1 u=new Class1(22);
		Class1 v=new Class1(444,555,666);
		//Static variables
		System.out.println(Class1.a);//public AS, static variable of class1
		System.out.println(Class1.b);//default AS, static variable of Class1
		//System.out.println(Class1.c);//bcz this is private variable of class1 which is not accessed outside class1
		System.out.println(Class1.d);//protected AS, static variable of  class1
		
		//Non-static variables
		System.out.println(x.e);//public
		System.out.println(x.f);//default
		//System.out.println(x.g);//private
		System.out.println(x.h);//protected
		System.out.println();
		
		Display();
		//Static Method
		Class1.Ans();//static method call by using ClassName of same class
		Class1.Day();
		Class1.Year();
		
		//Non-static Method
		x.Add();//nonstatic method call by using object of same class
		x.Sub();
		x.Mult();
		
		System.out.println(z.Add());
		System.out.println(v.Sub());
		System.out.println(x.Mult());
		System.out.println(Class1.Day()+" days is present in one week in "+Class1.Year()+" year ");
		//System.out.println(Class1.Ans());
		System.out.println(Class1.Year());
		
		
		
	}

}
