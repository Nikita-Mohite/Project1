package Mock_12_06_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions ac=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
		
		WebElement drop=driver.findElement(By.xpath("//p[text()=\"Drop here\"]"));
		ac.dragAndDrop(drag, drop);
		Thread.sleep(2000);
		
		
	}

}
