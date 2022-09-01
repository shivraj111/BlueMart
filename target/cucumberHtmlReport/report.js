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
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "Login as \"Admin\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Create \"\u003cManufacturer\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Delete \"\u003cManufacturer\u003e\"",
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
        "Manufacturer"
      ]
    },
    {
      "cells": [
        "8888888888",
        "8888888888@gmail.com",
        "Test123",
        "27AAZFA3739M1ZM",
        "Auto Seller",
        "Shivraj"
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
      "name": "@E2E"
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
formatter.match({
  "location": "AdminSteps.login_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create \"Shivraj\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.create_and_using(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete \"Shivraj\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.Delete(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});