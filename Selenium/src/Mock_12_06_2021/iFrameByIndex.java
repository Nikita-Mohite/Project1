package Mock_12_06_2021;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement iFramewithIFrame=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iFramewithIFrame.click();
		Thread.sleep(3000);

		ArrayList<String> Add=new ArrayList<String>(driver.getWindowHandles());
//		WebElement iFrame1=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(Add.get(0));
		Thread.sleep(3000);
		
//		WebElement iFrame2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(Add.get(1));
		Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("Nikita Mohite");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		WebElement singleIFrame=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		singleIFrame.click();
		

	}

}
