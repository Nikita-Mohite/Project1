package Inheritance;

public class ClassD extends ClassA{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Access specifiers
			Class c
			ClassB x=new ClassB();
			x.Test();//non-static methods
			ClassB.Demo();//static method
			s.o.p(CLassB.a);
			s.o.p(x.b);
		 */
		System.out.println(a);
		ClassD x=new ClassD();
		System.out.println(x.b);
		Test();
		x.Add();
	}

}
