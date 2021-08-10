package POM_Groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driver;
	@FindBy(xpath="//span[text()='Login/Register']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id=\"login_email1\"]")
	private WebElement email;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement Continue;

	@FindBy(xpath="//div[text()='Continue with Google']")
	private WebElement continuewithgoogle;
	
	@FindBy(xpath="//input[@id=\"identifierId\"]")
	private WebElement idemail;
	
	
	@FindBy(xpath="//span[text()=\"Next\"]")
	private WebElement enext;
//	
//	@FindBy(xpath="//span[text()='Continue']")
//	private WebElement Continue;
//
//	@FindBy(xpath="//div[text()='Continue with Google']")
//	private WebElement continuewithgoogle;
//	
//	@FindBy(xpath="//input[@id=\"identifierId\"]")
//	private WebElement id;
//	
	

	@FindBy(xpath="//input[@id=\"login_password1\"]")
	private WebElement password;
	
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath="//div[text()=\"Forgot Password?\"]")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//div[text()=\"mohitenikita1995@gmail.com\"]")
	private WebElement emailidoption;
	
	@FindBy(xpath="//input[@id=\"pannumber\"]")
	private WebElement pancard;
	
	@FindBy(xpath="//span[text()=\"VERIFY PAN\"]")
	private WebElement verify;
	
	@FindBy(xpath="//span[text()='I CONFIRM, I AM NIKITA SHANKAR MOHITE']")
	private WebElement confirm;
	
	@FindBy(xpath="//input[@id=\"dateofbirth\"]")
	private WebElement DOB;
	
	@FindBy(xpath="//span[text()='NEXT']")
	private WebElement next;
	
	@FindBy(xpath="//div[text()='Female']")
	private WebElement female;
	
	@FindBy(xpath="//div[text()='Single']")
	private WebElement single;
	
	@FindBy(xpath="//div[text()='Indian']")
	private WebElement India;
	
	@FindBy(xpath="(//span[text()='CONTINUE'])[1]")
	private WebElement KYCcontinue;
			
	@FindBy(xpath="(//div[text()=\"Student\"])[1]")
	private WebElement student;
			
	@FindBy(xpath="(//div[text()='Upto Rs.1 Lakh'])[1]")
	private WebElement income;
			
	@FindBy(xpath="//input[@id=\"fathername\"]")
	private WebElement fathername;
			
	@FindBy(xpath="//input[@id=\"mothername\"]")
	private WebElement mothername;
	
	@FindBy(xpath="//span[text()=\"NEXT\"]")
	private WebElement nextKYC;
	
	@FindBy(xpath="//div[text()=\"Yes\"]")
	private WebElement nominee;
	
	@FindBy(xpath="//input[@id=\"nomineename\"]")
	private WebElement nname;
	
	@FindBy(xpath="//div[text()=\"Select Relation\"]")
	private WebElement relation;
	
	@FindBy(xpath="//div[text()=\"Brother\"]")
	private WebElement brother;
	
	@FindBy(xpath="//input[@id=\"dateofbirth\"]")
	private WebElement nDOB;
	
	@FindBy(xpath="//span[text()=\"NEXT\"]")
	private WebElement nnext;

	@FindBy(xpath="//input[@id=\"bankname\"]")
	private WebElement bankname;
	
	@FindBy(xpath="//input[@id=\"branchname\"]")
	private WebElement branchname;
	
	@FindBy(xpath="//input[@id=\"bankacno\"]")
	private WebElement bankaccount;
	
	@FindBy(xpath="//span[text()=\"VERIFY BANK ACCOUNT\"]")
	private WebElement verifyaccount;
	
	@FindBy(xpath="//div[text()=\"No Experience\"]")
	private WebElement noexperience;
	
	@FindBy(xpath="//span[text()=\"PROCEED\"]")
	private WebElement proceed;
	
	@FindBy(xpath="//span[text()=\"Proceed for KYC\"]")
	private WebElement proceedforKYC;

	public LoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void login()
	{
		login.click();
	}	
	public void email()
	{
		email.sendKeys("mohitenikita1995@gmail.com");
	}
	public void Continue()
	{
		Continue.click();
	}
	public void continuewithgoogle()
	{
		continuewithgoogle.click();
	}
	public void idemail()
	{
		idemail.sendKeys("mohitenikita1995@gmail.com");
	}
	public void enext()
	{
		enext.click();
	}
	public void password()
	{
		password.sendKeys("88468846");
	}
	public void submit()
	{
		submit.click();
	}
	
	
	
	
//	public void password()
//	{
//		password.sendKeys("88468846");
//	}
//	public void submit()
//	{
//		submit.click();
//	}
	public void forgotPassword()
	{
		forgotPassword.click();
	}
	public void emailidoption()
	{
		emailidoption.click();
	}
	public void pancard()
	{
		pancard.sendKeys("DEHPM5218A");
	}
	public void verify()
	{
		verify.click();
	}
	public void confirm()
	{
		confirm.click();
	}
	public void DOB()
	{
		DOB.sendKeys("22/03/1995");
	}
	public void next()
	{
		next.sendKeys("22/03/1995");
	}
	
	public void female()
	{
		female.isSelected();
	}
	public void single()
	{
		single.isSelected();
	}
	public void India()
	{
		India.isSelected();
	}
	public void KYCcontinue()
	{
		KYCcontinue.click();
	}
	public void student()
	{
		student.click();
	}
	public void income()
	{
		income.click();
	}
	public void fathername()
	{
		fathername.sendKeys("SHANKAR NANA MOHITE");
	}
	public void mothername()
	{
		mothername.sendKeys("VANITA SHANKAR MOHITE");
	}
	public void nextKYC()
	{
		nextKYC.click();
	}
	public void nominee()
	{
		nominee.click();
	}
	public void nname()
	{
		nname.sendKeys("SHUBHAM SHANKAR MOHITE");
	}
	public void relation()
	{
		relation.click();
	}
	public void brother()
	{
		brother.click();
	}
	public void nDOB()
	{
		nDOB.sendKeys("04/11/2000");
	}
	public void nnext()
	{
		nnext.click();
	}
	
	public void bankname()
	{
		bankname.sendKeys("STANDARD CHARTED BANK");
	}
	public void branchname()
	{
		branchname.sendKeys("SCBL0036050");
	}
	
	public void bankaccount()
	{
		bankaccount.sendKeys("22911332797");
	}
	public void verifyaccount()
	{
		verifyaccount.click();
	}
	public void noexperience()
	{
		noexperience.click();
	}
	public void proceed()
	{
		proceed.click();
	}
	public void proceedforKYC()
	{
		proceedforKYC.click();
	}
	
	
}

