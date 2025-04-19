package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	WebDriver driver;
	
	HomePage hp = new HomePage(DriverFactory.getDriver());
	
	@Given("user is at landing page")
	public void user_is_at_landing_page()
	{
		
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.com/");
	    
	}

	@Then("page title should contain {string}")
	public void page_title_should_contain(String titletext)
	{
	String title = hp.fetchTitleOfPage();
	boolean isPresent = title.contains(titletext);
	System.out.println(isPresent);
	
	Assert.assertTrue(isPresent);	    
	}
	
	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed()
	{
		boolean displayed = hp.isCartIconDisplayed();
	    Assert.assertEquals(displayed, true);
	}

	@When("user clicks on smart phone deals")
	public void user_clicks_on_smart_phone_deals() {
	   hp.enteredDealSection();
	}

	@Then("deal section should get open")
	public void deal_section_should_get_open() {
	   boolean isDisplayed = hp.carousalDeal();
	   Assert.assertEquals(isDisplayed, true);
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    hp.enterUsername("mohitenikita1995@gmail.com");
	}

	@When("user enter the username")
	public void user_enter_the_username() {
		 hp.enterUsername("mohitenikita1995@gmail.com");
	}

	@When("user enter the password")
	public void user_enter_the_password() {
	    hp.enterPassword("123456789");
	}

	@Then("user is logged in to the application")
	public void user_is_logged_in_to_the_application() {
	    System.out.println("User logged in");
	}

}
