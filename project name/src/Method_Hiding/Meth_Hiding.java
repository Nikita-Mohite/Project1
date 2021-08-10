package Method_Hiding;

public class Meth_Hiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child.Demo();
		
		Parent.Demo();
		int a=Parent.Test(4);
		Parent.Test(6);
		System.out.println(a);
	}

}
