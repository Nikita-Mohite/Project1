package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.GrowwHomePOM;
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

public class GrowwTestClass2 {

	private WebDriver driver;
	private GrowwNewAccount acc;
	private GrowwLogout logout;
	private GrowwHomePOM page;
	
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
	public void OpenURL() throws InterruptedException
	{
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
	}
	@BeforeMethod
	public void Login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		acc=new GrowwNewAccount(driver);
		Thread.sleep(3000);	
		acc.login();
		acc.yourmail();
		acc.Continue();
		acc.passowrd();
		acc.submit();
		acc.TPIN1();
		acc.TPIN2();
		acc.TPIN3();
		acc.TPIN4();
		Thread.sleep(2000);
	}
	
	@Test
	public void Test1() throws InterruptedException
	{
		//Verify login button for Groww Aplication
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page=new GrowwHomePOM(driver);
		page.Search();
		Thread.sleep(2000);
		page.Buy();
		Thread.sleep(2000);
		page.Delivery();
		Thread.sleep(2000);
		page.NSE();
		Thread.sleep(2000);
		page.BSE();
		Thread.sleep(2000);
		page.inputvalue();
		Thread.sleep(2000);
		page.Limit();
		Thread.sleep(2000);
		page.Market();
		Thread.sleep(2000);
		page.AdvanceOptions();
		Thread.sleep(2000);
		page.RegularOrder();
		Thread.sleep(2000);
		page.SLOrder();
		Thread.sleep(2000);
		page.Day();
		Thread.sleep(2000);
//		page.Immediatly();
//		Thread.sleep(2000);
		page.CONTINUE();
		Thread.sleep(2000);
		page.AddMoney();
		Thread.sleep(2000);
		page.stockAddMoneyInput();
		Thread.sleep(2000);
		page.AddMoneyfinal();
		Thread.sleep(2000);
		//page.BuyButton();
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
