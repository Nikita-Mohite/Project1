package SeleniumKeyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Test Method");
	}
	
	@Test (priority=-1, invocationCount=3)
	public void test1()
	{
		System.out.println("Test1 Method");
	}
	
	@Test (invocationCount=2)
	public void test2()//bcz of invocationCOunt keyword this method will execute 2 times
	{
		System.out.println("Test2 Method");
	}
	
	@Test 
	public void test3()
	{
		System.out.println("Test3 Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}

}
