package Package2;

import Package1.Class1;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Class1.a);//public AS of class1
		//System.out.println(Class1.b);//default AS of Class1
		//System.out.println(Class1.c);//bcz this is private variable of class1 which is not accessed outside class1
		//System.out.println(Class1.d);//protected AS of class1
		Class1 i=new Class1();
		System.out.println(i.e);
		Class1.Ans();
		i.Sub();
		//i.Day();
		//i.Year();
		//i.Add();
		//i.Mult();
		
		
	}

}
