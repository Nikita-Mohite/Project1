package org.pomPackage;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonPOM_Class {
	
	private WebDriver driver;
//private WebDriverWait wait;
	private Actions act;
	private JavascriptExecutor jr;
	
	
	@FindBy(xpath="//form[@id='nav-search-bar-form']")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement typeSearchItem;
	
	@FindBy(xpath="(//div[text()='washing machine 10kg fully automatic front load'])[1]")
	private WebElement mouseHover;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//span[text()='Samsung 9 kg, 5 star, AI EcoBubble, Super Speed, Wi-Fi, Hygiene Steam with Inbuilt Heater, Digital Inverter, Fully-Automatic Front Load Washing Machine (WW90DG5U24AXTL, Inox)']")
	private WebElement name;
	
	@FindBy(xpath="//h6[text()=' Bank Offer ']")
	private WebElement bankOffer;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	private WebElement addToKart;
	
	@FindBy(xpath="//span[@class='a-button a-button-primary attach-primary-button attach-button-large attach-checkout-button']")
	private WebElement proceedToCheckoutButton;
	
	@FindBy(xpath="//span[text()='Get It by Tomorrow']")
	private WebElement getItByTomorrow;
	
	public AmazonPOM_Class(WebDriver d1)
	{
		driver=d1;
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
		jr = ((JavascriptExecutor)driver);
//wait=new WebDriverWait(driver,20);
	}
	
	public void SearchItem() throws InterruptedException
	{
		searchBox.click();
		Thread.sleep(5000);
	}
	
	public void ItemName()
	{
		
		typeSearchItem.sendKeys("washing machine 10kg fully automatic front load");
	}

	public void mouseHoverAction()
	{
		act.moveToElement(mouseHover).build().perform();
		SearchButton.click();
	}
	
	public void SelectItem() throws InterruptedException
	{
//		jr.executeScript("window.ScrollBy(0,300)");
//		Thread.sleep(5000);
		name.click();
	}
	
	public void SelectBankOffer() throws InterruptedException
	{
		Thread.sleep(5000);	
		bankOffer.click();
	}
	
	public void AddToKart()
	{
		addToKart.click();
	}
	
	public void ProceedToCheckoutButton()
	{
		proceedToCheckoutButton.click();
	}
	
	public void GetItByTomorrow()
	{
		String mainpage = driver.getWindowHandle();
		System.out.println(mainpage);
		
		ArrayList<String> page = new ArrayList<String>(driver.getWindowHandles());
		
		page.get(0);
		page.get(1);
		driver.switchTo().window(page.get(1));
		driver.switchTo().defaultContent();
		
		getItByTomorrow.click();
	}
	
}
