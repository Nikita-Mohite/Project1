package Armstrong;

public class While_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num=370,OriNum,Remainder,Result=0;
		OriNum=Num;
		System.out.println("Find Armstrong number using while loop");
		while(OriNum!=0)
		{
			Remainder=OriNum%10;
			Result=Result+(Remainder*Remainder*Remainder);
			OriNum/=10;
			//OriNum=OriNum/10;
		}
		if(Result==Num)
		{
			System.out.println(Result+" is a Armstrong number");
		}
		else
		{
			System.out.println(Result+" is not Armstrong number");
		}
	}

}
