package POM;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			LoginPage lp=new LoginPage(driver);
			lp.email();
			Thread.sleep(2000);
			lp.Password();
			Thread.sleep(2000);
			lp.loginbutton();
			lp.createNewAccount();
			Thread.sleep(2000);
			
			HomePage hp=new HomePage(driver);
			hp.Profile();
			hp.Covid();
			hp.Friends();
			hp.Group();
			hp.Messanger();
			hp.ClickOnArrao();
			hp.LogOut();
			
			
			

	}

}

