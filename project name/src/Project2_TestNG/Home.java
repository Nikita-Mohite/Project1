package Project2_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {


	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="//input[@id=\"mainSearch1010\"]")
	private WebElement mainSearch;
	
	@FindBy(xpath="//span[text()='Adani Green Energy Ltd']")
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
	public Home(WebDriver d1)
	{
		this.driver=d1;
		//act=new Actions(driver);
		PageFactory.initElements(driver,this);
	}
	public void mainSearch()
	{
		mainSearch.sendKeys("Adani Green Energy Ltd.");	
		Actions act=new Actions(driver);
		act.moveToElement(mouseaction).click().build().perform();
	}
		
//	public void unlockstock()
//	{
//		unlockstock.click();	
//	}
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
}
