package methodChaining;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Method get
		driver.get("https://www.selenium.dev/downloads/");
		//Thread.sleep(3000);
		
		//maximize screen
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		//method navigate
//		driver.navigate().to("https://www.facebook.com");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		
//		//method equal
//		driver.equals(driver);
//		
//		//method Title
//		String Title=driver.getTitle();
//		System.out.println(Title);
//		
//		//method getCurrentUrl
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		
		Dimension d=new Dimension(400,500);//pixel(l,h)
		driver.manage().window().setSize(d);
		
//		Point p=new Point(600,400);
//		driver.manage().window().setPosition(p);//co-ordinates(x,y) in pixel
		
//		Point p=new Point(100,200);
//		driver.manage().window().setPosition(p);
//		
//		Point p=new Point(-100,-200);
//		driver.manage().window().setPosition(p);
//		
		Point p=new Point(650,-150);
		driver.manage().window().setPosition(p);
//		//method to close
//		driver.close();
//				
//		//method to quite
//		driver.quit();
//				
//		
		
		

	}

}
