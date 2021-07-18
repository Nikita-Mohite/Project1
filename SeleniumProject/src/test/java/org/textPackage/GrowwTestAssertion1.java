package org.textPackage;

import java.util.concurrent.TimeUnit;
import org.pomPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GrowwTestAssertion1 {

	private WebDriver driver;
	private GrowwNewAccount acc;
	private GrowwLogout logout;
	
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
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
	}
	
	@Test
	public void ValidationOfLoginPage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement loginButton=driver.findElement(By.xpath("//span[text()=\"Login/Register\"]"));
		Assert.assertTrue(loginButton.isDisplayed());
		loginButton.click();
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@id=\"login_email1\"]"));
		Assert.assertTrue(user.isDisplayed());
		user.sendKeys("mohitenikita1995@gmail.com");
		Thread.sleep(2000);
		WebElement continueButton=driver.findElement(By.xpath("//span[text()='Continue']"));
		Assert.assertTrue(continueButton.isDisplayed());
//		Assert.assertFalse(continueButton.isDisplayed());
		continueButton.click();
		Thread.sleep(2000);
//		String coun=continueButton.getText();
//		Assert.assertEquals(coun,"Continue");
//		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"login_password1\"]"));
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("Abcdefgh@1234");
		Thread.sleep(2000);
//		String val=pass.getText();
//		Assert.assertEquals(val,"Abcdefgh@1234");
//		Thread.sleep(2000);
		
		WebElement submitButton=driver.findElement(By.xpath("//span[text()='Submit']"));
		Assert.assertTrue(submitButton.isDisplayed());
		Thread.sleep(2000);
		submitButton.click();
		Thread.sleep(2000);
//		String submi=submitButton.getText();
//		Assert.assertEquals(submi,"Submit");
//		Thread.sleep(2000);
//		
		acc=new GrowwNewAccount(driver);
		acc.TPIN1();
		acc.TPIN2();
		acc.TPIN3();
		acc.TPIN4();
		Thread.sleep(3000);	
		String urlOfMainPage=driver.getCurrentUrl();
		System.out.println(urlOfMainPage);
		Assert.assertEquals(urlOfMainPage, "https://groww.in/dashboard/explore/stocks");
		Thread.sleep(3000);	
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
