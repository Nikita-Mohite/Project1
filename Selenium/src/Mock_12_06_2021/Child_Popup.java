package Mock_12_06_2021;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Child_Popup {
	
	public static void ScreenTime(WebDriver driver, int time) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\ChildPOPUP\\child"+time+".jpeg");
		Files.copy(scr, dest);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		ScreenTime(driver,1);
		Thread.sleep(3000);
		
		Date d=new Date();
		System.out.println(d);
		String time=d.toString().replace(' ', '-').replace(':', '_');
		System.out.println(time);
		
	}

}
