package If_statement;

public class Ladder_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=300;
		int c=50;
		int d=200;
		
		
		System.out.println(" * To find largest number among given 4 nos *");
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(" A Largest number is: "+a);
				}
				else
				{
					System.out.println(" D Largest number is: "+d);
				}
			}
			
		}
		else 
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(" B Largest number is: "+b);
				}
				else
				{
					System.out.println(" D Largest number is: "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(" c Largest number is: "+c);
				}
				else
				{
					System.out.println(" D Largest number is: "+d);
				}
			}
		}
		
	}

}
