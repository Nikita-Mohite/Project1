package Armstrong;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		int a=0,x,n,i=0;
		System.out.println("Armstrong no using while loop");
		while(i<500)
		{
			n=i;
			while(n>0)
			{
				x=n%10;
				a=a+(x*x*x);
				n=n/10;
			}
			if(a==i)
			{
				System.out.println(i);
			}
			i++;
			
		}
	}
}