package String;

public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Great Responcibility";//take a string
		//int count;
		char a[]=s.toCharArray();//convert string into array
		System.out.println("find Duplicate string from array");
		@SuppressWarnings("unused")
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] )
				{
					System.out.println("found duplicate: "+a[i]);
					flag=true;
				}
			}
		}
		if (flag=false)
		{
			System.out.println("Duplicate elements is not found");
		}
		
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			count=1;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j] && a[i]!='0')
//				{
//					count++;
//					a[j]='0';//set string to 0 to avoid printng visiting character
//				}
//			}
//			
//			if(count>0 && a[i]!='0')
//				System.out.println(a[i]);
//		}
		
	}

}
