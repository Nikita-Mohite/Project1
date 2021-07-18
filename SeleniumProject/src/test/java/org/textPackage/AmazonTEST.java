package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pomPackage.AmazonPOM;

//import POM_Amazon.AmazonMainPage;

public class AmazonTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		AmazonPOM amazon=new AmazonPOM(driver);
		amazon.Electronics();
		amazon.Laptop();
		amazon.Pendrive();
		amazon.ScanDiskPendrive();
		amazon.GB();
		amazon.BuyButton();
		amazon.email();
		amazon.continue1();
		amazon.Password();
		amazon.signinButton();
		
		driver.close();
	}

}
