$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BluMart.feature");
formatter.feature({
  "name": "Buyer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of login functionality through Mobile NO",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_1"
    }
  ]
});
formatter.step({
  "name": "Login \"Buyer\" app with \u003cMobile_no\u003e",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Mobile_no"
      ]
    },
    {
      "cells": [
        "8898347897"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of login functionality through Mobile NO",
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
  "name": "Login \"Buyer\" app with 8898347897",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.login_application_with_shivraj_gmail_com_and_ShivAnsh(String,String,String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [^Login \"([^\"]*)\" app with (.*)$] is defined with 3 parameters at \u0027stepDefinitions.LoginSteps.login_application_with_shivraj_gmail_com_and_ShivAnsh(String,String,String) in file:/C:/Users/Om%20Computers/IdeaProjects/Sample/target/test-classes/\u0027.\nHowever, the gherkin step has 2 arguments:\n * Buyer\n * 8898347897\nStep text: Login \"Buyer\" app with 8898347897\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});