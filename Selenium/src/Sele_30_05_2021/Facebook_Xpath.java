package Sele_30_05_2021;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Xpath {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "E:\\CLASS\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
			email.sendKeys("mohitenikita1995@gmail.com");
			Thread.sleep(2000);
			
			WebElement pass=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
			pass.sendKeys("88468845");
			
			WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
			login.click();
			Thread.sleep(9000);
			
			WebElement createANewAccount=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
			createANewAccount.click();
			Thread.sleep(9000);
			
			WebElement name=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
			name.click();
			name.sendKeys("Nikita");
			Thread.sleep(2000);
			
			WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
			lastname.sendKeys("Mohite");
			
			WebElement mobileno=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
			mobileno.sendKeys("7972095211");
			
			WebElement password=driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
			password.sendKeys("88468846");
			
			WebElement date=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
			Select s=new Select(date);
			s.selectByValue("22");
			Thread.sleep(1000);
			WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
			Select m=new Select(month);
			m.selectByIndex(3);
			Thread.sleep(1000);
			WebElement year=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
			Select y=new Select(year);
			y.selectByValue("1995");
			Thread.sleep(1000);
			WebElement female=driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]"));
			boolean result=female.isSelected();
			if(result==true)
			{
				System.out.println("true");
			}
			else
			{
				female.click();
			}
			Thread.sleep(3000);
			
			WebElement signup=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
			signup.click();
			Thread.sleep(3000);
			
			WebElement code=driver.findElement(By.xpath("//input[@name=\"code\"]")); 
			code.sendKeys("FB-12345");
			
			WebElement sendmsg=driver.findElement(By.xpath("//font[text()=\"Send SMS again\"]")); 
			sendmsg.click();
			Thread.sleep(2000);
			WebElement keep=driver.findElement(By.xpath("//a[@href=\"/change_contactpoint/dialog/\"]")); 
			keep.click();
		}

	}
