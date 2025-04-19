package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("User is at landing page")
	public void user_is_at_landing_page() {
		 System.out.println("Landing page");
	}

	@When("USer click on create account button")
	public void u_ser_click_on_create_account_button() {
		 System.out.println("Account page");
	}
	
	@Given("User is at sign up page")
	public void user_is_at_sign_up_page() {
	    System.out.println("Sign Up page");
	}

	@When("User enters first name {string} inside the form")
	public void user_enters_first_name_inside_the_form(String string) {
	    System.out.println("Enetered name is:-"+string);
	}

	@When("User enters age {int} inside the form")
	public void user_enters_age_inside_the_form(Integer int1) {
		 System.out.println("Enetered age is:-"+int1);
	}

	@When("User confirms gender {string} inside the form")
	public void user_confirms_gender_inside_the_form(String string) {
		 System.out.println("Enetered gender is:-"+string);
	}



}
