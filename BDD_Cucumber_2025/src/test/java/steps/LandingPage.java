package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LandingPage {
	

@Given("User should be at landing page")
public void user_should_be_at_landing_page() {
    System.out.println("given Statement");
}

@Then("User should see title of Landing page")
public void user_should_see_title_of_landing_page() {
	 System.out.println("Then Statement");
}



}
