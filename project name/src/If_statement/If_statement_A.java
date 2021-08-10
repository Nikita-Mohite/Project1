package If_statement;

public class If_statement_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=30;
		int b=50;
		int c=100;
		
		System.out.println("Find largest value among given no: ");
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater than c: "+a);
			}
			else
			{
				System.out.println("C is greater than a: "+c);
			}
		}
		else
			if(b>c)
			{
				System.out.println("B is greater than c: "+b);
			}
			else
			{
				System.out.println("C is greater than b: "+c);
			}
		
		
	}

}
