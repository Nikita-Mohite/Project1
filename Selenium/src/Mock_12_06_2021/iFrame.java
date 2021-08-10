package Mock_12_06_2021;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class iFrame {

	public static void Scr(WebDriver driver, int i) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\iFrame\\ifrm"+i+".jpeg");
		Files.copy(scr, dest);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Scr(driver,1);
		Thread.sleep(3000);
		
		Date d=new Date();
		System.out.println(d);
		String time=d.toString().replace(' ', '-').replace(':', '_');
		System.out.println(time);
		
		WebElement iFramewithIFrame=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iFramewithIFrame.click();
		Scr(driver,2);
		Thread.sleep(3000);

		WebElement iFrame1=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(iFrame1);
		Scr(driver,3);
		Thread.sleep(3000);
		
		WebElement iFrame2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(iFrame2);
		Scr(driver,4);
		Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("Nikita Mohite");
		Scr(driver,5);
		Thread.sleep(3000);
		
		ArrayList<String> Address=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(Address.get(0));
//		System.out.println(Address.get(1));
//		System.out.println(Address.get(2));
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		WebElement singleIFrame=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		singleIFrame.click();
		Scr(driver,6);
		
		
		

	}

}
