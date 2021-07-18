package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.AmazonPOM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmaTestClass {

	private AmazonPOM amazon;
	private WebDriver driver;
	
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
			System.setProperty("webdriver.gecko.driver", "E:\\CLASS\\Automation\\Firefox driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	@BeforeClass
	public void OpenURL()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void method()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		amazon=new AmazonPOM(driver);
		amazon.Electronics();
	}
	
	@Test
	public void Purchase()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		amazon.Laptop();
		amazon.Pendrive();
		amazon.ScanDiskPendrive();
		amazon.GB();
		amazon.BuyButton();
		amazon.email();
		amazon.continue1();
		
	}
	@AfterMethod
	public void meth2()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		amazon.Password();
		amazon.signinButton();
	}
	@AfterClass
	public void gc()
	{
		amazon=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
