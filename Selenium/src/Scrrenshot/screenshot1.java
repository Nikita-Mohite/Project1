package Scrrenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		Thread.sleep(2000);
		WebElement SQLInnerJoin=driver.findElement(By.xpath("//a[text()=\"SQL Inner Join\"]"));
		SQLInnerJoin.click();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\CLASS\\Study\\Completed Work\\Screenshot\\W3S scrrenshot\\InnerJoin.jpeg");
		Files.copy(scr, dest);
		

	}

}
