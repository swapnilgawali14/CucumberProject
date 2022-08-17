@Logintag
Feature: Login check feture
  I want to use this template for my login feature file

  @tag1
  Scenario: Valid Login scenario
    Given I am the user of this application
    When I enter my valid username
    And I enter my valid password
    And I click on login button
    Then I should get login successfully.

  @tag2
  Scenario: Invalid Login scenario
    Given I am the user of this application
    When I enter my invalid username
    And I enter my invalid password
    And I click on login button
    Then I should not login successfully
    And Error message should display
