package AutomationPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class LauchBrowser {
	
	public static void screenshot(WebDriver driver1) throws IOException
	{
		File source = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\mohit\\OneDrive\\Pictures\\Screenshots\\a.jpeg");
		Files.copy(source, dest);
	}
	
	public static void ScrollDownMethod(WebDriver driver2)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver2);
		js.executeScript("window.ScrollBy(300,0)");		
	}
	
	public static void mouseActions(WebDriver driver3)
	{
		Actions act = new Actions(driver3);
		act.moveToElement(null).build().perform();
		act.build();
		act.click();
		act.doubleClick();
		act.contextClick();	
	}
	
	public static void excelSheet() throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Users\\mohit\\OneDrive\\Pictures\\Test.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("TestSheet").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		//OR
		
		String path1 = "C:\\Users\\mohit\\OneDrive\\Pictures\\Test.xlsx";
		FileInputStream file1 = new FileInputStream(path1);
		Sheet sh = WorkbookFactory.create(file1).getSheet("TestSheet");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Row rw = sh.getRow(i);
				Cell cl = rw.getCell(j);
				String value1 = cl.getStringCellValue();
				System.out.println(value1);
			}
		}
		
		//OR
//		
//		int rowNum = sh.getLastRowNum();
//		System.out.println(rowNum);
//		Row rowValue = sh.getRow(1);		
//		
//		int CellNum = rowValue.getLastCellNum();
//		System.out.println(CellNum);
//		Cell cellValue = rowValue.getCell(1);
//		String valu = cellValue.getStringCellValue();
//		double db = cellValue.getNumericCellValue();
//		
//		System.out.println(valu + " And" + db);
			
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Nikita\\Testing OLD\\Testing OLD Programming_2025\\Software_driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
/*	driver.get("https://www.google.com/");
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	boolean result = url.equals("https://en-gb.facebook.com/");
	if(result==true)
	{
		System.out.println("Test Pass");
	}
	else 
	{
		System.out.println("Test Fail");
	}
	
	String Title = driver.getTitle();
	System.out.println(Title);
	boolean result1 = Title.equals("facebook");
	if(result1==true)
	{
		System.out.println("Test Pass");
	}
	else 
	{
		System.out.println("Test Fail");
	}
	
	Dimension d=new Dimension(350, 450);
	driver.manage().window().setSize(d);
	
	Point p = new Point(300, 500);
	driver.manage().window().setPosition(p);
	
*/
	
	//AMAZON PROJECT
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement SearchTextbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	SearchTextbox.click();
	Thread.sleep(2000);

	WebElement TypeSearchItem = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	TypeSearchItem.sendKeys("washing machine top load fully automatic");
	Thread.sleep(2000);
	
	WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	SearchButton.click();
	Thread.sleep(5000);
/*	
	WebElement SearchItem = driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']/div/div[1]"));
	SearchItem.sendKeys("washing machine 10kg fully automatic front load");
	Thread.sleep(2000);
	//span[text()='washing machine 10kg']
	
	
	WebElement Name = driver.findElement(By.xpath("(//span[text()='Haier 8 Kg 5 Star Inverter Motor AI DBT Technology Fully-Automatic Front Load Washing Machine with In-Built Heater (EFL80-IM12IBIEBK, Super Drum 525, PuriSteam, Black)'])[1]"));
	Name.click();
	Thread.sleep(5000);
	
	WebElement BankOffer = driver.findElement(By.xpath("//h6[text()=' Bank Offer '])[1]"));
	BankOffer.click();
	Thread.sleep(5000);
	
	WebElement Offer = driver.findElement(By.xpath("(//a[@class='a-spacing-base a-link-emphasis'])[22]"));
	Offer.click();
	Thread.sleep(5000);
	
	String readText = Offer.getText();
	System.out.println(readText);
	Thread.sleep(3000);
	
	WebElement BackButton = driver.findElement(By.xpath("(//h1[@class='a-size-medium-plus'])[18]"));
	BackButton.click();
	Thread.sleep(5000);
	
	WebElement CancelButton = driver.findElement(By.xpath("//i[@class='a-icon a-icon-close-white a-icon-medium twister-plus-close-button']"));
	CancelButton.click();
	Thread.sleep(5000);
	
	WebElement StyleName = driver.findElement(By.xpath("//span[@id='style_name_0-announce']"));
	StyleName.click();
	Thread.sleep(5000);
	
	WebElement AddToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	AddToCart.click();
	Thread.sleep(5000);
	
	WebElement ProceedToCheckout = driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button-announce']"));
	ProceedToCheckout.click();
	Thread.sleep(5000);
	
	screenshot(driver);
	
	WebElement GetItByTomorrowCheckbox = driver.findElement(By.xpath("//span[text()='Get It in 2 Days']"));
	boolean result2 = GetItByTomorrowCheckbox.isSelected();
	
	if(result2==true)
	{
		System.out.println(true);
	}
	else
	{
		GetItByTomorrowCheckbox.isSelected();
	}
	Thread.sleep(5000);
	
	//DropDownBox
	Select s = new Select(GetItByTomorrowCheckbox);
	s.selectByIndex(2);
	s.selectByVisibleText("");
	s.selectByValue("");
	Thread.sleep(5000);
	
	//Alert
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	WebElement SubmitButton = driver.findElement(By.xpath("//input[@type='submit']"));
	SubmitButton.click();
	
	Alert alt = driver.switchTo().alert();

	String text = alt.getText();
	System.out.println(text);
	
	if(text.equals("Do you really want to delete this Customer?"))
	{
		alt.accept();
	}
	else
	{
		alt.dismiss();
	}
//	alt.accept();
//	alt.dismiss();
//	alt.sendKeys("A");
	
//	driver.switchTo().alert().accept();
//	driver.switchTo().alert().dismiss();
//	driver.switchTo().alert().getText();
	
	Alert alt1 = driver.switchTo().alert();
	alt1.accept();
*/
	
	//ChildBrowser
	
	driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
	Thread.sleep(10000);
	
	WebElement TryItYourSeltButton1 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	TryItYourSeltButton1.click();
	Thread.sleep(10000);
	
	WebElement TryItYourSeltButton2 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	TryItYourSeltButton2.click();
	Thread.sleep(10000);
	
	WebElement TryItYourSeltButton3 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	TryItYourSeltButton3.click();
	Thread.sleep(5000);
	
	String mainpageAdd = driver.getWindowHandle();//fetch only Main page address;
	System.out.println(mainpageAdd);
	
	//Set<String> addr = driver.getWindowHandles(); //fetch all page address;
	
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	addr.get(0);
	addr.get(1);
	addr.get(2);
	System.out.println(addr.get(0));
	System.out.println(addr.get(1));
	System.out.println(addr.get(2));
	
	driver.switchTo().window(addr.get(0));
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(mainpageAdd);
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(addr.get(2));
	System.out.println(driver.getCurrentUrl());
	
//iFrame:-
	
	WebElement iframe = driver.findElement(By.xpath("(//iframe[1])[2]"));
	driver.switchTo().frame(0);
	driver.switchTo().frame(iframe);
	driver.switchTo().frame("abd");
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
//	//ScrollDownAction
 
	JavascriptExecutor j = ((JavascriptExecutor)driver);
	
	j.executeScript("window.ScrollBy(0,300)");
	Thread.sleep(5000);
	
	j.executeScript("window.scrollBy(0,-800)");
	
	//Mouse Actions:-
	
	Actions act = new Actions(driver);
	
	act.moveToElement(iframe).build().perform();
	act.click();
	act.contextClick();
	act.doubleClick();
	act.dragAndDrop(TryItYourSeltButton3, iframe);
	
	
	//Table
	
	List<WebElement> ele = driver.findElements(By.xpath("//a"));
	 String eleValue = ele.get(0).getText();
	 System.out.println(eleValue);
	 
	//DynamicTable
	 
	 driver.get("https://www.w3schools.com/html/html_tables.asp");
	 List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//td"));
	 for(int i=0;i<cells.size();i++)
	 {
		 String st = cells.get(i).getText();
		 System.out.println(st);
	 }
	
	 //OR
	 
	 List<WebElement> row = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
	 for(int i=0;i<=row.size();i++)
	 {
		 List<WebElement> cell =row.get(i).findElements(By.xpath("//td"));
		 //or
		//List<WebElement> cell =row.get(i).findElements(By.xpath("//table[@class='ws-table-all']//tr["+i+"]//td"));
		 for(int k=0;k<=cell.size();k++)
		 {
			 String cellValue = cell.get(k).getText();
			 System.out.println(cellValue);
		 }
	 }
	
//	driver.close();
//	driver.quit();	
	}
}
