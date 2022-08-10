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
      "name": "@Test_2"
    }
  ]
});
formatter.step({
  "name": "Registration of \"Seller\" app using \u003cMobile_no\u003e,\u003cGST\u003e,\u003cPAN\u003e,\u003cSeller_Name\u003e,\u003cEmail_id\u003e and \u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Login \"Buyer\" app with \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Buyer buying product of \u003cPin code\u003e for \"First\" time",
  "keyword": "And "
});
formatter.step({
  "name": "Login \"Buyer\" app with \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Buyer buying product of \u003cPin code\u003e for \"Second\" time",
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
        "Pin code"
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
  "name": "Verification of registration functionality",
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
  "name": "Registration of \"Seller\" app using 8898347897,\u003cGST\u003e,\u003cPAN\u003e,\u003cSeller_Name\u003e,\u003cEmail_id\u003e and Test1",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Login \"Buyer\" app with 111shivraj@gmail.com and Test1",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.login_application_with(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Buyer buying product of 400078 for \"First\" time",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.select_product(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login \"Buyer\" app with 111shivraj@gmail.com and Test1",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.login_application_with(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Buyer buying product of 400078 for \"Second\" time",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.select_product(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});