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
    And Buyer buying product of <Pin code> for "First" time
    And Login "Buyer" app with <Username> and <Password>
    And Buyer buying product of <Pin code> for "Second" time
    And Buyer buying product of <Pin code> for "Second" time
    And Buyer buying product of <Pin code> for "Second" time
    And Buyer buying product of <Pin code> for "Second" time
    And Buyer buying product of <Pin code> for "Second" time
    And Unregistration of "Buyer" using <Mobile_no> on "Admin" app

    Examples:
      | Mobile_no  | Username             | Password | Pin code |
      #| 8898347897 | 111shivraj@gmail.com | Test1    | 400078   |
      | 9988888888 | 9988888888@gmail.com | Test1    | 999999   |
      | 2222222222 | 2222222222@gmail.com | Test1    | 999999   |
      | 3333333333 | 3333333333@gmail.com | Test1    | 999999   |






