package org.pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwSell {

	
	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//input[@id=\"mainSearch1010\"]")
	private WebElement Search;
	@FindBy(xpath="(//span[text()='Reliance Industries Ltd'])[1]")
	private WebElement mouseaction;
	@FindBy(xpath="//div[text()='SELL']")
	private WebElement Sell;
	@FindBy(xpath="//span[text()='Delivery']")
	private WebElement Delivery;
	@FindBy(xpath="//span[text()='NSE']")
	private WebElement BSE;
	@FindBy(xpath="//input[@id=\"inputShare\"]")
	private WebElement inputvalue;
	@FindBy(xpath="//span[text()='Limit']")
	private WebElement Limit;
	@FindBy(xpath="//input[@step=\"0.05\"]")
	private WebElement MarketPriceOfShare;
	@FindBy(xpath="//span[text()='SELL']")
	private WebElement SellButton;
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
	@FindBy(xpath="//span[text()='Advanced Options']")
	private WebElement AdvanceOptions;
	
	@FindBy(xpath="//i[text()='arrow_back']")
	private WebElement arrowBack;
	public GrowwSell(WebDriver d1)
	{
		this.driver=d1;
		//act=new Actions(driver);
		PageFactory.initElements(driver,this);
	}
	public void Search() throws InterruptedException
	{
		Search.sendKeys("Reliance Industries Ltd");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(mouseaction).click().build().perform();
	}
	public void Sell()
	{
		Sell.click();		
	}
	public void Delivery()
	{
		Delivery.click();	
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
	public String MarketPriceOfShare()
	{
		String val=MarketPriceOfShare.getText();	
		return val;
	}
	public void AdvanceOptions()
	{
		AdvanceOptions.click();	
	}
	public void SellButton()
	{
		SellButton.click();	
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
	
	public void arrowBack()
	{
	arrowBack.click();
	}
}
