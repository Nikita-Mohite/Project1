package All16042021;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("To find even nos");
		System.out.println("no is even no :");	
		for(int i=1;i<=10;i++)//0-10
		{
			num=i;
			if(num%2==0)//20/2=10/2=5	
			{
				System.out.println(num+ " ");	
			}
		}	
		System.out.println("no is odd no :");
	for(int i=0;i<=10;i++)//0-10
		{
			num=i;
			if(num%2!=0)//20/2=10/2=5	
			{
				System.out.println(num+ " ");	
			}
		}	
	}
}
