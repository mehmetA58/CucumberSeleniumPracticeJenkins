Feature: Login
  As a user, I want to be able to login into
  vytrack under different roles with username and password

  Scenario: Login as store manager
    Given user is on the login page
    Then user logs in as a store manager
    And user verify that "Dashboard" page subtitle is displayed