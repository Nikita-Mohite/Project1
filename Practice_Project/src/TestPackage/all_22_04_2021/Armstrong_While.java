/*
 * 371=3*3*3+7*7*7+1*1*1;
 * multiplication+addition
 * modulous-i will get single number
 * divide
 */

package all_22_04_2021;

public class Armstrong_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100,arm,temp,a;
		System.out.println("Find armstrong number between 100-9999");
		while(num<9999)
		{
		temp=num;
		arm=0;
		while(temp>0)//(371!=0)//(37!=0)//(3!=0)
		{
			a=temp%10;//371%10=1//37%10=7//3%10=3
			arm=arm+(a*a*a);//0+1=1//1+343=344//344+27=371
			temp=temp/10;//37/10=37//37/10=3=3/10=0
		}
		
		if(arm==num)
		
			System.out.println(num);
			num++;
		
		}
	
	}
}

/*
 * Output
 * Find armstrong number
 * 371 is an armstrong number
 */
