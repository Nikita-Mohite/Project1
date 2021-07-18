package org.pomPackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkFetch {
	
	private WebDriver driver;
	
	@FindBy (xpath="//a")
	private WebElement link;
	
	public LinkFetch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void method()
	{
		List<WebElement> link=driver.findElements(By.xpath("//a"));
		for(int i=0;i<link.size()-1;i++)
		{
			//WebElement si=link.get(i).getAttribute(link);
			String s=link.get(i).getText();
			System.out.println(s);
		}
		
	}

}
