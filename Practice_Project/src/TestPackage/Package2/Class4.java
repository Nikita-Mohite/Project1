package Package2;

import Package1.Class1;
public class Class4 extends Class1
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class4 x=new Class4();
		//Class1 y=new Class1();
		//static variables
		System.out.println(a);//public  
		//System.out.println(b);//default
		//System.out.println(c);//private
		System.out.println(d);//protected
		//non-static variables
		System.out.println(x.e);//public
		//System.out.println(x.f);//default
		//System.out.println(x.g);//private
		System.out.println(x.h);//protected
		
		//static Method
		x.Sub();//public
		//x.Add();//default
		x.Mult();//protected
		//non-static methods
		Ans();//public
		//Day();//Default
		Year();//Protected
		
		
	}

}
