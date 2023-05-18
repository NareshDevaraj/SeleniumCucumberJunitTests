
@LoginDemoScenario
Feature: Test login functionality

@LoginDemoTest
  Scenario Outline: Check Login is successful with valid credential
    Given Open the browser
    And User is on the login page
    When user enters <username> and <password>
    And user clicks on login
    Then user should be navigated to the homepage

    Examples: 
      | username | password |
      | ABCD     |    12345 |
      | abce     |    12345 |
