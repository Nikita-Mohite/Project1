package Encapsulation;

public class Class1 {
	
	private int a=10;
    private static int b=200;
    
   // Class1 z=new Class1();
    //Class1 z;//obj
    public void setMethod(int x,int y)
    {
    	Class1 z=new Class1();
    	z.a=x;//10
    	b=y;//200
    }
	
    public int getMethod()
    {
    	a=a*a;//10*10=100
    	b=b/a;
    	
    	System.out.println("Result of multiplication: "+a);//100
    	System.out.println("Result of Division: "+b);//2
    	return a;//100
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
