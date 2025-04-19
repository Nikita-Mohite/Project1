package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement cart;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none']//img[@alt='Shop Kitchen favorites']")
	private WebElement deal;
	
	@FindBy(xpath="//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']")
	private WebElement result;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement signinhover;
	
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//a[@class='nav-action-signin-button']")
	private WebElement signinButton ;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement emailfield;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passwordfield;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement finalSigninButton;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String fetchTitleOfPage()
	{
		String TitleOfPage = driver.getTitle();
		return TitleOfPage;
	}
	
	public boolean isCartIconDisplayed()
	{
		boolean cartIconDisplayed = cart.isDisplayed();
		return cartIconDisplayed;
	}
	
	public void enteredDealSection()
	{
		wait.until(ExpectedConditions.visibilityOf(deal));
		deal.click();
		
	}
	
	public boolean carousalDeal()
	{	
		boolean isVisible = false;
		wait.until(ExpectedConditions.visibilityOf(result));	
	    isVisible = true;
		return isVisible;	
	}
	
	public void enterUsername(String email)
	{
		Actions act = new Actions(driver);
		act.moveToElement(signinhover).build().perform();
		signinButton.click();
		emailfield.sendKeys(email);
		continueButton.click();
	}
	
	public void enterPassword(String password)
	{
		passwordfield.sendKeys(password);
		finalSigninButton.click();
	}
}
