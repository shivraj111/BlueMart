$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BluMart.feature");
formatter.feature({
  "name": "Buyer login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of buying functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "name": "Login with \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Select product",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "111shivraj@gmail.com",
        "ShivAnsh@22111995"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of buying functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login with 111shivraj@gmail.com and ShivAnsh@22111995",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enter_UserName_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select product",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.select_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});