package org.pomPackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testAutomationPoM {

	private WebDriver driver;
//	private Alert alt;
	
	@FindBy(xpath="//input[@id=\"Wikipedia1_wikipedia-search-input\"]")
	private WebElement text;
	@FindBy(xpath="//input[@class=\"wikipedia-search-button\"]")
	private WebElement search;
	@FindBy(xpath="//button[text()='Click Me']")
	private WebElement AlertClickMe;
	@FindBy(xpath="//input[@id=\"datepicker\"]")
	private WebElement datepicker;
	@FindBy(xpath="//table[@class=\"ui-datepicker-calendar\"]//tr[3]//td[5]")
	private WebElement date;
	@FindBy(xpath="//select[@id=\"speed\"]")
	private WebElement Speed;
	@FindBy(xpath="//select[@id=\"files\"]")
	private WebElement file;
	@FindBy(xpath="//select[@id=\"number\"]")
	private WebElement num;
	@FindBy(xpath="//select[@id=\"products\"]")
	private WebElement product;
	@FindBy(xpath="//select[@id=\"animals\"]")
	private WebElement Animal;
	@FindBy(xpath="//table[@name=\"BookTable\"]//tr")
	private WebElement row;
	public testAutomationPoM(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
//		alt=driver.switchTo().alert();
	}
	
	public void text()
	{
		text.sendKeys("Screenshot");	
	}
	public void search()
	{
		search.click();	
		
		String title=driver.getTitle();
		System.out.println(title);
		title.equals("Automation Testing Practice");
		
		if(title.equals("Automation Testing Practice"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
	}
	public void AlertClickMe()
	{
		AlertClickMe.click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void datepicker()
	{
		datepicker.sendKeys("06/26/2021");
	}
	public void date()
	{
		List<WebElement> date=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr[3]//td[5]"));
		for(int i=0;i<=date.size()-1;i++)
		{
			String s=date.get(i).getText();
			System.out.println(s);
		}
	}
	public void Speed()
	{
		Select sel=new Select(Speed);
		sel.selectByVisibleText("Faster");
	}
	public void file()
	{
		Select sele=new Select(file);
		sele.selectByVisibleText("TXT file");
	}
	public void num()
	{
		Select selec=new Select(num);
		selec.selectByVisibleText("5");
	}
	public void product()
	{
		Select se=new Select(product);
		se.selectByVisibleText("Iphone");
	}
	public void Animal()
	{
		Select si=new Select(Animal);
		si.selectByVisibleText("Cat");
	}
	public void tabel()
	{
		List<WebElement> row=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
		String text1;
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> column=row.get(i).findElements(By.xpath("//td"));
			for(int j=0;j<column.size();j++)
			{
				text1=column.get(j).getText();
				System.out.println(text1);
			}
		}
	}
	
}
