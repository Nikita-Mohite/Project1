package org.textPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pomPackage.GrowwHomePOM;
import org.pomPackage.GrowwLogout;
import org.pomPackage.GrowwNewAccount;
import org.pomPackage.GrowwSell;

//import POM_Groww.HomePage;
//import POM_Groww.NewAccount;

public class GrowwTEST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		GrowwNewAccount acc=new GrowwNewAccount(driver);
		acc.login();
		Thread.sleep(2000);
		acc.yourmail();
		Thread.sleep(2000);
		acc.Continue();
		Thread.sleep(2000);
		acc.passowrd();
		Thread.sleep(2000);
		acc.submit();
		Thread.sleep(2000);
		acc.TPIN1();
		Thread.sleep(1000);
		acc.TPIN2();
		Thread.sleep(1000);
		acc.TPIN3();
		Thread.sleep(1000);
		acc.TPIN4();
		Thread.sleep(1000);
		
		GrowwHomePOM page=new GrowwHomePOM(driver);
		page.Search();
		Thread.sleep(2000);
		page.Buy();
		Thread.sleep(2000);
		page.Delivery();
		Thread.sleep(2000);
		page.NSE();
		Thread.sleep(2000);
		page.BSE();
		Thread.sleep(2000);
		page.inputvalue();
		Thread.sleep(2000);
		page.Limit();
		Thread.sleep(2000);
		page.Market();
		Thread.sleep(2000);
		page.AdvanceOptions();
		Thread.sleep(2000);
		page.RegularOrder();
		Thread.sleep(2000);
		page.SLOrder();
		Thread.sleep(2000);
		page.Day();
		Thread.sleep(2000);
		page.CONTINUE();
		Thread.sleep(2000);
		page.AddMoney();
		Thread.sleep(2000);
		page.stockAddMoneyInput();
		Thread.sleep(2000);
		page.AddMoneyfinal();
		Thread.sleep(2000);
	
		GrowwSell sell=new GrowwSell(driver);
		sell.arrowBack();
		Thread.sleep(2000);
		sell.arrowBack();
		Thread.sleep(2000);
		sell.Search();
		Thread.sleep(2000);
		sell.Sell();
		Thread.sleep(2000);
		sell.Delivery();
		Thread.sleep(2000);
		sell.BSE();
		Thread.sleep(2000);
		sell.inputvalue();
		Thread.sleep(2000);
		sell.Limit();
		Thread.sleep(2000);
		sell.AdvanceOptions();
		Thread.sleep(2000);
		sell.RegularOrder();
		Thread.sleep(2000);
		sell.SLOrder();
		Thread.sleep(2000);
		sell.Day();
		Thread.sleep(2000);
		sell.CONTINUE();
		Thread.sleep(2000);
		//sell.SellButton();
		Thread.sleep(2000);
		GrowwLogout logout=new GrowwLogout(driver);
		logout.Arrow();
		Thread.sleep(2000);
		logout.logout();

		driver.close();
	}

}
