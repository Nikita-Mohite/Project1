package Sele_30_05_2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.get("https://www.gmail.com");
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		boolean result=Title.equals("Facebook");
				
		if(result==true)
		{
			System.out.println(Title);
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();
		driver.quit();

		
	}

}
