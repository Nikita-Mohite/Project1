package All_23_04_2021;

public class Fabonancci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3;
		for(int i=0;i<=5;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
