package POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage {

	
	private WebDriver driver;
	private Actions act;
	//private WebDriverWait wait;
	
	@FindBy(xpath="//a[text()=\" Electronics \"]")
	private WebElement Electronics;
	
	@FindBy(xpath="//span[contains(text(),\"Laptops & Accessories\")]")
	private WebElement Laptop;
	
	@FindBy(xpath="//a[contains(text(),'Pen Drives')]")
	private WebElement Pendrive;
	
	@FindBy(xpath="(//span[contains(text(),'SanDisk Ultra Flair 64GB USB 3.0 Pen Driv')])[1]")
	private WebElement ScanDiskPendrive;
	
	@FindBy(xpath="//p[text()='256GB']")
	private WebElement GB;
	
	@FindBy(xpath="//input[@id=\"buy-now-button\"]")
	private WebElement BuyButton;
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	private WebElement email;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement continue1;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement signinButton;
	
	public AmazonMainPage(WebDriver d1)
	{
		driver=d1;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		//wait=new WebDriverWait(driver,20);
		
		
	}
	
	
	
	public void Electronics()
	{
		act.moveToElement(Electronics).click().build().perform();
		//wait.until.(ExpectedConditions.visibilityOfAll(Electronics).act.moveToElement(Electronics).click().build().perform());
	}
	public void Laptop()
	{
		act.moveToElement(Laptop).build().perform();
		//wait.until.(ExpectedConditions.visibilityOfAllElements(act.moveToElement(Laptop).build().perform());
	}
	public void Pendrive()
	{
		act.moveToElement(Pendrive).click().build().perform();
	}
	public void ScanDiskPendrive()
	{
		act.moveToElement(ScanDiskPendrive).click().build().perform();
	}
	
	public void GB()
	{
		act.moveToElement(GB).click().build().perform();
	}
	public void BuyButton()
	{
		act.moveToElement(BuyButton).click().build().perform();
	}
	
	public void email()
	{
		email.sendKeys("mohitenikita1995@gmail.com");
	}
	public void continue1()
	{
		act.moveToElement(continue1).click().build().perform();
	}
	public void Password()
	{
		Password.sendKeys("88468846");
	}
	public void signinButton()
	{
		act.moveToElement(signinButton).click().build().perform();
	}
	
}
