package Method_Hiding;

public class Child extends Parent {
	
	static void Demo()
	{
		System.out.println("This is method of Child Class ");
		System.out.println("Child class aquires property of parent class but at the execution time it will call only its own method even child is having 3 methods after inheritance");
	}

}
