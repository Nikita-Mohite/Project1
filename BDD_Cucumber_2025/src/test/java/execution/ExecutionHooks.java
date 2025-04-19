package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class ExecutionHooks {
	
	WebDriver driver;
	
	@Before
	public void LaunchBrowser() throws IOException
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		DriverFactory df = new DriverFactory();
		String browsername = prop.getProperty("browser");	
		String maven_browser = System.getProperty("clibrowser");
		if(maven_browser!=null)
		{
			browsername = maven_browser;
		}
		driver = df.initBrowser(browsername); //mvn test -Dbrowsername="Firefox"
		
		String enteredurl = System.getProperty("url"); 
		System.out.println(enteredurl);  //mvn test -Dclibrowser=Firefox -Durl=www.google.com
		driver.manage().window().maximize(); //mvn test -Dcucumber.filter.tags="@sanity"
	}
	
	@After
	public void CloseBrowser()
	{
		driver = DriverFactory.getDriver();
		driver.quit();
	}

}
