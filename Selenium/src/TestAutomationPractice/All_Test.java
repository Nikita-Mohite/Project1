package TestAutomationPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class All_Test {

	public static void Screen(WebDriver driver, String time) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Administrator.DESKTOP-N7MD7B5\\Pictures\\Selenium\\TestAutomation\\test"+time+".jpeg");
		Files.copy(scr, dest);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Date d=new Date(0);
		String time=d.toString().replace(' ','-').replace(':', '_');
		System.out.println(time);
		
		Screen(driver,time);
		Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		text.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
		button.click();
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		
		WebElement Text=driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		Text.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement Button=driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
		Button.click();
		Thread.sleep(2000);
		
		WebElement AlertClickMe=driver.findElement(By.xpath("//button[text()='Click Me']"));
		AlertClickMe.click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
//		alt.dismiss();
//		//alt.sendKeys(" URL");
//		String txt=alt.getText();
//		System.out.println(txt);
//		Thread.sleep(2000);
		
		
//		WebElement DatePicker=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
//		DatePicker.click();
//		Thread.sleep(2000);
//		
//		List<WebElement> Calentder=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr[4]//td[3]"));
//		((WebElement) Calentder).click();
//		Thread.sleep(3000);
		
//		String t;
//		for(int i=0;i<Calentder.size();i++)
//		{
//			List <WebElement> col=Calentder.get(i).findElements(By.xpath("//td"));
//			for(int j=0;j<col.size();j++)
//			{
//				String s=col.get(j).getText();
//				System.out.println(s);
//			}
//		}
		
		
		WebElement Speed=driver.findElement(By.xpath("//select[@id=\"speed\"]"));
		Select sel=new Select(Speed);
		sel.selectByVisibleText("Faster");
		Thread.sleep(2000);
			
		WebElement file=driver.findElement(By.xpath("//select[@id=\"files\"]"));
		Select sele=new Select(file);
		sele.selectByVisibleText("TXT file");
		Thread.sleep(2000);
		
		WebElement num=driver.findElement(By.xpath("//select[@id=\"number\"]"));
		Select selec=new Select(num);
		selec.selectByVisibleText("5");
		Thread.sleep(2000);
		
		WebElement product=driver.findElement(By.xpath("//select[@id=\"products\"]"));
		Select se=new Select(product);
		se.selectByVisibleText("Iphone");
		Thread.sleep(2000);
		
		WebElement Animal=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		Select si=new Select(Animal);
		si.selectByVisibleText("Cat");
		Thread.sleep(2000);
		
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
		
		WebElement iframe=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		WebElement fname=driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-1\"]"));
		fname.sendKeys("Niki");
		Thread.sleep(2000);
	
		WebElement lname=driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-2\"]"));
		lname.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement phone=driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-3\"]"));
		phone.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-4\"]"));
		country.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-5\"]"));
		city.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement Address=driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-6\"]"));
		Address.sendKeys("Screenshot");
		Thread.sleep(2000);
		
		WebElement female=driver.findElement(By.xpath("//label[text()='Female']"));
		female.isSelected();
		Thread.sleep(2000);
		
		WebElement Monday=driver.findElement(By.xpath("//label[text()='Monday']"));
		Monday.isSelected();
		Thread.sleep(2000);
		
		WebElement Morning=driver.findElement(By.xpath("//select[@id=\"RESULT_RadioButton-9\"]"));
		Select Mor=new Select(Morning);
		Mor.selectByIndex(0);
		Thread.sleep(2000);
		
		WebElement Sub=driver.findElement(By.xpath("//input[@id=\"FSsubmit\"]"));
		Sub.submit();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		WebElement click=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(click).doubleClick().build().perform();
		Thread.sleep(2000);
		
		WebElement cli=driver.findElement(By.xpath("//input[@id=\"field2\"]"));
		Actions actio=new Actions(driver);
		actio.moveToElement(cli).doubleClick().build().perform();
		Thread.sleep(2000);
		
		WebElement copytext=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		copytext.click();
		Thread.sleep(2000);
		
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions dragn=new Actions(driver);
		dragn.dragAndDrop(drag, drop);
		
		
		
		
		
		
		
	}

}
