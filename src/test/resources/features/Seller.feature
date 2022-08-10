Feature: Seller functionality

  @Test_2
  Scenario Outline: Verification of registration functionality
    Given Registration of "Seller" app using <Mobile_no> , <GST> , <PAN> , <Seller_Name> , <Email_id> and <Password>
    And Login "Buyer" app with <Username> and <Password>
    And Buyer buying product of <Pin code> for "First" time
    And Login "Buyer" app with <Username> and <Password>
    And Buyer buying product of <Pin code> for "Second" time
    #And Unregistration of "Buyer" using <Mobile_no> on "Admin" app

    Examples:
      | Mobile_no  | Username             | Password | Pin code |
      | 8898347897 | 111shivraj@gmail.com | Test1    | 400078   |







