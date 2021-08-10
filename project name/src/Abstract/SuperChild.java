package Abstract;

public class SuperChild extends Child {
	void A()
	{
		System.out.println("Method A");
	}
	void B()
	{
		System.out.println("Method B");
	}
	void C()
	{
		System.out.println("Method C");
	}
	void D()
	{
		System.out.println("Method D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChild x=new SuperChild();
		
		x.Dog();
		x.Cat();
		x.Tiger();
		x.Lion();
		x.A();
		x.B();
		x.C();
		x.D();
		x.Eat();
		x.show();

	}

}
