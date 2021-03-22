@LoginDemo
Feature: TestYou Login Functionality

  Scenario: verify the TestYou login functionality with valid user
    Given user is on Login Page
    When email and password text box are visible
    Then user enters username and passowrd
    And user verifies the username displayed on home page
    And user logs out
