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
  "name": "Create \"\u003cManufacturer\u003e\", \"Brand\" and \"Product\" using \"variant\"",
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
  "name": "Create \"Shivraj\", \"Brand\" and \"Product\" using \"variant\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.create_and_using(String,String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003dShivraj]\"}\n  (Session info: chrome\u003d104.0.5112.102)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-CFKECBE\u0027, ip: \u0027192.168.1.29\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.102, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\OMCOMP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51882}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b249d202ab276d21cb81e8268fdc0921\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003dShivraj]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinitions.AdminSteps.create_and_using(AdminSteps.java:67)\r\n\tat ✽.Create \"Shivraj\", \"Brand\" and \"Product\" using \"variant\"(file:src/test/resources/features/EndToEndFlow.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});