package All_28_04_2021;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find Pallindrome no using for for loop");
		
		int r,no=121,temp,sum;
		
			temp=no;
			sum=0;
			while(temp!=0)
			{
				r=temp%10;
				sum=sum*10+r;
				temp=temp/10;
			}
			if(no==sum)
			
				System.out.println(sum+ "is pallindrome no");	
			else
				System.out.println(sum+ "is not pallindrome no");
		}
	}


