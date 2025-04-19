Feature: Login with data functionality
Scenario: Login with data for correct credentilas
Given User is at signin page
When user enters username as "testusername"
And user eneters password as "test@1234"
And user clicks on submit button
Then user should get logged into application