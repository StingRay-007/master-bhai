Feature: Signn in Function Validation

  Scenario: Sign in functions Validation
    Given User wants to open the browsers
    And And go to USPS homepage
    When User navigate to login button links
    And User inputs valid username: Sarowar201
    And user inputs valid password: Ttech1234$
    Then Pass or Fails