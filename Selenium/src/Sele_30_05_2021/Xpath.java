package Sele_30_05_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		WebElement createANewAccount=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		createANewAccount.click();
		Thread.sleep(9000);
		
		WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
		name.click();
		name.sendKeys("Anuradha");
		Thread.sleep(5000);
		WebElement lastname=driver.findElement(By.xpath("//input[@aria-label=\"Last name\"]"));
		lastname.sendKeys("Shinde");
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//select[@aria-label=\"Days\"]"));
		Select s=new Select(date);
		s.selectByValue("3");
		Thread.sleep(2000);
		
		
		
		
		WebElement female=driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]"));
		
		boolean result=female.isSelected();
		if(result==true)
		{
			System.out.println("true");
		}
		else
		{
			female.click();
		}
		
		
		

	}

}
