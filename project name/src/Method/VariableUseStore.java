package Method;

public class VariableUseStore {
	
	public static int test()
	{
		System.out.println("Here we are entering data for store");
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of program to run");
		
		System.out.println("so this is 1st step to execute the program");
		int x=test();//store data
		System.out.println(x);//value of varibles from test method is used n store the data
		

	}

}
