Feature: Seller functionality

  @Test_3
  Scenario Outline: Verification of registration functionality
    #Given Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>
    And Unregistration of "Seller" through DataBase using <Mobile_no>


    Examples:
      | Mobile_no  | Email_id             | Password | GST             | Seller_Name |
      | 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller |


  @Test_2
  Scenario Outline: Verification of Seller registration using registered mobile no

    Given Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>
    And Logout from App
    When Another Seller trying to register with already registered '<Mobile_no>' using '<Seller_Name>'
    Then Seller should get <error_msg>
    And Unregistration of "Seller" through DataBase using <Mobile_no>

    Examples:
      | Mobile_no  | Email_id             | Password | GST             | Seller_Name | error_msg            |
      | 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller | Mobile already exist |

#Issue in app with below scenario
  #@Test_2
  #Scenario Outline: Verification of Seller registration using registered email id
    #Given Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>
    #And Logout from App
    #When Another Seller trying to register with already registered <Email_id> using different <new_Mobile_no> and <Seller_Name>
    #Then Seller should get <error_msg>

    #Examples:
     # | Mobile_no  | Email_id             | Password | GST             | Seller_Name | error_msg             | new_Mobile_no |
      #| 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller | Mobile already exist! | 9888888888    |

  @Test_2
  Scenario Outline: Verification of Seller registration using registered GST
    Given Registration of "Seller" using <Mobile_no> , <GST> , <Seller_Name> , <Email_id> and <Password>
    And Logout from App
    When Another Seller trying to register with already registered '<GST>' using different '<new_Mobile_no>' , '<new_Email_id>' , '<Password>' and '<Seller_Name>'
    Then Seller should get <error_msg>
    And Unregistration of "Seller" through DataBase using <Mobile_no>


    Examples:
      | Mobile_no  | Email_id             | Password | GST             | Seller_Name | error_msg                 | new_Mobile_no | new_Email_id         |
      | 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller | GST number already exist! | 9988888888    | 9988888888@gmail.com |










