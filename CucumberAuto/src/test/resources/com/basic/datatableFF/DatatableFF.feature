Feature: Create account of Facebook3
As a user u need to open facebook home page and do the validations

#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user "Prashant" first name 
#When User enters user "Sriram" surname
#When User enters mobile "1234"
#Given User need to be on Facebook login page
#When User enters user "Prashant" first name 
#When User enters user "Sriram" surname
#When User enters mobile "1234"

#we can do as shown above but there is a better way of doing this using data table, let's see

Scenario: Validate create user multiple fields31
Given User need to be on Facebook login page
When Enter following data
	|userName |userSurname |Mobile|
	|Prashant |Sriram			 |1234	|
	|Mrudaanee|Sriram			 |5678	|

