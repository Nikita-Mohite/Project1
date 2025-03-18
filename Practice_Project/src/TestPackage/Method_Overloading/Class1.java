package Method_Overloading;

public class Class1 {
	

	public static void main(String args)
	{
		System.out.println("Main method String argument"+args);
	}
	
	public static void main(int a)
	{
		System.out.println("Main method int argument "+a);
	}
	
	public static void main(char R)
	{
		System.out.println("Main method char argument "+R);
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		
		main("Nikita");
		main(23);
		main('M');
		
		System.out.println("Method overloading of main-method is possible in mian method ");

	}

}
