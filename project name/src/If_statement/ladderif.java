package If_statement;

public class ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=3;
		int c=7;
		int d=4;
		int e=1;
		
		System.out.println("Find greatest no among 5 nos: ");
		System.out.println("a=5 ");
		System.out.println("b=3 ");
		System.out.println("c=7 ");
		System.out.println("d=4 ");
		System.out.println("e=1 ");
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
					{
						System.out.println("Print a: "+a);
					}
					else
					{
						System.out.println("Print e: "+e);
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println("Print d: "+d);
					}
					else
					{
						System.out.println("Print e: "+e);
					}	
				}
			}
			else
			{
				if(c>d)
				{
					if(c>e)
					{
						System.out.println("Print c: "+c);
					}
					else
					{
						System.out.println("Print e: "+e);
					}
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						System.out.println("Print b: "+b);
					}
					else
					{
						System.out.println("Print e: "+e);
					}
				}
			}
		}
	}

}
