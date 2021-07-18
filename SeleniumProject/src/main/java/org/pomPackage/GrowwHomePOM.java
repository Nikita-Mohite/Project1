package org.pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwHomePOM {

	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//input[@id=\"mainSearch1010\"]")
	private WebElement Search;
	@FindBy(xpath="(//span[text()='Reliance Industries Ltd'])[1]")
	private WebElement mouseaction;
	@FindBy(xpath="//div[text()=\"BUY\"]")
	private WebElement Buy;
	@FindBy(xpath="//span[text()='Delivery']")
	private WebElement Delivery;
	@FindBy(xpath="//span[text()='NSE']")
	private WebElement NSE;
	@FindBy(xpath="//span[text()='BSE']")
	private WebElement BSE;
	@FindBy(xpath="//input[@id=\"inputShare\"]")
	private WebElement inputvalue;
	@FindBy(xpath="//span[text()='Limit']")
	private WebElement Limit;
	@FindBy(xpath="//span[text()='Market']")
	private WebElement Market;
	@FindBy(xpath="//span[text()='Advanced Options']")
	private WebElement AdvanceOptions;
	@FindBy(xpath="//div[text()='Regular Order']")
	private WebElement RegularOrder;
	@FindBy(xpath="//div[text()='SL Order']")
	private WebElement SLOrder;
	@FindBy(xpath="(//span[text()='Day'])[1]")
	private WebElement Day;
	@FindBy(xpath="(//span[text()='Immediate'])[1]")
	private WebElement Immediatly;
	@FindBy(xpath="(//span[text()='CONTINUE'])[1]")
	private WebElement CONTINUE;
	@FindBy(xpath="//span[text()='ADD MONEY']")
	private WebElement AddMoney;
	@FindBy(xpath="//input[@id=\"stockAddMoneyInput\"]")
	private WebElement stockAddMoneyInput;
	@FindBy(xpath="//span[text()='ADD MONEY']")
	private WebElement AddMoneyfinal;
	@FindBy(xpath="//span[text()='BUY']")
	private WebElement BuyButton;
	@FindBy (xpath="(//span[text()='Reliance Industries Ltd'])[1]")
	private WebElement stockname;
	@FindBy (xpath="//h1[text()='Reliance Industries']")
	private WebElement StockdisplayOnHomePage;
	public GrowwHomePOM(WebDriver d1)
	{
		this.driver=d1;
		//act=new Actions(driver);
		PageFactory.initElements(driver,this);
	}
	public void Search()
	{
		Search.sendKeys("Reliance Industries Ltd");	
		Actions act=new Actions(driver);
		act.moveToElement(mouseaction).click().build().perform();
	}
	public String stockname()
	{
		String stocknam=stockname.getText();
		return stocknam;
	}
	public String StockdisplayOnHomePage()
	{
		String displayOnHome=StockdisplayOnHomePage.getText();
		String s1=displayOnHome.substring(4);
		return s1;
	}
	public void Buy()
	{
		Buy.click();		
	}
	public void Delivery()
	{
		Delivery.click();	
	}
	public void NSE()
	{
		NSE.click();		
	}
	public void BSE()
	{
		BSE.click();	
	}
	public void inputvalue()
	{
		inputvalue.sendKeys("1000");		
	}
	public void Limit()
	{
		Limit.click();	
	}
	public void Market()
	{
		Market.click();		
	}
	public void AdvanceOptions()
	{
		AdvanceOptions.click();	
	}
	public void RegularOrder()
	{
		RegularOrder.click();		
	}
	
	public void SLOrder()
	{
		SLOrder.click();		
	}
	public void Day()
	{
		Day.click();	
	}
//	public void Immediatly()
//	{
//		
//		Immediatly.click();		
//	}
	public void CONTINUE()
	{
		CONTINUE.click();		
	}
	public void AddMoney()
	{
		AddMoney.click();	
	}
	public void stockAddMoneyInput()
	{
		stockAddMoneyInput.sendKeys("100");	
	}
	public void AddMoneyfinal()
	{
		AddMoney.click();	
	}
	public void BuyButton()
	{
		BuyButton.click();
	}
}
