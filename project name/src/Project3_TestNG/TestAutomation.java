package Project3_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAutomation {

	private WebDriver driver;
//	private AutomationTest test;
//	private AutomationFrame frame;
//	private AutomationPOM pom;
	
	@BeforeClass
	public void lunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loginUser()
	{
		AutomationPOM pom=new AutomationPOM(driver);
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
	
	@Test (priority=1)
	public void Accessories()
	{
		AutomationFrame frame=new AutomationFrame(driver);
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
	public void Buy()
	{		
		AutomationTest test=new AutomationTest(driver);
		test.click();
		test.cli();
		test.copytext();
		test.dragAndDrop();
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
