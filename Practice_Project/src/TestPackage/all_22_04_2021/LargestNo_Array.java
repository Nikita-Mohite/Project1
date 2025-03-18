package all_22_04_2021;

public class LargestNo_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={33,65,32,78,68,56,43,88,74,45};
		int max=a[0];
		System.out.println("find largest num from array");
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
		}
		System.out.println(max);
	}
}
