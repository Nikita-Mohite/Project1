package Armstrong;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,n,arm=0,x;
		
		System.out.println("Armstrong num");
		
		while(i<500)
		//for(int i=1;i<=500;i++)
		{
			n=i;
			//arm=0;
			while(n>0)
			{
			x=n%10;
			arm=arm+(x*x*x);
			n=n/10;
			}
		if(arm==i)
			System.out.println(i);
		i++;
	}
	}

}
