package TestPackage;

public class ArmstrongNum
{
	
	public static void main(String[] args) 
	{
		
		int arm,no=372,temp,r;
		temp=no;
		arm=0;
		
	//for(;temp!=0)
			
	//while(temp>0)
		while(temp!=0)
		{
			r=temp%10;
			arm=arm+(r*r*r);
			temp=temp/10;
		}
		if(no==arm)
			System.out.println(arm+ "is an arm no");
		else
			System.out.println(arm+ "is not an arm no");
	}

}
