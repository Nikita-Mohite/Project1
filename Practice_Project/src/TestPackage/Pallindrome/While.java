package Pallindrome;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123,temp,revers=0,remainder;
		System.out.println("Find pallindrome number using while loop");
		temp=num;
		while(temp!=0)
		{
			remainder=temp%10;//121%10=1//12%10=2//1%10=1
			revers=revers*10+remainder;//0+1=1//1*10+2=12//12*10+1=121//321
			temp=temp/10;//121/10=12//12/10=1//1/10=0
		}
		if(num==revers)//123==321
		{
			System.out.println(revers+" is pallindrome number");
		}
		else
		{
			System.out.println(revers+" is  not pallindrome number");
		}
	}

}
//121