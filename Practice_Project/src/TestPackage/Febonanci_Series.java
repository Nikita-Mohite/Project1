package TestPackage;

public class Febonanci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1=0,no2=1,no3;
		for(int i=0;i<6;i++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.println(no3);
		}
		

	}

}
