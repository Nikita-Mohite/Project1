package POM_TestAutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		POM_Class pom=new POM_Class(driver);
		pom.text();
		pom.search();
		pom.AlertClickMe();
		pom.datepicker();
		pom.date();
		pom.Speed();
		pom.file();
		pom.num();
		pom.product();
		pom.Animal();
		pom.tabel();
		
		Iframe frame=new Iframe(driver);
		frame.iframe();
		frame.fname();
		frame.lname();
		frame.phone();
		frame.country();
		frame.city();
		frame.Address();
		frame.female();
		frame.Monday();
		frame.Morning();
		frame.Sub();
		
		Page page=new Page(driver);
		page.click();
		page.cli();
		page.copytext();
		page.dragAndDrop();
	}

}
