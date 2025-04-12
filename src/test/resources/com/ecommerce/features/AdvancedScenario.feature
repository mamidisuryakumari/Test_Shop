Feature: Advanced registration form

  @form
  Scenario Outline: Verify advanced registration form
    Given I am on advanced registration form
    When I enter "<userName>","<password>" and "<email>"

    Examples: 
      | userName | password | email                   |
      | surya    | kumari   | kumari.mudila@gmail.com |
