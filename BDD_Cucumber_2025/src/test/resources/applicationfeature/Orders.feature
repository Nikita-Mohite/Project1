Feature: Order Functionality
Background: 
Given User should be logged in
And User should be at order page

Scenario: Fetch Currently placed order information
When User click on track order button
Then User should see status of order info  

Scenario: Fetch Previously placed order information
When User click on history button
Then User should see previously placed order info

Scenario: Fetch Cancelled placed order information
When User click on cancel order button
Then User should see cancelled placed order info