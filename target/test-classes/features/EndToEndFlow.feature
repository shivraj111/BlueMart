Feature: Manufacturer , Brand and product Creation

  @Test_4
  Scenario Outline: End to End Flow
    Given Login as "Admin"
    And Create "Manufacturer", "Brand" and "Product" using "variant"
    And Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>
    When Seller fetch product
    Then product should be in "Pending" state
    And Seller create "Route" with "Pincode"





    Examples:
      | Mobile_no  | Email_id             | Password | GST             | Seller_Name |
      | 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller |










