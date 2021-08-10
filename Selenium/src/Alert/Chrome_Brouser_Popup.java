package Alert;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Brouser_Popup {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement jsPopUpAlert=driver.findElement(By.xpath("//a[text()=\"JS Popup Alert\"]"));
		WebElement AlertBox=driver.findElement(By.xpath("(//a[text()=\"Try it Yourself »\"])[1]"));
		WebElement ConfirmBox=driver.findElement(By.xpath("(//a[text()=\"Try it Yourself »\"])[2]"));
		WebElement PromptBox=driver.findElement(By.xpath("(//a[text()=\"Try it Yourself »\"])[3]"));
		WebElement LineBox=driver.findElement(By.xpath("(//a[text()=\"Try it Yourself »\"])[4]"));
		//jsPopUpAlert.click();
		AlertBox.click();
		ConfirmBox.click();
		PromptBox.click();
		LineBox.click();
		
		//code for main Browser Address
		String mainBrowser=driver.getWindowHandle();
		System.out.println(mainBrowser);
		
		//Code for child Browser Address
		ArrayList<String> arr=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(arr.get(0));//printing child browser address//CDwindow-83D038F7A70664806DD827D33D765DC6
		System.out.println(arr.get(1));//CDwindow-31E4AA31DFEBA843E17FEC2AE39AF309
		System.out.println(arr.get(2));//CDwindow-7970D0197A11BBB39DD3996097A8EC8C
		System.out.println(arr.get(3));//CDwindow-0CF07F72D42496DAEBC04ABFBAD39585
		System.out.println(arr.get(4));//CDwindow-30CFE70EA6DFA322EF6AC23B1B45EC42
		
		//here we are checking which address belong to which child browser
		driver.switchTo().window(arr.get(1));
		System.out.println(driver.getCurrentUrl());//https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2
		driver.switchTo().window(arr.get(2));
		System.out.println(driver.getCurrentUrl());//https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.switchTo().window(arr.get(3));
		System.out.println(driver.getCurrentUrl());//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
		driver.switchTo().window(arr.get(4));
		System.out.println(driver.getCurrentUrl());	//https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert
		
		
		
		
		
		
		
		
		
		
	}
}
