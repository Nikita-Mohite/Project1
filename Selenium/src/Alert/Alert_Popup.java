package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Alert alt=driver.switchTo().alert();
		
		WebElement createANewAccount=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		createANewAccount.click();
		
		alt.accept();
		Thread.sleep(2000);
		alt.dismiss();
		Thread.sleep(2000);
		alt.sendKeys("ABC");
		Thread.sleep(9000);
		
		
		
		

	}

}
