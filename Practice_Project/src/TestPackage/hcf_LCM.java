package TestPackage;

public class hcf_LCM {
	public static void main(String[] args) {
		
		int hcf=1,n1=12,n2=18,lcm;
		for(int i=1;i<n1-1;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				hcf=i;
			}
		}
		lcm=n1*n2/hcf;
		System.out.println(" LCM is:-"+lcm);
		System.out.println(" HCF is:-"+hcf);
	}

}
