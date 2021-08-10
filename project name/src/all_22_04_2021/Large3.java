package all_22_04_2021;

public class Large3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=80;
		int b=50;
		int c=70;
		System.out.println("find largest number among 3 nos");
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Large: "+a);
			}
			else 
			{
				System.out.println("C is large: "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is larger: "+b);
			}
			else
			{
				System.out.println("C is large: "+c);
			}
		}	
	}
}
