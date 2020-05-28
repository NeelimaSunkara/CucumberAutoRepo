Feature: Create account of Facebook11
As a user u need to open facebook home page and do the validations

Scenario: Validate First Name field111
Given User need to be on Facebook login page
When User enters user "Neelima" first name
Then User checks user "Neelima" first name is present


Scenario: Validate create user multiple fields112
Given User need to be on Facebook login page
When User enters user "Prashant" first name 
And User enters user "Sriram" surname
Then User checks user "Prashant" first name is present 
Then User Mobile field should be blank

