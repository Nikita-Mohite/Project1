package Mock_12_06_2021;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Amazon_Scolldown {
	
	public static void Screen(WebDriver driver, int i) throws IOException
	{
		File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest1=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\Amazon_Mouse_Action\\Scr"+i+".jpeg");
		Files.copy(scr1, Dest1);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Screen(driver,1);
		Thread.sleep(3000);
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("window.scrollBy(0,-800)");
//		
//		JavascriptExecutor js1=((JavascriptExecutor)driver);
//		js1.executeScript("arguments[0].scrollIntoView(true);",Audio);
		
		Actions act=new Actions(driver);
		
		WebElement Electronics=driver.findElement(By.xpath("//a[text()=\" Electronics \"]"));
		act.moveToElement(Electronics).click().build().perform();
		Screen(driver,2);
		Thread.sleep(2000);
		
		//WebElement Laptop=driver.findElement(By.xpath("(//a[@class=\"nav-a nav-hasArrow\"])[2]"));
		WebElement Laptop=driver.findElement(By.xpath("//span[contains(text(),\"Laptops & Accessories\")]"));
		act.moveToElement(Laptop).build().perform();
		Screen(driver,3);
		Thread.sleep(2000);
		
		WebElement Pendrive=driver.findElement(By.xpath("//a[contains(text(),'Pen Drives')]"));
		act.moveToElement(Pendrive).click().build().perform();
		Screen(driver,4);
		Thread.sleep(2000);
		
		WebElement ScanDiskPendrive=driver.findElement(By.xpath("(//span[contains(text(),'SanDisk Ultra Flair 64GB USB 3.0 Pen Driv')])[1]"));
		act.moveToElement(ScanDiskPendrive).click().build().perform();
		Screen(driver,5);
		Thread.sleep(2000);
		
		WebElement GB=driver.findElement(By.xpath("//p[text()='256GB']"));
		act.moveToElement(GB).click().build().perform();
		Screen(driver,6);
		Thread.sleep(2000);
		
		WebElement BuyButton=driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]"));
		act.moveToElement(BuyButton).click().build().perform();
		Screen(driver,7);
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		email.sendKeys("mohitenikita1995@gmail.com");
		Screen(driver,8);
		Thread.sleep(2000);
		
		WebElement continue1=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		act.moveToElement(continue1).click().build().perform();
		Screen(driver,2);
		Thread.sleep(2000);
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		Password.sendKeys("88468846");
		Screen(driver,2);
		Thread.sleep(2000);
		
		WebElement signinButton=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		act.moveToElement(signinButton).click().build().perform();
		Screen(driver,2);
		Thread.sleep(2000);
		
		ArrayList<String> Address=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(Address.get(0));
		System.out.println(Address.get(1));
		System.out.println(Address.get(2));
		System.out.println(Address.get(3));
		System.out.println(Address.get(4));
		System.out.println(Address.get(5));
		
	}

}
