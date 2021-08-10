package Method_Overriding;

public class SubClass extends SuperClass{

	public void Demo()
	{
		SuperClass y=new SuperClass();
		y.Demo();
		
		System.out.println("This is method of SubClass");
		System.out.println("This method executes after subclass object creation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass x=new SubClass();
		x.Demo();
		
		SuperClass y=new SuperClass();
		y.Demo();
		
	}

}
