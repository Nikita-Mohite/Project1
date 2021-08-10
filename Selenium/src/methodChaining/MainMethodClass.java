package methodChaining;

public class MainMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Int1 z=new Class1();
		Int2 a=z.Test();
		Int3 b=a.Demo();
		b.MethodOfClass3();
		//method chaining
		z.Test().Demo().MethodOfClass3();
	}

}
