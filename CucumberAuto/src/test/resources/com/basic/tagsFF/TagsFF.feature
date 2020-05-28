@Important
Feature: Create account of Facebook12
As a user u need to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name field1121
Given User need to be on Facebook login page
When User enters user "Neelima" first name
Then User checks user "Neelima" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields2122
Given User need to be on Facebook login page
When User enters user "Prashant" first name 
And User enters user "Sriram" surname
Then User checks user "Prashant" first name is present 
Then User Mobile field should be blank
Then close browser

Scenario: Validate First Name field3123
Given User need to be on Facebook login page
When User enters user "Neelima" first name
Then User checks user "Neelima" first name is present
Then close browser

@Regression
Scenario: Validate First Name field4124
Given User need to be on Facebook login page
When User enters user "Neelima" first name
Then User checks user "Neelima" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field5125
Given User need to be on Facebook login page
When User enters user "Neelima" first name
Then User checks user "Neelima" first name is present
Then close browser
