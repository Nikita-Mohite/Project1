package SwapNo;

public class SwapNo_without_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		a=50;
		b=20;
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
		System.out.println("Swap two nos without using 3rd variable");
		a=a+b;//50+20=70
		b=a-b;//70-20=50
		a=a-b;//70-50=20
		System.out.println("After swap A is: "+a);
		System.out.println("After swap B is: "+b);
	}

}
