Feature: Seller functionality

  @Test_2
  Scenario Outline: Verification of registration functionality
    Given Registration of "Seller" application using <Mobile_no> , <GST> , <PAN> , <Seller_Name> , <Email_id> and <Password>
#    And Login "Buyer" app with <Username> and <Password>
#    And Buyer buying product of <Pin code> for "First" time
#    And Login "Buyer" app with <Username> and <Password>
#    And Buyer buying product of <Pin code> for "Second" time
    #And Unregistration of "Buyer" using <Mobile_no> on "Admin" app

    Examples:
      | Mobile_no  | Email_id             | Password | Pin code | GST             | PAN        | Seller_Name |
      | 8888888888 | 111shivraj@gmail.com | Test123    | 400078   | 27AAZFA3739M1ZM | AKBPV3933P |Auto Seller  |







