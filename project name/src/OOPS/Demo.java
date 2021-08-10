package OOPS;

public class Demo extends Abstract{
	
	void Test()
	{
		System.out.println("This is method of abstract class which is completed in subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Now this has become concrete class");
		
		Demo x=new Demo();
		x.Test();
		x.Show();
	}

}
