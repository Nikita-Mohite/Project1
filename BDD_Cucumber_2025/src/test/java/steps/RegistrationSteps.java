package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("User should be on an account page")
	public void user_should_be_on_an_account_page() {
	    System.out.println("Given statment for account:-");
	}

	@When("User enter the following details as")
	public void user_enter_the_following_details_as(DataTable dataTable) {
		
	    List<List<String>> data = dataTable.asLists(String.class);
	    List<String> data_0 = data.get(0);
	    System.out.println("USer enters the data:-"+data_0);
	    String surename = data_0.get(1);
	    System.out.println(surename);
	    
	    String Firstname = data_0.getFirst();
	    String Lastname = data_0.getLast();
	    System.out.println(Firstname);
	    System.out.println(Lastname);
	    
	    for(int i=0;i<=2;i++)
	    {
	    	for(int j=i;j<=5;j++)
	    	{
	    		String date = data.get(i).get(j);
	    	    System.out.println(date);
	    	}
	    	
	    }
	    
	}

	@When("User should clicks on the submit button")
	public void user_should_clicks_on_the_submit_button() {
		System.out.println("When statement for account generation:-");
	}

	@Then("User should see the account number")
	public void user_should_see_the_account_number() {
		System.out.println("Then statement for account Registration :-");
	}
}
