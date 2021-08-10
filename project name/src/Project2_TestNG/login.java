package Project2_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {


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

	public login(WebDriver dri)
	{
		driver=dri;
		PageFactory.initElements(driver, this);
	}
	
	public void logi()
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
