package Armstrong;
//import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,arm=0,n=30,temp;
		//int a,arm=0,n=371,temp;
		System.out.println("Armstrong no");
		
		//Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();
		temp=n;
		for(;n!=0;n/=10)
		{
			a=n%10;
			arm=arm+(a*a*a);
			
		}
		if(arm==temp)
			System.out.println(temp+" is armstrong number");
		else
			System.out.println("is not arm");
		
		}
		

	}


