package SeleniumKeyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut {

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
	
	@Test 
	public void test1()
	{
		System.out.println("Test1 Method");
	}
	
	@Test (timeOut=2000)//this will get fail bcz of timeout time is less than delay time
	public void test2() throws InterruptedException
	{
		System.out.println("Test2 Method");
		Thread.sleep(3000);
	}
	
	@Test (timeOut=3000)//this method will get execute in maximum 3sec
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
