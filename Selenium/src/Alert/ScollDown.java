package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Alertpopup=driver.findElement(By.xpath("//a[text()=\"JS Popup Alert\"]"));
		Alertpopup.click();
		Thread.sleep(2000);
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(0,800)");//for scroll down
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-300)");//for scroll up
		
		j.executeScript("window.scrollBy(500,0)");//for scroll right
		j.executeScript("window.scrollBy(-500,0)");//for scroll left

	}

}
