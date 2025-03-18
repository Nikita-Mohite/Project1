package all_12_04_2021;

public class Array_EvneOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find Even-Odd numbers using Array ");
		int a[]= {2,3,4,5,6,7,8,9,0};
		int length=a.length;
		System.out.println("Even nos are as follows: ");
		for(int i=0;i<length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd nos are as follows: ");
		for(int i=0;i<length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
