package SeleniumKeyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Private {
	
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
	
	@Test (priority=-1)
	public void test1()
	{
		System.out.println("Test1 Method");
	}
	
	@Test (priority=0)
	public void test2()
	{
		System.out.println("Test2 Method");
	}
	
	@Test (priority=1)//by using priority keyword we can change the execution order of method
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
