package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {
	
	@Given("User should Landing to Login Page")
	public void navigate_to_loginPage()
	{
		System.out.println("User should Landing to Login Page");
	}
	
	@When("User should enter username")
	public void Username()
	{
		System.out.println("User should enter username");
	}
	
	@When("User should enter password")
	public void enterPassword()
	{
		System.out.println("User should enter password");
	}
	
	@When("User should click on Login button")
	public void user_should_click_on_login_button() {
		System.out.println("User should click on Login button");
	}
	
	@Then("User is able to login with correct Credential")
	public void validateHomePage()
	{
		System.out.println("Validating on Home page");
	}


}
