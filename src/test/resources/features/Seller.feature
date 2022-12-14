@Seller
Feature: Seller functionality

  Background: Seller registration
    Given Registration of "Seller" using '8888888888' , "27AAZFA3739M1ZM" , "Auto Seller" , "8888888888@gmail.com" and "Test123"
    And Logout from App


  #Scenario Outline: Verification of registration and Unregistration functionality
    #Given test
      #Given Registration of "Seller" using '<Mobile_no>' , '<GST>' , '<Seller_Name>' , '<Email_id>' and '<Password>'
    #And Unregistration of "Seller" through DataBase using <Mobile_no>


    #Examples:
     # | Mobile_no  | Email_id             | Password | GST             | Seller_Name |
      #| 8888888888 | 8888888888@gmail.com | Test123  | 27AAZFA3739M1ZM | Auto Seller |

  @Test_2
  Scenario Outline: Verification of Seller registration using registered mobile no , Email id and GST
    When Seller trying to register with already registered '<Mobile_no>' using '<Seller_Name>'
    Then Seller should get <mobile_error_msg>
    When Seller trying to register with already registered '<Email_id>' using different '<new_Mobile_no>' and '<Seller_Name>'
    Then Seller should get <email_error_msg>
    When Seller trying to register with already registered '<GST>' using different '<new_Mobile_no>' , '<new_Email_id>' , '<Password>' and '<Seller_Name>'
    Then Seller should get <GST_error_msg>

    Examples:
      | Mobile_no  | Email_id             | new_Mobile_no | GST             | Seller_Name | mobile_error_msg     | Password | new_Email_id         | email_error_msg     | GST_error_msg             |
      | 8888888888 | 8888888888@gmail.com | 9888888888    | 27AAZFA3739M1ZM | Auto Seller | Mobile already exist | Test123  | 9988888888@gmail.com | Email already exist | GST number already exist! |












