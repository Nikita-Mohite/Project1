Feature: Opening bank account
Scenario: Open account with nominee

Given User should be on an account page
When User enter the following details as
| Erine | Smith | erin.smith@gmail.com | 9011130050 |
|Robert | Jackson | robert.jackson@gmai.com | 9012360050 |
And User should clicks on the submit button
Then User should see the account number