package POM_Groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
	
	WebDriver driver;
	
	@FindBy (xpath="//span[text()=\"Login/Register\"]")
	private WebElement login;

	@FindBy (xpath="//input[@id=\"login_email1\"]")
	private WebElement yourmail;
	
	@FindBy (xpath="//span[text()='Continue']")
	private WebElement Continue;

	@FindBy (xpath="//input[@id=\"login_password1\"]")
	private WebElement passowrd;
	
	@FindBy (xpath="//span[text()='Submit']")
	private WebElement submit;
	@FindBy (xpath="(//input[@class=\"otpinput88\"])[1]")
	private WebElement TPIN1;
	@FindBy (xpath="(//input[@class=\"otpinput88\"])[2]")
	private WebElement TPIN2;
	@FindBy (xpath="(//input[@class=\"otpinput88\"])[3]")
	private WebElement TPIN3;
	@FindBy (xpath="(//input[@class=\"otpinput88\"])[4]")
	private WebElement TPIN4;
	
	
//	@FindBy (xpath="//div[text()=\"Continue with Google\"]")
//	private WebElement google;
//	
//	@FindBy (xpath="//div[text()=\"Use another account\"]")
//	private WebElement useanotheraccount;
//	
//	@FindBy (xpath="//span[text()='Create account']")
//	private WebElement createaccount;
//	
//	@FindBy (xpath="//input[@id=\"firstName\"]")
//	private WebElement fname;
//	
//	@FindBy (xpath="//input[@id=\"lastName\"]")
//	private WebElement lname;
//	
//	@FindBy (xpath="//input[@id=\"username\"]")
//	private WebElement username;//bakalevivek2394
//	
//	@FindBy (xpath="//div[text()=\"Password\"]")
//	private WebElement password;//abcdefghijklmnop@123456
//	
//	@FindBy (xpath="//div[text()=\"Confirm\"]")
//	private WebElement confirmpassword;
//	
//	@FindBy (xpath="//div[text()=\"Show password\"]")
//	private WebElement showpassword;
//	
//	@FindBy (xpath="//span[text()=\"Next\"]")
//	private WebElement next;
//	
//	@FindBy (xpath="//span[text()=\"Sign in instead\"]")
//	private WebElement signinInstead;
//	
//	@FindBy (xpath="//div[text()=\"Phone number (optional)\"]")
//	private WebElement phonenumber;
//	
//	@FindBy (xpath="//div[text()=\"Recovery email address (optional)\"]")
//	private WebElement recoverymainID;
//	
//	@FindBy (xpath="//select[@id=\"month\"]")
//	private WebElement month;//March(Select tagname)
//	
//	@FindBy (xpath="//input[@id=\"day\"]")
//	private WebElement day;//02
//	
//	@FindBy (xpath="//div[text()='Year']")
//	private WebElement year;//1994
//	
//	@FindBy (xpath="//select[@id=\"gender\"]")
//	private WebElement gender;//Male
//	
//	@FindBy (xpath="//span[text()='Next']")
//	private WebElement nextbutton;
//	
//	@FindBy (xpath="//span[text()='Send']")
//	WebElement send;
//	
	
	public NewAccount(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		login.click();
	}
	public void yourmail()
	{
		yourmail.sendKeys("mohitenikita1995@gmail.com");
	}
	public void Continue()
	{
		Continue.click();
	}
	public void passowrd()
	{
		passowrd.sendKeys("Abcdefgh@1234");
	}
	public void submit()
	{
		submit.click();
	}
	public void TPIN1()
	{
		TPIN1.sendKeys("8");
	}
	public void TPIN2()
	{
		TPIN2.sendKeys("8");
	}
	public void TPIN3()
	{
		TPIN3.sendKeys("4");
	}
	public void TPIN4()
	{
		TPIN4.sendKeys("6");
	}
	
}
