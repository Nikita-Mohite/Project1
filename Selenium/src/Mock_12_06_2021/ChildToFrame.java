package Mock_12_06_2021;

import java.util.ArrayList;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildToFrame {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Alertpopup=driver.findElement(By.xpath("//a[text()=\"JS Popup Alert\"]"));
		Alertpopup.click();
		Thread.sleep(2000);
		WebElement Alert=driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_alert\"]"));
		Alert.click();
		Thread.sleep(2000);
		
		String main=driver.getWindowHandle();
		System.out.println(main);//CDwindow-F9D33B68778C62BCF8CD72A6B5BCA41F
		
		ArrayList<String> Address=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(Address.get(0));//CDwindow-F9D33B68778C62BCF8CD72A6B5BCA41F
		System.out.println(Address.get(1));//CDwindow-7ABF48870C0B5A13686696415B1B601A
	
		driver.switchTo().window(Address.get(1));//CDwindow-7ABF48870C0B5A13686696415B1B601A
		Thread.sleep(4000);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		
		//driver.switchTo().frame(AddOfFrame.get(1));
		//driver.switchTo().frame("//iframe[@id=\"iframeResult\"]");
		//driver.switchTo().frame("(//iframe)[1]");
		
		WebElement Tryit=driver.findElement(By.xpath("//button[text()=\"Try it\"]"));
		Tryit.click();
		Thread.sleep(2000);
		
		String mainofChild=driver.getWindowHandle();
		System.out.println(mainofChild);//CDwindow-7ABF48870C0B5A13686696415B1B601A
		
		ArrayList<String> AddOfFrame=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(AddOfFrame.get(0));
		System.out.println(AddOfFrame.get(1));
		Thread.sleep(3000);
		
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
//		System.out.println(alt.getText());
		
		
	}

}
