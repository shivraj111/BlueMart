$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EndToEndFlow.feature");
formatter.feature({
  "name": "Manufacturer , Brand and product Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "End to End Flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_4"
    }
  ]
});
formatter.step({
  "name": "Login as \"Admin\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Create \"Manufacturer\", \"Brand\" and \"Product\" using \"variant\"",
  "keyword": "And "
});
formatter.step({
  "name": "Registration of \"Seller\" using \u003cMobile_no\u003e , \u003cGST\u003e , \u003cSeller_Name\u003e , \u003cEmail_id\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Seller fetch product",
  "keyword": "When "
});
formatter.step({
  "name": "product should be in \"Pending\" state",
  "keyword": "Then "
});
formatter.step({
  "name": "Seller create \"Route\" with \"Pincode\"",
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
  "name": "End to End Flow",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login as \"Admin\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Create \"Manufacturer\", \"Brand\" and \"Product\" using \"variant\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Registration of \"Seller\" using 8888888888 , 27AAZFA3739M1ZM , Auto Seller , 8888888888@gmail.com and Test123",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Seller fetch product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "product should be in \"Pending\" state",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Seller create \"Route\" with \"Pincode\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});