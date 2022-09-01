Feature: Manufacturer , Brand and product Creation

  @Registration
  Scenario: End to End Flow
    #Given Registration of "Seller" using '8888888888' , "27AAZFA3739M1ZM" , "Auto Seller" , "8888888888@gmail.com" and "Test123"
    #And Logout from App
    And Unregistration of "Seller" through DataBase using <Mobile_no>


  @E2E
  Scenario Outline: End to End Flow
    Given Login as "Admin"
    And Create "<Manufacturer>"
    And Delete "<Manufacturer>"
    #And Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>
    #When Seller fetch product
    #Then product should be in "Pending" state
    #And Seller create "Route" with "Pincode"


    Examples:
      | Mobile_no  | Email_id             | Password | GST             | Seller_Name | Manufacturer |
      | 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller | Shivraj      |










