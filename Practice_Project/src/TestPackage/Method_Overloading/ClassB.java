package Method_Overloading;

class ClassB
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA x=new ClassA(11,22);
		ClassA y=new ClassA('W');
		
		System.out.println(ClassA.a);//11
		System.out.println(x.b);//22
		System.out.println(y.b);//200
		System.out.println(x.c);//R
		System.out.println(y.c);//W
		
		x.Test('W');//static method
		x.Test(22,33);//b=22*22=484
		y.Test(111,222);//b=111*111=
		
	}

}
