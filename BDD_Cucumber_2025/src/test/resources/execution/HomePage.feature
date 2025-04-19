Feature: Home Page Functionality
Background:
Given user is at landing page

@sanity
Scenario: validation of title
Then page title should contain "Shopping"

@functional
Scenario: Verify cart icon
Then cart icon should get displayed

@regression
Scenario: Checkout the deals section
When user clicks on smart phone deals
Then deal section should get open

@sanity
Scenario: Login to an application
When user clicks on signin button
And user enter the username
And user enter the password
Then user is logged in to the application