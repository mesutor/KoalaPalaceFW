Feature: user should log in koalapalace home page

  Background: User is on the koalapalace page
    Given user is on the koalapalace page

  Scenario: TC01 user should log in with valid credentials
    Given user is on the koalapalace page
    And user clicks on the login button
    When user enters username
    When user enters password
    And user clicks login button
