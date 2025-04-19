package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	@Given("User should be logged in")
	public void user_should_be_logged_in() {
	    System.out.println("Given for all scenarios");
	}

	@Given("User should be at order page")
	public void user_should_be_at_order_page() {
		System.out.println("Given for order page");
	}

	@When("User click on track order button")
	public void user_click_on_track_order_button() {
		   System.out.println("When for Currently track order button");
	}

	@Then("User should see status of order info")
	public void user_should_see_status_of_order_info() {
		System.out.println("Then for Currently track order button");
	}

	@When("User click on history button")
	public void user_click_on_history_button() {
		 System.out.println("When for previously placed order button");
	}

	@Then("User should see previously placed order info")
	public void user_should_see_previously_placed_order_info() {
		 System.out.println("Then for previously placed order button");
	}

	@When("User click on cancel order button")
	public void user_click_on_cancel_order_button() {
		 System.out.println("When for cancelled order button");
	}

	@Then("User should see cancelled placed order info")
	public void user_should_see_cancelled_placed_order_info() {
		System.out.println("Then for cancelled order button");
	}




}
