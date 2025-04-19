Feature: Signup Functionality
Background:
Given User is at landing page
When USer click on create account button 

Scenario Outline:- Sign up into application with differnt datasets

Given User is at sign up page
When User enters first name "<firstname>" inside the form
When User enters age <age> inside the form
And User confirms gender "<Gender>" inside the form

Examples:
| firstname | age | Gender |
| Eder | 23 | Male |
| Ron| 54 | Male |
| Tommy | 32 | Male |