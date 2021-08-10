package all_22_04_2021;

public class Fabonancci_ {

	public static void main(String[]args)
	{
		int num1=0,num2=1,c;
		System.out.println("Fabonancci series");
		for(int i=0;i<=10;i++)
		{
			c=num1+num2;
			num1=num2;
			num2=c;
			System.out.println(c);
		}
		
	}
}
