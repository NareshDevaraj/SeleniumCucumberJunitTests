#Author
#Date
#Description
@SmokeScenario
Feature: Feature to test login functionality

  @smokeTest
  Scenario: Check Login is successful with Valid Credential in chrome
    Given user is on login page in chrome
    When user enters username password in chrome
    And clicks on loginbutton in chrome
    Then user is navigated to the home page in chrome
  #Scenario Outline: Check Login is successful with Valid Credential
   # Given user is on login page
   # When user enters <username> and <password>
  #  And clicks on login button
   # Then user is navigated to the home page
#
  #  Examples: 
   #   | username | password |
  #    | user1    | pass1    |
   #   | user2    | pass2    |
