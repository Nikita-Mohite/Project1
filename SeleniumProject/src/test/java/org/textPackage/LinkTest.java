package org.textPackage;

import java.util.concurrent.TimeUnit;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.pomPackage.GrowwHomePOM;
import org.pomPackage.GrowwLogout;
import org.pomPackage.GrowwNewAccount;
//import org.pomPackage.LinkFetch;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest {

	private WebDriver driver;
	private GrowwNewAccount acc;
	private GrowwLogout logout;
//	private LinkFetch linka;
	@BeforeClass
	public void BrowserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void UrlOpen() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
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
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> link=driver.findElements(By.xpath("//a"));
		for(int i=0;i<link.size()-1;i++)
		{
			//WebElement si=link.get(i).getAttribute(link);
			String s=link.get(i).getText();
			System.out.println(s);
		}
//		linka=new LinkFetch(driver);
//		linka.method();
		
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
