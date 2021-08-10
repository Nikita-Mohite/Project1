package All_01_05_2021;

public class Large_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=80;
		int c=40;
		int d=55;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("Print a"+a);
				}
				else
				{
					System.out.println("Print c"+c);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("Print b"+b);
				}
				else
				{
					System.out.println("Print d"+d);
				}	
			}	
			else
			{
				if(c>d)
				{
					System.out.println("Print c"+c);
				}
				else
				{
					System.out.println("Print d"+d);
				}
					
			}
		}
	}

}
