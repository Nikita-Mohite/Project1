/*
 * 
		5!=5*4*3*2*1=120
				fact=1;
				for(int i=5;i>=1;i--)//5,4,3,2,1
				{
					fact=fact*i;
					    5=1*5;
					   20=5*4;
					   60 =20*3;
					   120=60*2;
				}
 */
package All_28_04_2021;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
			System.out.println(fact);
	}

}
