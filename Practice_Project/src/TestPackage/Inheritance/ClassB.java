package Inheritance;
//import Inheritance.ClassA;
public class ClassB extends ClassA{
	
	public void Print()
	{
		System.out.println("This is non-static method of subclass CLassB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB y=new ClassB();//obj creation of sub ClassB
		
		System.out.println(y.b);//20
		y.Add();
		System.out.println(a);//10
		ClassA.Test();
		y.Print();
	}

}
