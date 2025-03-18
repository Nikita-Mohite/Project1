package org.testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pomPackage.AmazonPOM_Class;


public class AmazonTest_Class {

			
		private WebDriver driver;
		private AmazonPOM_Class obj;
		
		//Keywords:- (priority = 1, invocationCount = 2, enabled = false, dependesOnMethods = {"Test"} , timeout = 3000)
		
		@BeforeSuite
		public void BeforeSuiteMethod()
		{
			System.out.println("Before Suite Method");
		}
		

		@BeforeTest
		public void BeforeTestMethod()
		{
			System.out.println("Before Test Method");
		}
		
		@BeforeClass 
		public void launchBrowser() throws InterruptedException 
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Nikita\\Testing OLD\\Testing OLD Programming_2025\\Software_driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@BeforeMethod 
		public void AmazonLogin() throws InterruptedException
		{
			System.out.println("Before Method for Login to Amazon");
		}

		@Test (priority=0, invocationCount = 2)
		public void Test() throws InterruptedException
		{
			obj = new AmazonPOM_Class(driver);
			obj.SearchItem();
			obj.ItemName();
			obj.mouseHoverAction();
			obj.SelectItem();
			obj.SelectBankOffer();
			obj.AddToKart();
			obj.ProceedToCheckoutButton();
			obj.AddToKart();
			
			//Assert.assertEquals(Actual, Expected);
			//Assert.assertNotEquals(actual, Expected, msg);
			Assert.assertTrue(true);
			Assert.assertFalse(false);
			
			SoftAssert soft = new SoftAssert();
			soft.assertAll();
			soft.onAssertFailure(null, null);
			soft.fail();
		}
		
		@Test (enabled = false)
		public void TestMethod()
		{
			System.out.println("Test Method 2");
		}
		
		@AfterMethod 
		public void Logout()
		{
			System.out.println("After Method for Logout");
			driver.quit();
		}
		
		@AfterClass
		public void CloseBrowser()
		{
			driver.close();
		}
		
		@AfterTest
		public void AfterTestMethod()
		{
			System.out.println("After Test Method");
		} 
		
		@AfterSuite
		public void AfterSuiteMethod()
		{
			System.out.println("After Suite Method");
		}
		
		

}
