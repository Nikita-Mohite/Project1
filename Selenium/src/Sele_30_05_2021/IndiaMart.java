package Sele_30_05_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaMart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.indiamart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String Title=driver.getTitle();
		System.out.println(Title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement Logo=driver.findElement(By.xpath("//a[@href=\"https://www.indiamart.com/\"]\r\n"+ ""));
		Logo.click();
		Thread.sleep(1000);
		
		WebElement AllIndiaButton=driver.findElement(By.xpath("//button[@id=\"searchPlaceDP\"]"));
		AllIndiaButton.click();
		Thread.sleep(2000);
		WebElement EneterCity=driver.findElement(By.xpath("//input[@placeholder=\"Enter city\"]"));
		EneterCity.sendKeys("Pune");
		Thread.sleep(5000);
		WebElement EneterMbNo=driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]"));
		EneterMbNo.sendKeys("7972095211");
		Thread.sleep(1000);
		WebElement ContinueButton=driver.findElement(By.xpath("//input[@value=\"CONTINUE\"]"));
		ContinueButton.sendKeys("7972095211");
		Thread.sleep(1000);
			
		WebElement Enterproduct=driver.findElement(By.xpath("//input[@placeholder=\"Enter product /"));
		Enterproduct.click();
		Enterproduct.sendKeys("pharmaceutical tablets");
		Thread.sleep(1000);
		WebElement SearchButton=driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div[1]/form/input[1]\r\n"+ ""));
		SearchButton.click();
		Thread.sleep(2000);
		
		WebElement SuppliersFromPune=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
		boolean result=SuppliersFromPune.isSelected();
		if(result==true)
		{
			System.out.println("True");
		}
		else
		{
			SuppliersFromPune.click();
		}
		Thread.sleep(1000);
		WebElement TabName1=driver.findElement(By.xpath("//a[text()=\"G-Bose-0.3 Voglibose Tablets IP 0.3 mg, Packaging Type: 10*10, Alu Alu, Satyam Lifesciences\"]"));
		TabName1.click();
		Thread.sleep(2000);
		WebElement ContactNo=driver.findElement(By.xpath("(//button[text()=\"Contact Supplier\"])[3]"));
		ContactNo.click();
		Thread.sleep(2000);
		
		WebElement VoiceSerachButton=driver.findElement(By.xpath("//span[@class=\"Tip vSh1 Hd_pa\"]"));
		VoiceSerachButton.click();
		Thread.sleep(1000);
		WebElement GetBestPricebutton=driver.findElement(By.xpath("//a[@style=\"display: inline;\"]"));
		GetBestPricebutton.click();
		Thread.sleep(1000);
		
		WebElement SuppliesButton=driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div[2]/div[1]/a\r\n"+ ""));
		SuppliesButton.click();
		Thread.sleep(1000);
		WebElement SellButton=driver.findElement(By.xpath("//a[@id=\"ch_sell\"]\r\n"+ ""));
		SellButton.click();
		Thread.sleep(1000);
		WebElement Helpbutton=driver.findElement(By.xpath("//a[@class=\"h_ic13\"]\r\n"+ ""));
		Helpbutton.click();
		Thread.sleep(1000);
		WebElement Message=driver.findElement(By.xpath("//a[@onclick=\"gaTrack('Messages');msgwidget();\"]\r\n"+ ""));
		Message.click();
		Thread.sleep(1000);
		
		WebElement signinbutton=driver.findElement(By.xpath("//a[@id=\"user_sign_in\"]\r\n"+ ""));
		signinbutton.click();
		Thread.sleep(1000);
		WebElement MobileNumber=driver.findElement(By.xpath("//div[text()=\"Mobile Number\"]"));
		MobileNumber.click();
		Thread.sleep(1000);
		WebElement EnterYourMobileNumber=driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Mobile Number\"]"));
		EnterYourMobileNumber.sendKeys("7972095211");
		Thread.sleep(1000);
		WebElement Submit=driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
		Submit.click();
		Thread.sleep(1000);
	
		driver.close();
		driver.quit();
		
	}

}
