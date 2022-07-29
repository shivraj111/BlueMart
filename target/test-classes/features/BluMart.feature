Feature: Buyer functionality

@Test
  Scenario Outline: Verification of login and logout functionality
    Given Login "Buyer" application with <Username> and <Password>
    And Logout from App

    Examples:
      | Username             | Password          |
      | 111shivraj@gmail.com | ShivAnsh@22111995 |

@Test
  Scenario Outline: Verification of buying functionality
    Given Login "Buyer" application with <Username> and <Password>
    And Select product

    Examples:
      | Username             | Password          |
      | 111shivraj@gmail.com | ShivAnsh@22111995 |

@Test
  Scenario Outline: Verification of registration and unregistration functionality
    Given Login "Admin" application with <Username> and <Password>


    Examples:
      | Username         | Password  |
      | admin@blumart.in | Admin@123 |


  @Test_1
  Scenario Outline: Verification of login functionality through Mobile NO
    Given Login "Buyer" app with <Mobile_no>

    Examples:
      | Mobile_no  |
      | 8898347897 |


