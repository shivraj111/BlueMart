$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Seller.feature");
formatter.feature({
  "name": "Seller functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of registration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_3"
    }
  ]
});
formatter.step({
  "name": "Registration of \"Seller\" using \u003cMobile_no\u003e , \u003cGST\u003e , \u003cSeller_Name\u003e , \u003cEmail_id\u003e and \u003cPassword\u003e",
  "keyword": "Given "
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
        "Seller_Name"
      ]
    },
    {
      "cells": [
        "8888888888",
        "8888888888@gmail.com",
        "Test123",
        "27AAZFA3739M1ZM",
        "Auto Seller"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of registration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_3"
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
formatter.after({
  "status": "passed"
});
});