package WAIT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	
		
		
		WebElement text=driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		text.sendKeys("Alert");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,\"wikipedia-search-button\")]")));
		
//		WebElement search=driver.findElement(By.xpath("//input[contains(@class,\"wikipedia-search-button\")]"));
		search.click();
		
		WebElement alert=driver.findElement(By.xpath("//button[text()='Click Me']"));
		alert.click();
		
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.alertIsPresent());
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		WebElement datepicker=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		datepicker.sendKeys("06/26/2021");
		
	}

}
