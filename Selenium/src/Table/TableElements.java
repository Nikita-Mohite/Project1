package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement table=driver.findElement(By.xpath("//a[text()=\"HTML Tables\"]"));
		table.click();
		
//		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
//		String Text;
//		for(int i=0;i<=row.size()-1;i++)
//		{
//			List<WebElement> cell=row.get(i).findElements(By.xpath("//td"));
//			for(int j=0;j<=cell.size()-1;j++)
//			{
//				Text=cell.get(j).getText();
//				//System.out.println(Text);
//				System.out.print(" "+Text+" ");
//			}
//			System.out.println();
//		}
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		String Text;
		for(int i=0;i<row.size()-1;i++)
		{
			List<WebElement> cell=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td"));
			for(int j=0;j<cell.size()-1;j++)
			{
				Text=cell.get(j).getText();
				System.out.println(Text);
			}
		}
	
	}

}
