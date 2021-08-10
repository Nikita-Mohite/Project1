package WAIT;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Fluent_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
							.withTimeout(Duration.ofSeconds(0))
							.pollingEvery(Duration.ofSeconds(0))
							.ignoring(NoSuchElementException.class);
		
		WebElement ele=wait.until(new Function<WebDriver,WebElement>()
									{
										@SuppressWarnings("unused")
										public WebElement Apply(WebDriver driver)
											{
												return driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
											}

										@Override
										public WebElement apply(WebDriver t) {
											// TODO Auto-generated method stub
											return null;
										}
									});
		ele.click();
				
		
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
	}

}
