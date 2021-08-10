package for_Loop05042021;

public class Loop {

	public static void main(String[] args) {
		int a=200;
		int b;
		if (a>400)
		{			
				if(a>300)				
				{
					b=a*100;
					System.out.println("Medium: "+b);
				}
				else if (a<=150)
				{
					b=a*200;
					System.out.println("small: "+b);
				}				
			else
			{			
				b=a*300;
				System.out.println("High: "+b);
			}	
		}
		else
		{
			System.out.println("* Condition is not satisfied *");
		}
	}
}
