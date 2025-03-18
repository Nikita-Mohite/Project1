package Array;

public class Armstrong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("* Program to fine armstong Number *");
		
		int num=371,temp,remainder,result=0,n=0;
		temp=num;
		 
		for(;temp!=0;temp/=10,++n)
			//temp=num;
		
		{
			remainder=temp%10;
			remainder=temp/10;
			result=result+(remainder*remainder*remainder);
		}
		
		if(result==num)
		
			System.out.println("Amrstrong no is: "+n);
		else
			System.out.println("Amrstrong no is not arm");
	}

}
