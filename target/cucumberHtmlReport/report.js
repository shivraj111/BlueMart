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
  "name": "Create \"\u003cBrand\u003e\" using \"\u003cManufacturer\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Delete \"\u003cBrand\u003e\"",
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
        ""
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
  "name": "Create \"Shivraj_Manufacturer\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.create_and_using(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create \"Shiv_Brand\" using \"Shivraj_Manufacturer\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.create(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete \"Shiv_Brand\"",
  "keyword": "And "
});
formatter.match({
  "location": "AdminSteps.Delete(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"#\" class\u003d\"btn btn-soft-danger btn-icon btn-circle btn-sm confirm-delete\" data-href\u003d\"http://dev.blumart.in/admin/brands/destroy/877\" title\u003d\"Delete\"\u003e...\u003c/a\u003e is not clickable at point (1038, 344). Other element would receive the click: \u003cinput type\u003d\"text\" placeholder\u003d\"Name\" name\u003d\"name\" class\u003d\"form-control\" required\u003d\"\"\u003e\n  (Session info: chrome\u003d105.0.5195.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-CFKECBE\u0027, ip: \u0027192.168.1.29\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.102, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\OMCOMP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57360}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: eca69ae53db9bcb7c7d1c77f11e4b924\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat stepDefinitions.AdminSteps.Delete(AdminSteps.java:147)\r\n\tat ✽.Delete \"Shiv_Brand\"(file:src/test/resources/features/EndToEndFlow.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});