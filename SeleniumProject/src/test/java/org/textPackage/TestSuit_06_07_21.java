package org.textPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestSuit_06_07_21 {

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite method of TestClass1");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest method of TestClass1");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass method of TestClass1");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod method of TestClass1");
	}
	@Test
	public void Test()
	{
		System.out.println("Test1 method of TestClass1");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod method of TestClass1");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass method of TestClass1");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest method of TestClass1");
	}
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("AfterSuit method of TestClass1");
	}
}
