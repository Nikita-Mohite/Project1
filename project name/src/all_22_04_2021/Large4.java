package all_22_04_2021;

public class Large4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=300;
		int b=700;
		int c=500;
		int d=400;
		System.out.println("Find largest no from given 4 nos");
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("A is large: "+a);
				}
				else
				{
					System.out.println("D is large: "+d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("B is large: "+b);
				}
				else
				{
					System.out.println("D is large: "+d);
				}
			}
			else
			{
				if(c>d)
				{
						System.out.println("C is large: "+c);
				}
				else
				{
					System.out.println("D is large: "+d);
				}			
			}
		}
	}
}
