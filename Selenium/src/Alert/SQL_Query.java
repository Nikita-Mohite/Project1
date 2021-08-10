package Alert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SQL_Query {
	
	public static void Screenshot(WebDriver driver,int i) throws IOException
	{
		File sour=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desti=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\SQL Screenshot\\sql"+i+"jpeg");
		Files.copy(sour, Desti);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement sqloperator=driver.findElement(By.xpath("//a[text()=\"SQL And, Or, Not\"]"));
		sqloperator.click();
		Screenshot(driver,1);
		Thread.sleep(3000);
		
		WebElement OR=driver.findElement(By.xpath("//a[@href=\"trysql.asp?filename=trysql_select_where_or\"]"));
		OR.click();
		Screenshot(driver,2);
		Thread.sleep(3000);
		
		WebElement NOT=driver.findElement(By.xpath("//a[@href=\"trysql.asp?filename=trysql_select_where_not\"]"));
		NOT.click();
		Screenshot(driver,3);
		Thread.sleep(3000);
	
		WebElement AND=driver.findElement(By.xpath("//a[@href=\"trysql.asp?filename=trysql_select_where_and\"]"));
		AND.click();
		Screenshot(driver,5);
		Thread.sleep(3000);
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("Arguments[0].ScollIntoView(true);", AND);
		
		String main=driver.getWindowHandle();
		System.out.println(main);
		
		ArrayList<String> Address=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(Address.get(0));
		System.out.println(Address.get(1));
		System.out.println(Address.get(2));
		System.out.println(Address.get(3));
		System.out.println(Address.get(4));
		
		WebDriver close=driver.switchTo().window(Address.get(1));
		
//		WebElement WSchool=driver.findElement(By.xpath("//a[text()=\"w3schools.com\"]"));
//		WSchool.click();
//		Screenshot(driver,6);
//		Thread.sleep(3000);
//		
//		WebElement Tryit=driver.findElement(By.xpath("//a[@href=\"/html/tryit.asp?filename=tryhtml_default\"]"));
//		Tryit.click();
//		Screenshot(driver,7);
//		Thread.sleep(3000);
//		
//		driver.switchTo().frame("(//iframe)[1]");
//		Thread.sleep(3000);
		close.close();
//		
//		
//		driver.switchTo().window(Address.get(2));
		
	}

}
