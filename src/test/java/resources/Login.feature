Feature: Login User

  @login
  Scenario Outline: Check login is Successful with valid credentials
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    And click on login button
    Then Home page visible

    Examples:
      | Username | Password |
      | arouf | SPOLAR@2022 |