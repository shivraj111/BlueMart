$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BluMart.feature");
formatter.feature({
  "name": "Buyer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of registration and unregistration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_1"
    }
  ]
});
formatter.step({
  "name": "Registration of \"Buyer\" app using \u003cMobile_no\u003e , \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Login \"Buyer\" app with \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select product for \u003cPin\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Unregistration of \"Buyer\" using \u003cMobile_no\u003e on \"Admin\" app",
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
        "Username",
        "Password",
        "Pin"
      ]
    },
    {
      "cells": [
        "8898347897",
        "111shivraj@gmail.com",
        "Test1",
        "400078"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of registration and unregistration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Registration of \"Buyer\" app using 8898347897 , 111shivraj@gmail.com and Test1",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.registration_of_app_using(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login \"Buyer\" app with 111shivraj@gmail.com and Test1",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.login_application_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select product for 400078",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.select_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Unregistration of \"Buyer\" using 8898347897 on \"Admin\" app",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.unregistration_of_using_on_app(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});