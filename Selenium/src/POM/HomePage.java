package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	@FindBy (xpath="//span[contains(text(),\"Nikita Mohite\")]")
	private WebElement profile;
	
	@FindBy (xpath="//span[contains(text(),\"COVID-19 Information Center\")]")
	private WebElement covid;
	
	@FindBy (xpath="//span[text()=\"Friends\"]")
	private WebElement friends;
	
	@FindBy (xpath="//span[text()=\"Groups\"]")
	private WebElement group;
	
	@FindBy (xpath="(//div[@aria-label=\"Messenger\"])[1]")
	private WebElement messanger;
	
	@FindBy (xpath="//div[@aria-label=\"Account\"]")
	private WebElement clickonArraow;
	
	@FindBy (xpath="//span[text()=\"Log Out\"]")
	private WebElement logOut;
	
	public HomePage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void Profile()
	{
		profile.click();
	}
	
	public void Covid()
	{
		covid.click();
	}

	public void Friends()
	{
		friends.click();
	}
	public void Group()
	{
		group.click();
	}
	public void Messanger()
	{
		messanger.click();
	}
	public void ClickOnArrao()
	{
		clickonArraow.click();
	}
	public void LogOut()
	{
		logOut.click();
	}
}