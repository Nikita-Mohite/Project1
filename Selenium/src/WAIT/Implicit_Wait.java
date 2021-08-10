package WAIT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement text=driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		text.sendKeys("Alert");
		
		WebElement search=driver.findElement(By.xpath("//input[contains(@class,\"wikipedia-search-button\")]"));
		search.click();
		
		WebElement alert=driver.findElement(By.xpath("//button[text()='Click Me']"));
		alert.click();
		Thread.sleep(0);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		WebElement datepicker=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		datepicker.sendKeys("06/26/2021");
		
		List<WebElement> date=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr[3]//td[5]"));
		for(int i=0;i<=date.size()-1;i++)
		{
			String s=date.get(i).getText();
			System.out.println(s);
		}
		
		
		
		
	}

}
