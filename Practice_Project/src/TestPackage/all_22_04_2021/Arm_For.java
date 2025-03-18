package all_22_04_2021;
import java.util.Scanner;

public class Arm_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp,sum=0,r;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);//create object for scanner
		int a=s.nextInt();//read object
		s.close();
		temp=a;
		while(temp!=0)//(371!=0)//(37!=0)//(3!=0)
		{
			r=temp%10;//371%10=1//37%10=7//3%10=3
			sum=sum+(r*r*r);//0+1=1//1+343=344//344+27=371
			temp=temp/10;//371/10=37//37/10=3=3/10=0
		}
		if(sum==a)
		
			System.out.println(a+" is an armstrong number");
		else
			System.out.println(a+ "is not an armstrong number");
		
	}

}

