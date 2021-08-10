package SeleniumKeyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enable_Fail {

	
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
	
	@Test (enabled=false)
	public void test2()//this method will not consider in execution bcz of enabled=false keyword
	{
		System.out.println("Test2 Method");
	}
	
	@Test (priority=1)
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
