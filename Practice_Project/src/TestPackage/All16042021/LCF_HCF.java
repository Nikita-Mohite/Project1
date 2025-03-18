package All16042021;

public class LCF_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=12,num2=18,temp,temp1,temp2,hcf,lcf;
		System.out.println("Enter first number: "+num1);
		System.out.println("Enter second number: "+num2);
		temp1=num1;
		temp2=num2;
		while(temp2!=0)
		{
			temp=temp2;//temp=18
			temp2=temp1%temp2;//temp2=2/3
			temp1=temp;//temp1=18
		}
		hcf=temp1;
		lcf=(num1*num2)/hcf;
		
		System.out.println(hcf);
		System.out.println(lcf);
	}

}
