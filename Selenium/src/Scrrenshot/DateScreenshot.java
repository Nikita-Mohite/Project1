package Scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DateScreenshot {
	public static void TakeScrshots(WebDriver driver, String time) throws IOException
	{
		File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desti=new File("E:\\CLASS\\Study\\Completed Work\\Screenshot\\"+time+".jpeg");
		Files.copy(sour, Desti);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		Thread.sleep(2000);
		
		Date d=new Date();
		System.out.println(d);
		String time=d.toString().replace(' ', '-').replace(':', '_');
		System.out.println(time);
			
		WebElement SQLSelect=driver.findElement(By.xpath("//a[text()=\"SQL Select\"]"));
		SQLSelect.click();
		TakeScrshots(driver, time);
		Thread.sleep(2000);
		
		WebElement SQLWhere=driver.findElement(By.xpath("//a[text()=\"SQL Where\"]"));
		SQLWhere.click();
		TakeScrshots(driver, time);
	}

}
