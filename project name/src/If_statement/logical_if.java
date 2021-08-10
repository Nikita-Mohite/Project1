package If_statement;

public class logical_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int b=3;
		int c=1;
		int d=4;
		
		System.out.println("Find lowest no among 4 nos: ");
		System.out.println("a=2 ");
		System.out.println("b=3 ");
		System.out.println("c=1 ");
		System.out.println("d=4 ");
		
		
		if(a<b && b<c && c<d )
		{
			System.out.println("Print a");
		}	
		else if(b<c && c<d )
			 {
				System.out.println("Print b");
			 }
		else if(b<d && d<c)
				{
					System.out.println("Print b");
				}
				else if(c<d)
				{
					System.out.println("Print c");
				}
				else
				{
					System.out.println("Print d");
				}
	}

}
