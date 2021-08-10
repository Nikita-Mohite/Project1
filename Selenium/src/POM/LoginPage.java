package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath="//input[@name=\"pass\"]")
	private WebElement password;
	

	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement loginbutton;
	

	@FindBy(xpath="//a[@id=\"u_0_2_7c\"]")
	private WebElement createNewAccount;
	
	public LoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void email()
	{
		email.sendKeys("mohitenikita1995@gmail.com");
	}
	
	public void Password()
	{
		password.sendKeys("88468846");
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
	public void createNewAccount()
	{
		createNewAccount.click();
	}
	
	
	
}
