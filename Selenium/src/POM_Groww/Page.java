package POM_Groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		NewAccount acc=new NewAccount(driver);
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
//		login.email();
//		Thread.sleep(2000);
//		login.Continue();
//		Thread.sleep(2000);
//		login.continuewithgoogle();
//		Thread.sleep(10000);
//		login.idemail();
//		Thread.sleep(3000);
//		login.enext();
//		Thread.sleep(3000);
//		login.password();
//		Thread.sleep(2000);
//		login.submit();
//		Thread.sleep(2000);
//		login.forgotPassword();
//		Thread.sleep(2000);
//		login.emailidoption();
//		Thread.sleep(2000);
//		login.pancard();
//		Thread.sleep(2000);
//		login.verify();
//		Thread.sleep(2000);
//		login.confirm();
//		Thread.sleep(2000);
//		login.DOB();
//		Thread.sleep(2000);
//		login.next();
//		Thread.sleep(2000);
//		login.female();
//		Thread.sleep(2000);
//		login.single();
//		Thread.sleep(2000);
//		login.India();
//		Thread.sleep(2000);
//		login.KYCcontinue();
//		Thread.sleep(4000);
//		login.student();
//		Thread.sleep(2000);
//		login.income();
//		Thread.sleep(2000);
//		login.fathername();
//		Thread.sleep(2000);
//		login.mothername();
//		Thread.sleep(2000);
//		login.nextKYC();
//		Thread.sleep(2000);
//		login.nominee();
//		Thread.sleep(2000);
//		login.nname();
//		Thread.sleep(2000);
//		login.relation();
//		Thread.sleep(2000);
//		login.brother();
//		Thread.sleep(2000);
//		login.nDOB();
//		Thread.sleep(2000);
//		login.nnext();
//		Thread.sleep(2000);
//		login.bankname();
//		Thread.sleep(2000);
//		login.branchname();
//		Thread.sleep(2000);
//		login.bankaccount();
//		Thread.sleep(2000);
//		login.verifyaccount();
//		Thread.sleep(2000);
//		login.noexperience();
//		Thread.sleep(2000);
//		login.proceed();
//		Thread.sleep(2000);
//		login.proceedforKYC();
		
		HomePage page=new HomePage(driver);
		page.mainSearch();
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
		page.Immediatly();
		Thread.sleep(2000);
		page.CONTINUE();
		Thread.sleep(2000);
		page.AddMoney();
		Thread.sleep(2000);
		page.stockAddMoneyInput();
		Thread.sleep(2000);
		page.AddMoneyfinal();
		Thread.sleep(2000);
	}

}
