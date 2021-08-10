package SeleniumKeyword;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependOnMethods {
	
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
	
	@Test(dependsOnMethods= {"test1"})//test1() is independent method n Test() is dependent method on Test1()method
	//here test1() will execute 1st n then control will go to test() n this will get execute
	public void Test()
	{
		System.out.println("Test Method");
	}
	
	@Test (priority=2)//pri=2
	public void test1()
	{
		System.out.println("Test1 Method");
	}
	
	@Test (priority=1 )//pri=1
	public void test2()
	{
		System.out.println("Test2 Method");
		Assert.fail();
	}
	
	@Test (enabled=false)//pri=3
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
