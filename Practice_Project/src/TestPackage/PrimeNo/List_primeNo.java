package PrimeNo;

public class List_primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		System.out.println("Listout prime nos between 1 - 100");
		for(int i=0;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)//20%2==0
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}
	}

}
