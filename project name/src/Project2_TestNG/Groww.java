package Project2_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import Project1_TestNG.Ama_POM;

public class Groww {

	private WebDriver driver;
	private login lg;
	private Home page;
	private Logout out;
	
	@BeforeClass
	public void lunchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@BeforeMethod
	public void loginUser() throws InterruptedException
	{
		lg=new login(driver);
		lg.logi();
		Thread.sleep(2000);
		lg.yourmail();
		Thread.sleep(2000);
		lg.Continue();
		Thread.sleep(2000);
		lg.passowrd();
		Thread.sleep(2000);
		lg.submit();
		Thread.sleep(2000);
		lg.TPIN1();
		Thread.sleep(1000);
		lg.TPIN2();
		Thread.sleep(1000);
		lg.TPIN3();
		Thread.sleep(1000);
		lg.TPIN4();
		Thread.sleep(1000);	
	}
	
	@Test (priority=1)
	public void HomePage() throws InterruptedException
	{
		Home page=new Home(driver);		
		driver.getCurrentUrl();
		page.mainSearch();
		Thread.sleep(2000);
		page.Buy();	
	}
	
	@Test(priority=2)
	public void Purchase() throws InterruptedException
	{
		String text=driver.getTitle();
		System.out.println(text);
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
	}
	
	@AfterMethod
	public void Logout()
	{	
		out=new Logout(driver);
		out.Arrow();
		out.logout();
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
