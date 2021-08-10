package Interface;

public interface Interface {

	public static void StaticMethod()//this is complete static method so we can call it
	{
		System.out.println("This is static method of Interface ");
	}
	default void DefaultMethod()
	{
		System.out.println("This is Default method of Interface ");
	}
	int a=40;//public,static,final
	int b=60;//public,static,final
	void sum();
	void sub();
	void mult();
	void div();
	void mod();
	void test();
	void demo();
	void show();
}
