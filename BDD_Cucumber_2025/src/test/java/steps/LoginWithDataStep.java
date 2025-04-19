package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataStep {

	@Given("User is at signin page")
	public void user_is_at_signin_page() {
	    System.out.println("Given statement");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		System.out.println("When statement"+string);
	}

	@When("user eneters password as {string}")
	public void user_eneters_password_as(String string) {
		System.out.println("When statement"+string);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("When statement");
	}

	@Then("user should get logged into application")
	public void user_should_get_logged_into_application() {
		System.out.println("Then statement");
	}

}
