package Mock_12_06_2021;
import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class Alert_Popup {
	public static void TakeScreenshot(WebDriver driver, int i) throws IOException
	{
		File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\AmazonHeadSet\\scr"+i+".jpeg");
		Files.copy(sour, destination);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement tryit=driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]"));
		tryit.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		alt.dismiss();
		alt.sendKeys("MNB");
		Thread.sleep(10000);
		
		
	}

}
