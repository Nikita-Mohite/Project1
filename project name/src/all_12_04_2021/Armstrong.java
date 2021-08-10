package all_12_04_2021;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,x,n,i=0;
		System.out.println("Find Armstrong program");
		//for(int i=0;i<=500;i++)
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
				System.out.println(i+" is an armstrong number");
				//i++;
			}
			i++;
		}
	}

}
