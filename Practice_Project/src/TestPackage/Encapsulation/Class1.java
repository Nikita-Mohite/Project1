package Encapsulation;

public class Class1 {
	
	private int a=10;
    private static int b=20;
    
    Class1 z;
    public void setMethod(int x,int y)
    {
    	z.a=x;
    	b=y;
    }
	
    public int getMethod()
    {
    	a=a*a;
    	b=b/a;
    	
    	System.out.println("Result of multiplication: "+a);
    	System.out.println("Result of Division: "+b);
    	return a;
    }
    /*
    public static void main(String[] args) {
    	
    	Class1 n=new Class1();
		n.setMethod(10,20);
		n.getMethod();
		int result=n.getMethod();
    }
	*/

}
