package POM_TestAutomationPractice;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
	
	private WebDriver driver;
	
	
	@FindBy(xpath="//iframe")
	private WebElement iframe;
	@FindBy(xpath="//input[@id=\"RESULT_TextField-1\"]")
	private WebElement fname;
	@FindBy(xpath="//input[@id=\"RESULT_TextField-2\"]")
	private WebElement lname;
	@FindBy(xpath="//input[@id=\"RESULT_TextField-3\"]")
	private WebElement phone;
	@FindBy(xpath="//input[@id=\"RESULT_TextField-4\"]")
	private WebElement country;
	@FindBy(xpath="//input[@id=\"RESULT_TextField-5\"]")
	private WebElement city;
	@FindBy(xpath="//input[@id=\"RESULT_TextField-6\"]")
	private WebElement Address;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female;
	@FindBy(xpath="//label[text()='Monday']")
	private WebElement Monday;
	@FindBy(xpath="//select[@id=\"RESULT_RadioButton-9\"]")
	private WebElement Morning;
	@FindBy(xpath="//input[@id=\"FSsubmit\"]")
	private WebElement Sub;
	
	public Iframe(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);	
	}
	
	public void iframe()
	{
		driver.switchTo().frame(iframe);	
	}
	public void fname()
	{
		fname.sendKeys("Niki");
	}
	public void lname()
	{
		lname.sendKeys("Screenshot");
	}
	public void phone()
	{
		phone.sendKeys("Screenshot");
	}
	public void country()
	{
		country.sendKeys("Screenshot");
	}
	public void city()
	{
		city.sendKeys("Screenshot");
	}
	public void Address()
	{
		Address.sendKeys("Screenshot");
	}
	public void female()
	{
		female.isSelected();
	}
	public void Monday()
	{
		Monday.isSelected();
	}
	public void Morning()
	{
		Select Mor=new Select(Morning);
		Mor.selectByIndex(0);
	}
	public void Sub()
	{
		Sub.submit();
		driver.switchTo().parentFrame();
	}
	
}
