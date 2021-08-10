package Project1_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.pomPackage.AmazonPOM;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {

	
	private WebDriver driver;
	private Ama_POM amazon;
	
	@BeforeClass
	public void lunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void loginUser()
	{
		
		amazon=new Ama_POM(driver);
		amazon.Electronics();
		
	}
	
	@Test (priority=1)
	public void Accessories()
	{
		amazon.Laptop();
		String url=driver.getCurrentUrl();
		System.out.println(url);	
		String title=driver.getTitle();
		System.out.println(title);

		amazon.Pendrive();		
	}
	
	@Test(priority=2)
	public void Purchase()
	{
		amazon.ScanDiskPendrive();
		amazon.GB();
		amazon.BuyButton();
	}
	
	@AfterMethod
	public void Buy()
	{		
		amazon.email();
		amazon.continue1();
		amazon.Password();
		amazon.signinButton();
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
