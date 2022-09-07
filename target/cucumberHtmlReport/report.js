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
  "name": "Create new \"\u003cProduct\u003e\" using \"\u003cCategory\u003e\" , \"\u003cBrand\u003e\"",
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
        "Category",
        "Manufacturer",
        "Brand",
        "Product"
      ]
    },
    {
      "cells": [
        "8888888888",
        "8888888888@gmail.com",
        "Test123",
        "27AAZFA3739M1ZM",
        "Juices \u0026 Drinks",
        "Shivraj_Manufacturer",
        "Shiv_Brand",
        "Apple Juice"
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
  "name": "Create new \"Apple Juice\" using \"Juices \u0026 Drinks\" , \"Shiv_Brand\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.create_product(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});