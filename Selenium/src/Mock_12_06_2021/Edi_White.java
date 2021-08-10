package Mock_12_06_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edi_White {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tabulator.info/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement name=driver.findElement(By.xpath("//div[@title=\"Ed White\"]/following::div[@title=\"yellow\"]/following::div[text()=\"male\"]"));
		name.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		
		WebElement Next=driver.findElement(By.xpath("//button[@title=\"Next Page\"]"));
		Next.click();
		Thread.sleep(1000);
				
		WebElement James=driver.findElement(By.xpath("//div[@title=\"James Newman\"]/following::div[@title=\"red\"]/following::div[@title=\"22/03/1998\"]"));
		James.click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
	}

}
