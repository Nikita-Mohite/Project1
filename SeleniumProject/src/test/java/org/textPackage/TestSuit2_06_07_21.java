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

public class TestSuit2_06_07_21 {
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite method of TestClass2");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest method of TestClass2");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass method of TestClass2");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod method of TestClass2");
	}
	@Test
	public void Test()
	{
		System.out.println("Test2 method of TestClass2");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod method of TestClass2");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass method of TestClass2");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest method of TestClass2");
	}
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("AfterSuit method of TestClass2");
	}
}
