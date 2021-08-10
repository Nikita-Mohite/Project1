package AllPrograms;

public class hcf_lcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=8,n2=20,h=1,lcf;
		System.out.println("To find hcf and lcf of nos");
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				h=i;
			}
			
		}
		
		lcf=(n1*n2)/h;
		
		System.out.println("HCF is: "+h);
		System.out.println("LCF is: "+lcf);
	}

}
