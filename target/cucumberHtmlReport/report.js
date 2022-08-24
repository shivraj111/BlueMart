$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Seller.feature");
formatter.feature({
  "name": "Seller functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of Seller registration using registered mobile no",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_2"
    }
  ]
});
formatter.step({
  "name": "Registration of \"Seller\" using \u003cMobile_no\u003e , \u003cGST\u003e , \u003cSeller_Name\u003e , \u003cEmail_id\u003e and \u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "name": "Another Seller trying to register with already registered \u0027\u003cMobile_no\u003e\u0027 using \u0027\u003cSeller_Name\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "Seller should get \u003cerror_msg\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Unregistration of \"Seller\" through DataBase using \u003cMobile_no\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Mobile_no",
        "Email_id",
        "Password",
        "GST",
        "Seller_Name",
        "error_msg"
      ]
    },
    {
      "cells": [
        "8888888888",
        "8888888888@gmail.com",
        "Test123",
        "27AAZFA3739M1ZM",
        "Auto Seller",
        "Mobile already exist"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of Seller registration using registered mobile no",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Registration of \"Seller\" using 8888888888 , 27AAZFA3739M1ZM , Auto Seller , 8888888888@gmail.com and Test123",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.registration_of_app_using_GST_PAN_Seller_Name_Email_id_and_Test(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from App",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.reset_the_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Another Seller trying to register with already registered \u00278888888888\u0027 using \u0027Auto Seller\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "SellerSteps.another_Seller_trying_to_register_with_already_Seller(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller should get Mobile already exist",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSteps.seller_should_get_Mobile_already_exist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Unregistration of \"Seller\" through DataBase using 8888888888",
  "keyword": "And "
});
formatter.match({
  "location": "SellerSteps.unregistration_of_through_DataBase_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verification of Seller registration using registered GST",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_2"
    }
  ]
});
formatter.step({
  "name": "Registration of \"Seller\" using \u003cMobile_no\u003e , \u003cGST\u003e , \u003cSeller_Name\u003e , \u003cEmail_id\u003e and \u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "name": "Another Seller trying to register with already registered \u0027\u003cGST\u003e\u0027 using different \u0027\u003cnew_Mobile_no\u003e\u0027 , \u0027\u003cnew_Email_id\u003e\u0027 , \u0027\u003cPassword\u003e\u0027 and \u0027\u003cSeller_Name\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "Seller should get \u003cerror_msg\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Unregistration of \"Seller\" through DataBase using \u003cMobile_no\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Mobile_no",
        "Email_id",
        "Password",
        "GST",
        "Seller_Name",
        "error_msg",
        "new_Mobile_no",
        "new_Email_id"
      ]
    },
    {
      "cells": [
        "8888888888",
        "8888888888@gmail.com",
        "Test123",
        "27AAZFA3739M1ZM",
        "Auto Seller",
        "GST number already exist!",
        "9988888888",
        "9988888888@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of Seller registration using registered GST",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Registration of \"Seller\" using 8888888888 , 27AAZFA3739M1ZM , Auto Seller , 8888888888@gmail.com and Test123",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.registration_of_app_using_GST_PAN_Seller_Name_Email_id_and_Test(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from App",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.reset_the_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Another Seller trying to register with already registered \u002727AAZFA3739M1ZM\u0027 using different \u00279988888888\u0027 , \u00279988888888@gmail.com\u0027 , \u0027Test123\u0027 and \u0027Auto Seller\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "SellerSteps.another_Seller_trying_to_register_with_already_using_Auto_Seller(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller should get GST number already exist!",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSteps.seller_should_get_Mobile_already_exist(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Unregistration of \"Seller\" through DataBase using 8888888888",
  "keyword": "And "
});
formatter.match({
  "location": "SellerSteps.unregistration_of_through_DataBase_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});