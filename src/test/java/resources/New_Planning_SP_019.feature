Feature: New_Planning_SP_019

  @login
  Scenario Outline: Check login is Successful with valid credentials
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    And click on login button
    And click planning button
    And click all planning button
    And click Three dot
    And click New Planning Unit
#    And click Planning Unit Type
#    And click Planning Unit Testing
    And click Edit Button
    And click Planning Unit Titles "<Title>"
    Then Home page visible

    Examples:
      | Username | Password | Title |
      | arouf | SPOLAR@2022 | diamondj |
