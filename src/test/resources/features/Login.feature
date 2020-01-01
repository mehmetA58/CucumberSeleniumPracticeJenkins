Feature: Login
  As a user, I want to be able to login into
  vytrack under different roles with username and password

  Scenario: Login as store manager
    Given user is on the login page
    Then user logs in as a store manager
    And user verify that "Dashboard" page subtitle is displayed

  Scenario: Login as driver
    Given user is on the login page
    Then user logs in as a driver
    And user verify that "Dashboard" page subtitle is displayed

  Scenario: Login as sales manager
    Given user is on the login page
    Then user logs in as a sales manager
    And user verify that "Dashboard" page subtitle is displayed