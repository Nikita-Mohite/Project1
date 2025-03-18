package All_01_05_2021;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=171,arm,r,temp;
		temp=no;
		arm=0;
		while(temp>0)
		{
			r=temp%10;
			arm=arm*10+r;
			temp=temp/10;
		}
		if(no==arm)
			System.out.println(arm+ "is an arm no");
		else
			System.out.println(arm+ "is not an arm no");


	}

}
