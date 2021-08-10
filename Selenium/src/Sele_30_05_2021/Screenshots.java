package Sele_30_05_2021;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Screenshots {	
	
	public static void test(WebDriver driver,String i) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\createPage"+i+".jpeg");
		Files.copy(source, destination);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");							
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Screenshots.test(driver,"1");
		Thread.sleep(3000);
		
//		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\createPage.jpeg");
//		Files.copy(source, destination);
		
		WebElement gmail=driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		gmail.click();
		Screenshots.test(driver,"2");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		Screenshots.test(driver,"3");
		Thread.sleep(2000);
//				
		
	}
}
