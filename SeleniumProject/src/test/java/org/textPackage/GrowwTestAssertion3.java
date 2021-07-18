package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.GrowwLogout;
import org.pomPackage.GrowwNewAccount;
import org.pomPackage.GrowwSell;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GrowwTestAssertion3 {

	private WebDriver driver;
	private GrowwNewAccount acc;
	
	private SoftAssert soft;
	private GrowwLogout logout;
	private GrowwSell sell;
	
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
	public void OpenURl() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void Login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		acc=new GrowwNewAccount(driver);
		acc.login();
		acc.yourmail();
		acc.Continue();
		acc.passowrd();
		acc.submit();
		acc.TPIN1();
		acc.TPIN2();
		acc.TPIN3();
		acc.TPIN4();
		Thread.sleep(3000);
	}
	
	@Test 
	public void ValidationOfSellButton() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		soft=new SoftAssert();
		sell=new GrowwSell(driver);
		sell.Search();
		Thread.sleep(2000);
		WebElement sel=driver.findElement(By.xpath("//div[text()='SELL']"));
		soft.assertTrue(sel.isEnabled());
		sell.Sell();
		//sell.Delivery();
		sell.BSE();
		
		
		sell.inputvalue();
		sell.Limit();
//		String value=sell.MarketPriceOfShare();
//		soft.assertEquals(value, "2149.50");
		
		sell.AdvanceOptions();
		sell.RegularOrder();
		sell.SLOrder();
		sell.Day();
		sell.CONTINUE();
		
//		WebElement msg=driver.findElement(By.xpath("//div[text()='0 shares are available to sell']"));
//		String displaymsg=msg.getText();
//		Assert.assertEquals(displaymsg, "0 shares are available to sell");
//		
		WebElement selbut=driver.findElement(By.xpath("//div[text()='SELL']"));
		soft.assertFalse(selbut.isEnabled());
		sell.SellButton();
		
	}
	@AfterMethod
	public void Logout() throws InterruptedException
	{
		logout=new GrowwLogout(driver);
		logout.Arrow();
		Thread.sleep(2000);
		logout.logout();
	}
	
	@AfterClass
	public void gc()
	{
		logout=null;
		sell=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
