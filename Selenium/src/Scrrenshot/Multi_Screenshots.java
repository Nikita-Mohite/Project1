package Scrrenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Multi_Screenshots {
	
	public static void TakeScrshots(WebDriver driver, String i) throws IOException
	{
		File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desti=new File("E:\\CLASS\\Study\\Completed Work\\Screenshot\\MultiScreenShots\\W3S"+i+".jpeg");
		Files.copy(sour, Desti);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		Thread.sleep(2000);
		WebElement SQLSelect=driver.findElement(By.xpath("//a[text()=\"SQL Select\"]"));
		SQLSelect.click();
		Multi_Screenshots.TakeScrshots(driver, "1");
		Thread.sleep(2000);
		
		WebElement SQLWhere=driver.findElement(By.xpath("//a[text()=\"SQL Where\"]"));
		SQLWhere.click();
		Multi_Screenshots.TakeScrshots(driver, "2");
		Thread.sleep(2000);
		
		WebElement SQLOrderBy=driver.findElement(By.xpath("//a[text()=\"SQL Order By\"]"));
		SQLOrderBy.click();
		Multi_Screenshots.TakeScrshots(driver, "3");
		Thread.sleep(2000);
		
		WebElement SQLUpdate=driver.findElement(By.xpath("//a[text()=\"SQL Update\"]"));
		SQLUpdate.click();
		Multi_Screenshots.TakeScrshots(driver, "4");
		Thread.sleep(2000);
		
		WebElement SQLDelete=driver.findElement(By.xpath("//a[text()=\"SQL Delete\"]"));
		SQLDelete.click();
		Multi_Screenshots.TakeScrshots(driver, "5");
		Thread.sleep(2000);
		
		WebElement SQLJoin=driver.findElement(By.xpath("//a[text()=\"SQL Joins\"]"));
		SQLJoin.click();
		Multi_Screenshots.TakeScrshots(driver, "6");
		
		
		
		
		
		
	}

}
