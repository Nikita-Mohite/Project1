package Inheritance;

public class ClassC extends ClassB{

	public static void Demo()
	{
		System.out.println("This is static method of super-sub-CLassC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			ClassA-SuperClass
			ClassB-sub Class
			ClassC-SubClass
			*/
		Demo();
		ClassC x=new ClassC();
		x.Print();
		x.Add();
		Test();
		System.out.println(a);
		System.out.println(x.b);
		
	}

}
