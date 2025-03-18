package Loop;

public class Nested_forF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line=7;
		
		for(int x=1;x<=line;x++)
		{
			for(int b=line-x;b>=1;b--)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=x;a++)
			{
				System.out.print("*");
			}
			
			System.out.println( );
		}
		
		
	}

}

//*
//**
//***
//****
//*****
//******
//*******
