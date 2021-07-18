package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.pomPackage.testAutomationPoM;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAutoAssertion {

	
	private WebDriver driver;
//	private testAutomationPoM pom;
	
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
	
	@BeforeMethod
	public void Login() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
	}
	
	@Test
	public void ValidationOfusernameTextbox()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "Automation Testing Practice");
		
//		pom=new testAutomationPoM(driver);
		
		WebElement text=driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		Assert.assertTrue(text.isDisplayed());
		text.click();
		
	
	}
	@AfterMethod
	public void Gc()
	{
//		pom=null;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
