Feature: Manufacturer , Brand and product Creation

  @Test_3
  Scenario Outline: End to End Flow
    Given Login as "Admin"
    And Create "Manufacturer" and "Brand"
    Given Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>



    Examples:
      | Mobile_no  | Email_id             | Password | GST             | Seller_Name |
      | 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller |










