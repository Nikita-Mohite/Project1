package All_23_04_2021;
import java.util.Scanner;

public class Swap_2_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WAP to Swap two arrays");
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you want to store");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Eneter elements of 1st array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display the array elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}	
		
		System.out.println("Enter the no of elements you want to store");
		int m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter elements of 2nd array");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Display the array elements");
		for(int i=0;i<m;i++)
		{
			System.out.println(b[i]);
		}	
		
		System.out.println("Swap elements of an array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i]!=b[j])
				{
					temp=a[i];
					a[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("Array a is");
		for(int i=n-1;i>=0;i--)
		{
		System.out.println(a[i]);
		}
		System.out.println("Array b is");
		for(int j=m-1;j>=0;j--)
		{
		System.out.println(b[j]);
		}
		
		
		

	}

}
