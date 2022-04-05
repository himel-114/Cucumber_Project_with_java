Feature: New_Planning_SP_014

  @login
  Scenario Outline: Check login is Successful with valid credentials
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    And click on login button
    And click planning button
    And click all planning button
#    And click all ViewUnit button
    And click Three dot
    And click New Planning Unit
    Then Home page visible

    Examples:
      | Username | Password |
      | arouf | SPOLAR@2022 |
