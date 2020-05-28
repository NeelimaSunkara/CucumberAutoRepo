Feature: Create account of Facebook1
As a user u need to open facebook home page and do the validations

Background: common login steps
Given User need to be on Facebook login page

Scenario: Validate First Name field11
When User enters user "Neelima" first name
Then User checks user "Neelima" first name is present
Then close browser

Scenario: Validate create user multiple fields12
When User enters user "Prashant" first name 
And User enters user "Sriram" surname
Then User checks user "Prashant" first name is present 
Then User Mobile field should be blank
Then close browser
