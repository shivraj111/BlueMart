Feature: Buyer functionality

@Test
  Scenario Outline: Verification of login and logout functionality
    Given Login "Buyer" app with <Username> and <Password>
    And Logout from App

    Examples:
      | Username             | Password          |
      | 111shivraj@gmail.com | ShivAnsh@22111995 |

@Test
  Scenario Outline: Verification of buying functionality
    Given Login "Buyer" app with <Username> and <Password>
    And Select product

    Examples:
      | Username             | Password          |
      | 111shivraj@gmail.com | ShivAnsh@22111995 |


#------Validation of GST API pending
  @Test_1
  Scenario Outline: Verification of registration and unregistration functionality
    Given Registration of "Buyer" app using <Mobile_no> , <Username> and <Password>
    And Login "Buyer" app with <Username> and <Password>
    And Select product for <Pin>
    And Unregistration of "Buyer" using <Mobile_no> on "Admin" app

    Examples:
      | Mobile_no  | Username             | Password | Pin    |
      | 8898347897 | 111shivraj@gmail.com | Test1    | 400078 |


