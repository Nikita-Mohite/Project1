package All_23_04_2021;

public class Pallin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=221,temp,rev=0,a;
		temp=no;
		for(;temp!=0;temp/=10)
		{
			a=temp%10;
			rev=rev*10+a;
		}
		if(no==rev)
		
			System.out.println(rev);
		else
			System.out.println(rev+ " is not pallin");
	}

}
