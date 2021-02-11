Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to Login Page
	And User enters "test@email.com" and "abcabc"
	
Scenario: Login with InValid Credentials
	Given User is on Home Page
	When User Navigate to Login Page
	And User enters "test@email.com" and "abc"	

 