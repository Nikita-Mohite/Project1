package org.pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwLogout {

	
WebDriver driver;
	
	@FindBy (xpath="//i[text()='keyboard_arrow_down']")
	private WebElement arrow;
	
	@FindBy (xpath="//div[text()=\"Log Out\"]")
	private WebElement logout;
	
	
	public GrowwLogout(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	public void Arrow()
	{
		arrow.click();
	}
	
	public void logout()
	{
		logout.click();
	}
}
