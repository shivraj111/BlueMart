$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Seller.feature");
formatter.feature({
  "name": "Seller functionality",
  "description": "",
  "keyword": "Feature"
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
  "name": "Another Seller trying to register with already registered \u003cGST\u003e using different \u003cnew_Mobile_no\u003e , \u003cnew_Email_id\u003e , \u003cPassword\u003e and \u003cSeller_Name\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Seller should get \u003cerror_msg\u003e",
  "keyword": "Then "
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
  "name": "Another Seller trying to register with already registered 27AAZFA3739M1ZM using different 9988888888 , 9988888888@gmail.com , Test123 and Auto Seller",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runner.AmbiguousStepDefinitionsException: \"Another Seller trying to register with already registered 27AAZFA3739M1ZM using different 9988888888 , 9988888888@gmail.com , Test123 and Auto Seller\" matches more than one step definition:\n  \"^Another Seller trying to register with already registered (.*) using (.*)$\" in SellerSteps.another_Seller_trying_to_register_with_already_registered_using_Auto_Seller(String,String)\n  \"^Another Seller trying to register with already registered (.*) using different (.*) , (.*) , (.*) and (.*)$\" in SellerSteps.another_Seller_trying_to_register_with_already_registered_using_Auto_Seller(String,String,String,String,String)\n  \"^Another Seller trying to register with already registered (.*) using different (.*) and (.*)$\" in SellerSteps.another_Seller_trying_to_register_with_already_registered_using_Auto_Seller(String,String,String)\n\r\n\tat cucumber.runner.Glue.stepDefinitionMatch(Glue.java:92)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:48)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "Seller should get GST number already exist!",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSteps.seller_should_get_Mobile_already_exist(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});