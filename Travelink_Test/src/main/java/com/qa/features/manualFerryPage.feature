#Author: your.email@your.domain.com
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
Feature: Create Manual Ferry Crossing
 
  Scenario Outline: Create Manual Ferry Crossing
   
    When user enters the homePage
    Then user Clicks on Create new
    Then enter the number of <adults> and number of <children>
    Then user enters the outfit details
    Then user saves the outfit details
    Then user creates a manual ferry
    Then user adds the manual ferry basket
    Then user confirms the booking
  
 Examples:
    |adults|children|
		|1|0|
		|2|1|