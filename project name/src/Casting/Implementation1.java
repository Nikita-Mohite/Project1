package Casting;
import java.util.Scanner;

public class Implementation1 implements Interface{
	
	public void EvenOdd()
	{
		System.out.println("Find EvenOdd no");
		System.out.println("Enetr no: ");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		s.close();
		if(x/2==0)
		{
			System.out.println(x+" is even no");
		}
		else
		{
			System.out.println(x+ "is odd no");
		}	
	}
	
	public void Prime()
	{
		System.out.println("Find Prime no");
		System.out.println("Enter the no: ");
		Scanner s=new Scanner(System.in);
		int temp=0;
		int no=s.nextInt();
		s.close();
		
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(no+ "is not prime no");
		}
		else
		{
			System.out.println(no+ "is prime no");
		}
	}
	
	public void Arm()
	{
	
		System.out.println("Find armstrong no");
		System.out.println("Enter the no: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.close();
		int sum,temp,r;
		sum=0;
		temp=a;
		while(temp>0)
		{
			r=a%10;
			sum=sum+(r*r*r);
			a=a/10;
		}
		if(a==sum)
			System.out.println(a+ "is armstrong no");
		else
			System.out.println(a+ "is not armstrong no");
	}
	
	public void Pallindrom()
	{
		System.out.println("Find Pallindrome no");
		System.out.println("Enter the no: ");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		s.close();
		int sum,temp,r;
		sum=0;
		temp=p;
		while(temp>0)
		{
			r=p%10;
			sum=sum*10+r;
			p=p/10;
		}
		if(sum==p)
		
			System.out.println(p+ "is Pallindrome no");
		else
			System.out.println(p+ "is not Pallindrome no");
	}
	
	public void Factorial() 
	{
		System.out.println("Find Factorial of given no");
		System.out.println("Enter the no: ");
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		s.close();
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a given no is: "+fact);
	}
	
	public void Fabonancci()
	{
		System.out.println("Find Factorial of given no");
		Scanner s=new Scanner(System.in);
		int no1=s.nextInt();
		System.out.println("Enter the no1: "+no1);
		int no2=s.nextInt();
		System.out.println("Enter the no2: "+no2);
		s.close();
		int no3;
		for(int i=0;i<=3;i++)
		{
		no3=no1+no2;
		no1=no2;
		no2=no3;
		System.out.println(no3+" is Fabonancci series");
		}
	}
		
	public void LcmHcf()	
	{
		System.out.println("Find HCF & LCM of given no");
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		System.out.println("Enter first no: "+h);
		int l=s.nextInt();
		System.out.println("Enter Second no: "+l);
		s.close();
		int hcf=1,lcm;
		for(int i=1;i<=h;i++)
		{
			if(l%i==0&&h%i==0)
			{
				hcf=i;
			}
		}
		lcm=h*l/hcf;
		System.out.println(hcf+ "is HCF of a given no");
		System.out.println(lcm+ "is LCM of a given no");
	}
}