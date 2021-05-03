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

Feature: Application Login
  I want to use this template for my feature file
  
  #Background is the steps that will run always, like a before test. Like opening the browser
  Background: 
  Given validate the Browser
  When browser is trigered
  Then check if browser is started
  
	@SmokeTest1
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username and password
    Then Homepage is populated
    And Cards are displayed

#Passing simple arguments

  Scenario: Hope page default login
    Given User is on landing page
    When User login into application with "john" and "4321"
    Then Homepage is populated
    And Cards are displayed
    
#Data table 
   	@SmokeTest1 
  Scenario: Hope page default login
    Given User is on landing page
    When User loging with the following details
      | jenny | abcd | john@abcd.com | Australia | 4321553 |
    Then Homepage is populated
    And Cards are displayed

#Parametrizing tests. With traditional framework is not easy, a lot of coding. 

	Scenario Outline: Hope page default login PARAMETRIZED
    Given User is on landing page
    When Users can login into application with <username> and <password>
    Then Homepage is populated
    And Cards are displayed are "true"
    
    Examples: 
	    |username | password  |
	    |user1 |pass1  |
	    |user2 |pass2  |
	    |user3 |pass3  |
	    |user4 |pass4  |
	    |user5 |pass5  |
    
    
    
    
