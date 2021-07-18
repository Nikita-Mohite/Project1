package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.GrowwHomePOM;
import org.pomPackage.GrowwLogout;
import org.pomPackage.GrowwNewAccount;
//import org.pomPackage.GrowwSell;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GrowwAssertion2 {

	private WebDriver driver;
	private GrowwNewAccount acc;
	private GrowwHomePOM buy;
	private SoftAssert soft;
	private GrowwLogout logout;
//	private GrowwSell sell;
	
	@BeforeClass
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
	
	@BeforeMethod
	public void Login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
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
	}
	
	@Test
	public void ValidationOfBUYStock() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		soft=new SoftAssert();
		buy=new GrowwHomePOM(driver);
		Thread.sleep(3000);	
		soft.assertAll();
		
		WebElement search=driver.findElement(By.xpath("//input[@id=\"mainSearch1010\"]"));
		soft.assertTrue(search.isEnabled());
		Thread.sleep(3000);	
		buy.Search();
		
		String sd=buy.StockdisplayOnHomePage();
		
		soft.assertEquals(sd, "Reliance Industries");
		Thread.sleep(3000);	
		WebElement buyy=driver.findElement(By.xpath("//div[text()=\"BUY\"]"));
		soft.assertTrue(buyy.isEnabled());
		Thread.sleep(3000);	
		buy.Buy();
		
		WebElement button=driver.findElement(By.xpath("//span[text()='BUY']"));
		Assert.assertTrue(button.isEnabled());
		String str=button.getText();
		Assert.assertEquals(str, "BUY");
		buy.BuyButton();
		Thread.sleep(3000);	
		String url=driver.getCurrentUrl();
		soft.assertEquals(url, "https://groww.in/stocks/reliance-industries-ltd");
		Thread.sleep(2000);
		Thread.sleep(3000);	
		buy.NSE();
		Thread.sleep(2000);
		
		WebElement input=driver.findElement(By.xpath("//input[@id=\"inputShare\"]"));
		soft.assertTrue(input.isEnabled());
		input.sendKeys("1000");
		Thread.sleep(2000);
//		String num=input.getText();
//		Assert.assertEquals(num, "1000");
		
		buy.Limit();
		Thread.sleep(3000);	
		buy.Market();
		buy.AdvanceOptions();
		buy.RegularOrder();
		buy.SLOrder();
		buy.Day();
		buy.CONTINUE();
		buy.AddMoney();
		buy.stockAddMoneyInput();
		buy.AddMoneyfinal();
		
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
	public void closeBrowser()
	{
		driver.close();
	}
}
