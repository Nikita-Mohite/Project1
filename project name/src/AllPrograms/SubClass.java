package AllPrograms;

public class SubClass extends SuperClass{
	
	public static int a=100;
	public int b=200;
	
	void demo()
	{
		int a=1000;
		System.out.println("value of a: "+a);//1000
		System.out.println("value of a: "+a);//100
		System.out.println("value of a: "+a);//10
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SubClass q=new SubClass();
		q.demo();
		q.test();
	}

}
