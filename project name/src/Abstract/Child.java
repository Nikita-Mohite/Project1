package Abstract;

public abstract class Child extends Animal
{
	void Dog()
	{
		System.out.println("Dog is barking");
	}
	void Cat()
	{
		System.out.println("I just love Cat");
	}
	void Tiger()
	{
		System.out.println("Tiger is very dangerous");
	}
	void Lion()
	{
		System.out.println("Lion ia a king of Jungal");
	}
	abstract void A();
	abstract void B();
	abstract void C();
	abstract void D();
	void Eat()
	{
		System.out.println("Animals eat grass");
	}
	void show()
	{
		System.out.println("Show list of all animals");
	}
	

	

}
