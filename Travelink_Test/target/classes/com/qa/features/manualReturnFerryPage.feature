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

Feature: Create Manual Return Ferry Crossing
 
    Scenario: Create Manual Return Ferry Crossing
   
    When user enters the homePage
    Then user Clicks on Create new
    Then user enters the outfit details
    Then user saves the outfit details
    Then user creates a manual return ferry
    Then user adds the manual ferry basket
    Then user confirms the booking
