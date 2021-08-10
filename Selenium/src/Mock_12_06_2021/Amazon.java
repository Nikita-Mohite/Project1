package Mock_12_06_2021;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class Amazon {
	public static void TakeScreenshot(WebDriver driver, int i) throws IOException
	{
		File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\AmazonHeadSet\\scr"+i+".jpeg");
		Files.copy(sour, destination);
	}

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement input=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		input.sendKeys("iball headset wireless");
		Thread.sleep(2000);
		TakeScreenshot(driver,1);
		WebElement search=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		search.click();
		Thread.sleep(2000);
		WebElement sortby=driver.findElement(By.xpath("//span[@id=\"a-autoid-0-announce\"]"));
		sortby.click();
		Thread.sleep(2000);
		WebElement LowToHigh=driver.findElement(By.xpath("//a[text()=\"Price: Low to High\"]"));
		LowToHigh.click();
		TakeScreenshot(driver,2);
		Thread.sleep(2000);
		WebElement headset=driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/I/5129tlcwEKS._AC_SX180_SY120_QL70_.jpg\"]"));
		headset.click();
		Thread.sleep(2000);
		
//		WebElement Pic1=driver.findElement(By.xpath("//input[@aria-labelledby=\"a-autoid-9-announce\"]"));
//		Pic1.click();
//		TakeScreenshot(driver,3);
//		Thread.sleep(2000);
//		WebElement Pic2=driver.findElement(By.xpath("//input[@aria-labelledby=\"a-autoid-10-announce\"]"));
//		Pic2.click();
//		TakeScreenshot(driver,4);
//		Thread.sleep(2000);
//		WebElement Pic3=driver.findElement(By.xpath("//input[@aria-labelledby=\"a-autoid-11-announce\"]"));
//		Pic3.click();
//		TakeScreenshot(driver,5);
//		Thread.sleep(2000);
//		WebElement Pic4=driver.findElement(By.xpath(" //input[@aria-labelledby=\"a-autoid-6-announce\"]"));
//		Pic4.click();
//		TakeScreenshot(driver,6);
//		Thread.sleep(2000);
		
		WebElement Addtocart=driver.findElement(By.xpath("//a[@id=\"a-autoid-0-announce\"]"));
		Addtocart.click();
		Thread.sleep(2000);
		
		WebElement account=driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
		account.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		email.sendKeys("mohitenikita1995@gmail.com");
		Thread.sleep(2000);
		WebElement continu=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		continu.click();
		Thread.sleep(2000);
		WebElement pswd=driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		pswd.sendKeys("23031995");
		Thread.sleep(2000);
		WebElement signin=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		signin.click();
		Thread.sleep(2000);

		

	}

}
