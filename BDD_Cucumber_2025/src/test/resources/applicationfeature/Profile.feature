Feature: Create Profile Functionality
Background:
Given User is at the home page

@sanity
Scenario: Add Profile
When User clicks on add profile button
And User enter the information
Then User profile is created

@regression
Scenario: Update Profile
When User clicks on update profile button
And User updated information
Then User profile get updated

@functional
Scenario: Delete Profile
When User clicks on Delete profile button
And User enter the information
Then User profile is deleted