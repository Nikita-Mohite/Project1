package org.testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.HomePage;
import org.pomPackage.LoginPage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGFlowExecution_Class {

	private WebDriver driver;
	private HomePage homepage;
	private LoginPage loginpage;
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite TestNG");
	}
	
	@BeforeTest
	@Parameter ("browser")
	public void BeforeTest(String browser)
	{
		System.out.println("Launch the Browser");
		System.out.println("Open the url");
		System.out.println("Implicit wait");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Nikita\\Testing OLD\\Testing OLD Programming_2025\\Software_driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Nikita\\Testing OLD\\Testing OLD Programming_2025\\Software_driver\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);		
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Login Page");
		System.out.println("Create Object");
		
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println(" Login into account Code");
	}
	
	@Test
	public void TestM1()
	{
		System.out.println("Test case 1-apply assertion");
		Assert.assertEquals(false, null);
		SoftAssert soft = new SoftAssert();
		soft.assertAll();
	}
	
	@Test
	public void TestM2()
	{
		System.out.println("Test case 2");
		Assert.assertEquals(false, null);
		SoftAssert soft = new SoftAssert();
		soft.assertAll();
	}
	
	@AfterMethod()
	public void AfterMethod()
	{
		System.out.println("Logout from account  code ");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Nullify the Object");
		homepage = null;
		loginpage = null;
		
	}
	
	@AfterTest()
	public void AfterTest()
	{
		System.out.println("Close Browser");
		driver.quit();
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite TestNG");
	}
	
}
