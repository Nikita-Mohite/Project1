package Project3_TestNG;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;


public class AutomationTest {
	private WebDriver driver;
	private Actions action;
	
	@FindBy(xpath="//input[@id=\"field1\"]")
	private WebElement click;
	@FindBy(xpath="//input[@id=\"field2\"]")
	private WebElement cli;
	@FindBy(xpath="//button[text()='Copy Text']")
	private WebElement copytext;
	@FindBy(xpath="//p[text()='Drag me to my target']")
	private WebElement drag;
	@FindBy(xpath="//p[text()='Drop here']")
	private WebElement drop;
	
	public AutomationTest(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);	
		action=new Actions(driver);
	}
	
	public void click()
	{
		action.moveToElement(click).doubleClick().build().perform();	
	}
	public void cli()
	{
		action.moveToElement(cli).doubleClick().build().perform();
	}
	public void copytext()
	{
		copytext.click();
	}
	public void dragAndDrop()
	{
		action.dragAndDrop(drag, drop);
	}


}
