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
Feature: Login

  Scenario: User tries to Login without entering the mobile number or email id
    Given User is on the CapStore Login page
    When The user leaves the modile number or email id field and clicks on login button
    Then Show the alert message to enter mobile number or email id
    
  Scenario: User tries to Login without entering the password
    Given User is on the CapStore Login page
    When The user leaves the password field and clicks on login button
    Then Show the alert message to enter password
    
    
  Scenario: User tries to Login with invalid mobile number or email id
    Given User is on the CapStore Login page
    When The user enters invalid modile number or email id in first field and clicks on login button
    Then Show the alert message to enter the valid mobile number or email id
    
  Scenario: User tries to Login with invalid password
    Given User is on the CapStore Login page
    When The user enters invalid password in password field and clicks on login button
    Then Show the alert message to enter the valid password
    
  Scenario: Login  successful
    Given User is on the CapStore Login page
    When The user enters valid credentials and clicks on login button
    Then Session starts and the user navigate to the CapStore home page
   

