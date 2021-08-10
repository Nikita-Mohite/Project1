package All16042021;

public class Armstong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=371,temp,sum=0,a;
		
		temp=num;
		while(temp>0)
		{
			a=temp%10;//371%10=1//37%10=7//3%10=3
			sum=sum+(a*a*a);//0+1=1//1+(7*7*7)=344//344+27=371
			temp=temp/10;//371/10=37//37/10=3
		}
		if(num==sum)
			System.out.println(sum+ " is armstong no");
		else
			System.out.println(sum+ " is not armstong no");
				
	}

}
