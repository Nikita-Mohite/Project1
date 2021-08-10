package Loop;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12,originalNumber,remainder,result=0;
		
		System.out.println("Find Armstrong number program");
		originalNumber=num;
	
		while(originalNumber!=0)
		{
			remainder=originalNumber%10;
			result=result+(remainder*remainder*remainder);
			originalNumber=originalNumber/10;
		}
		
		if(result==num)
		{
			System.out.println("armstrong no is: "+result);
		}
		else
		{
			System.out.println("no is not Armstrong");
		}
		
		
	}

}
