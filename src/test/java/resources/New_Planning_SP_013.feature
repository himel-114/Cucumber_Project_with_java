Feature: Planning_Unit_SP_011

  @login
  Scenario Outline: Check login is Successful with valid credentials
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    And click on login button
    And click planning button
    And click all planning button
    And click all ViewUnit button
    Then Home page visible

    Examples:
      | Username | Password |
      | arouf | SPOLAR@2022 |
