package EvenOdd;

public class For_ListOf_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print even-odd numbers between 1-50");
		System.out.println();
		System.out.println("List of even nos are: ");
		for(int i=0;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("List of odd nos are: ");
		for(int i=0;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
