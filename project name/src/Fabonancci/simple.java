package Fabonancci;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,c=0;
		
		System.out.println("Fabonancci series");
		
		for(int i=0;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

}
