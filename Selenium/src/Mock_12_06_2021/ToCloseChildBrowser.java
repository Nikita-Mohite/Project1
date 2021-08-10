package Mock_12_06_2021;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ToCloseChildBrowser {
	
	public static void TakeScreenshot(WebDriver driver, int i) throws IOException
	{
		File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\AmazonHeadSet\\scr"+i+".jpeg");
		Files.copy(sour, destination);
	}
		
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement jspopupalert=driver.findElement(By.xpath("//a[text()=\"JS Popup Alert\"]"));
		jspopupalert.click();
		TakeScreenshot(driver,1);
		Thread.sleep(5000);
		WebElement alert=driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_alert\"]"));
		alert.click();
		TakeScreenshot(driver,2);
		Thread.sleep(5000);
		WebElement confirm=driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_confirm\"]"));
		confirm.click();
		TakeScreenshot(driver,3);
		Thread.sleep(5000);
		WebElement prompt=driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_prompt\"]"));
		prompt.click();
		TakeScreenshot(driver,4);
		Thread.sleep(5000);
		
		String main=driver.getWindowHandle();
		System.out.println(main);
		
		ArrayList<String> Address=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(Address.get(0));
		System.out.println(Address.get(1));
		System.out.println(Address.get(2));
		System.out.println(Address.get(3));
		
		WebDriver LineWindow=driver.switchTo().window(Address.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		//to close child browser
		LineWindow.close();
		 
		driver.switchTo().window(Address.get(2));
		
		WebDriver close=driver.switchTo().frame("iframeResult");
		
		WebElement tryit=driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]"));
		tryit.click();
		Thread.sleep(5000);
		close.close();
		
		driver.switchTo().window(Address.get(3));
		System.out.println(driver.getCurrentUrl());		
		
		
	
		
	}

}
