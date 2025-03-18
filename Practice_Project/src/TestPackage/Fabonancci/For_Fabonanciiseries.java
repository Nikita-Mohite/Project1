package Fabonancci;

public class For_Fabonanciiseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0,num2=1,num3;
		System.out.println("Print fabonancii series between 1-20");
		for(int i=0;i<=20;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
