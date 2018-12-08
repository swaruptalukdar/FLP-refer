#Author: Swarup Talukdar
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Logout
   
	Scenario: User Logs out
    Given User is on the CapStore homepage
    When The user clicks on Logout button
    Then Session ends and the user navigates to the CapStore login page
  
 	Scenario: User is inactive for 15 minutes
    Given User is on the CapStore homepage
    When The user is inactive for 15 minutes on the home page 
    Then Session ends and user gets logged out
     And The user navigates to the CapStore login page
     
	Scenario: User closes the CapStore homepage window
    Given User is on the CapStore home page
    When The user clicks on close bottun of the CapStore homepage window 
    Then Session ends and user gets logged out
     