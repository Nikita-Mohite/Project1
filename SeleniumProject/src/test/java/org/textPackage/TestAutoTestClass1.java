package org.textPackage;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomPackage.testAutomationFrame;
import org.pomPackage.testAutomationPage;
import org.pomPackage.testAutomationPoM;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAutoTestClass1 {

	private WebDriver driver;
	private testAutomationPoM pom;
	private testAutomationPage page;
	private testAutomationFrame frame;
	
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
	public void browserLaunch() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void Frame1() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		pom=new testAutomationPoM(driver);
		pom.text();
		pom.search();
		pom.AlertClickMe();
		pom.datepicker();
		pom.date();
		pom.Speed();
		pom.file();
		pom.num();
		pom.product();
		pom.Animal();
		pom.tabel();
	}
	
	@Test(priority=1)
	public void Frame2()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		frame=new testAutomationFrame(driver);
		frame.iframe();
		frame.fname();
		frame.lname();
		frame.phone();
		frame.country();
		frame.city();
		frame.Address();
		frame.female();
		frame.Monday();
		frame.Morning();
		frame.Sub();
	}
	
	@AfterMethod
	public void Frame3()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		page=new testAutomationPage(driver);
		page.click();
		page.cli();
		page.copytext();
		page.dragAndDrop();
	}
	
	@AfterClass
	public void gc()
	{
		pom=null;
		page=null;
		frame=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
