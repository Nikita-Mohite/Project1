package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	

@Given("User is at the home page")
public void user_is_at_the_home_page() {
   System.out.println("Given Statement");
}

@When("User clicks on add profile button")
public void user_clicks_on_add_profile_button() {
	System.out.println("click on add profile");
}

@When("User enter the information")
public void user_enter_the_information() {
	System.out.println("enter add info");
}

@Then("User profile is created")
public void user_profile_is_created() {
	System.out.println("Profile added");
}

@When("User clicks on update profile button")
public void user_clicks_on_update_profile_button() {
	System.out.println("click on update profile");
}

@When("User updated information")
public void user_updated_information() {
	System.out.println("enter update info");
}

@Then("User profile get updated")
public void user_profile_get_updated() {
	System.out.println("Profile updated");
}

@When("User clicks on Delete profile button")
public void user_clicks_on_delete_profile_button() {
	System.out.println("click on delete profile");
}

@Then("User profile is deleted")
public void user_profile_is_deleted() {
	System.out.println("Profile deleted");
}


}
