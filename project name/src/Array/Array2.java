package Array;
//import java.util.Arrays;
public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("# Basic Operations in Array #");

		int a[]= {4,7,2,9,87,54,22,25,123};//size=9;index=0---8;
		int temp;
		//int [] b= {33,44,21,55,66,77,88,99,65};
		//int c[]=new int [5];
		//int [] d=new int[24];
		System.out.println("Print array a: ");	
		for(int i=0;i<9;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		
		System.out.println("Print array a in reverse order: ");	
		for(int i=8;i>=0;i--)
		{
			System.out.println(a[i]);
			
		}
		System.out.println();
		
		int f=a.length;//c=a+b;
		System.out.println("Print length of array a: "+f);
		
		a[5]=11;//0,1,2,3,4,5,6
		System.out.println(a[5]);
		for(int i=0;i<9;i++)
		{
			System.out.println(a[i]);	
		}
		
		System.out.println();	
		
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		System.out.println("Array a in ascending order: ");
		for(int i=0;i<f;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		System.out.println();
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		System.out.println("Array a in descending order: ");
		for(int i=0;i<f;i++)
		{
			//System.out.print(" ");
			System.out.print(a[i]+" ");
		}
		
		
		
		
			

	}

}
