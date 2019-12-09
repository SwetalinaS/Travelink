$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/manualFerryPage.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Create Manual Ferry Crossing",
  "description": "",
  "id": "create-manual-ferry-crossing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Create Manual Ferry Crossing",
  "description": "",
  "id": "create-manual-ferry-crossing;create-manual-ferry-crossing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "user enters the homePage",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Clicks on Create new",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "enter the number of \u003cadults\u003e and number of \u003cchildren\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user saves the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user creates a manual ferry",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user adds the manual ferry basket",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user confirms the booking",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "create-manual-ferry-crossing;create-manual-ferry-crossing;",
  "rows": [
    {
      "cells": [
        "adults",
        "children"
      ],
      "line": 33,
      "id": "create-manual-ferry-crossing;create-manual-ferry-crossing;;1"
    },
    {
      "cells": [
        "1",
        "0"
      ],
      "line": 34,
      "id": "create-manual-ferry-crossing;create-manual-ferry-crossing;;2"
    },
    {
      "cells": [
        "2",
        "1"
      ],
      "line": 35,
      "id": "create-manual-ferry-crossing;create-manual-ferry-crossing;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 20298934600,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Create Manual Ferry Crossing",
  "description": "",
  "id": "create-manual-ferry-crossing;create-manual-ferry-crossing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "user enters the homePage",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Clicks on Create new",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "enter the number of 1 and number of 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user saves the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user creates a manual ferry",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user adds the manual ferry basket",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user confirms the booking",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_homePage()"
});
formatter.result({
  "duration": 2244205200,
  "status": "passed"
});
formatter.match({
  "location": "NewQuote.user_Clicks_on_Create_new()"
});
formatter.result({
  "duration": 167212500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "0",
      "offset": 36
    }
  ],
  "location": "NewQuote.enter_the_number_of_and_number_of(int,int)"
});
formatter.result({
  "duration": 1229004000,
  "status": "passed"
});
formatter.match({
  "location": "OutfitDetail.user_Clicks_on_Create_new_quote()"
});
formatter.result({
  "duration": 7515175800,
  "status": "passed"
});
formatter.match({
  "location": "OutfitDetail.user_saves_the_outfit_details()"
});
formatter.result({
  "duration": 156861000,
  "status": "passed"
});
formatter.match({
  "location": "ManualFerry.user_creates_a_manual_ferry()"
});
formatter.result({
  "duration": 8039403700,
  "status": "passed"
});
formatter.match({
  "location": "ManualFerry.user_adds_the_manual_ferry_basket()"
});
formatter.result({
  "duration": 8823151000,
  "status": "passed"
});
formatter.match({
  "location": "NewBooking.user_confirms_the_booking()"
});
formatter.result({
  "duration": 20047929000,
  "status": "passed"
});
formatter.after({
  "duration": 4021184800,
  "status": "passed"
});
formatter.before({
  "duration": 16780375800,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Create Manual Ferry Crossing",
  "description": "",
  "id": "create-manual-ferry-crossing;create-manual-ferry-crossing;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "user enters the homePage",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Clicks on Create new",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "enter the number of 2 and number of 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user saves the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user creates a manual ferry",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user adds the manual ferry basket",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user confirms the booking",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_homePage()"
});
formatter.result({
  "duration": 2317900000,
  "status": "passed"
});
formatter.match({
  "location": "NewQuote.user_Clicks_on_Create_new()"
});
formatter.result({
  "duration": 219620100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    },
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "NewQuote.enter_the_number_of_and_number_of(int,int)"
});
formatter.result({
  "duration": 1849034500,
  "status": "passed"
});
formatter.match({
  "location": "OutfitDetail.user_Clicks_on_Create_new_quote()"
});
formatter.result({
  "duration": 7325996200,
  "status": "passed"
});
formatter.match({
  "location": "OutfitDetail.user_saves_the_outfit_details()"
});
formatter.result({
  "duration": 150563600,
  "status": "passed"
});
formatter.match({
  "location": "ManualFerry.user_creates_a_manual_ferry()"
});
formatter.result({
  "duration": 8049900100,
  "status": "passed"
});
formatter.match({
  "location": "ManualFerry.user_adds_the_manual_ferry_basket()"
});
formatter.result({
  "duration": 8841729800,
  "status": "passed"
});
formatter.match({
  "location": "NewBooking.user_confirms_the_booking()"
});
formatter.result({
  "duration": 19531308700,
  "status": "passed"
});
formatter.after({
  "duration": 3964771800,
  "status": "passed"
});
});                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            formatter.after({
  "duration": 62675143300,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d78.0.3904.108)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CANADAPC-02\u0027, ip: \u002710.12.10.27\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\SWETAL~1.SAH\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:63546}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 6dba7e67e900b1c761d79e0fde04342c\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Logout\u0027)]}\r\n\tat sun.reflect.GeneratedConstructorAccessor17.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.toString(Unknown Source)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.toString(ExpectedConditions.java:305)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:268)\r\n\tat com.qa.pages.OutfitDetailPage.waitForVisibility(OutfitDetailPage.java:60)\r\n\tat com.qa.pages.LoginPage.logout(LoginPage.java:45)\r\n\tat com.qa.stepDefinations.LoginSteps.tearDown(LoginSteps.java:45)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
