Feature: Buyer login functionality


  Scenario Outline: Verification of login and logout functionality
    Given Launch the application
    And Login with <Username> and <Password>
    And Logout from App

    Examples:
      | Username             | Password          |
      | 111shivraj@gmail.com | ShivAnsh@22111995 |


  @Test
  Scenario Outline: Verification of buying functionality
    Given Launch the application
    And Login with <Username> and <Password>
    And Select product

    Examples:
      | Username             | Password          |
      | 111shivraj@gmail.com | ShivAnsh@22111995 |