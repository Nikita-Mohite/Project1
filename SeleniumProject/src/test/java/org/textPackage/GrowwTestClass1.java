package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.GrowwLogout;
import org.pomPackage.GrowwNewAccount;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GrowwTestClass1 {
	
	private WebDriver driver;
	private GrowwNewAccount acc;
	private GrowwLogout logout;

	@BeforeTest
	@Parameters("browser")
	public void BrowserLaunch(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\Firefox driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	}
	
	@BeforeClass
	public void Login() throws InterruptedException
	{
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
	}
	
	@BeforeMethod
	public void login()
	{
		acc=new GrowwNewAccount(driver);
		acc.login();
	}
	@Test
	public void Test1() throws InterruptedException
	{
		//Verify login button for Groww Aplication
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Welcome to Groww"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(2000);
//		Assert.assertEquals(title, "Welcome to Groww", "Groww Title is Wrong");
//		Assert.assertNotEquals(title, "Welcome to Groww");
//		Thread.sleep(2000);
//		boolean result=title.equals("Welcome to Groww");
//		Assert.assertTrue(result);//true=pass false=fail
//		Assert.assertFalse(result);//false=pass
		Thread.sleep(2000);
		acc.yourmail();
		acc.Continue();
		acc.passowrd();
		acc.submit();
		acc.TPIN1();
		acc.TPIN2();
		acc.TPIN3();
		acc.TPIN4();
	}

	@AfterMethod
	public void Logout() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logout=new GrowwLogout(driver);
		logout.Arrow();
		Thread.sleep(2000);
		logout.logout();
	}
	
	@AfterClass
	public void gc()
	{
		acc=null;
		logout=null;
	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
}
