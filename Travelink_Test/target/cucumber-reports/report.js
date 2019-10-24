$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/ferryCrossingBooking.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: swetalina.sahoo@inspiretec.com"
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
  "line": 20,
  "name": "Create Ferry Crossing",
  "description": "",
  "id": "create-ferry-crossing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18049177000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Create Single Ferry Crossing",
  "description": "",
  "id": "create-ferry-crossing;create-single-ferry-crossing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user enters the homePage",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Clicks on Create new",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user creates a ferry search",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user adds the ferry to the basket",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user confirms the booking",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_homePage()"
});
formatter.result({
  "duration": 2717734600,
  "status": "passed"
});
formatter.match({
  "location": "NewQuote.user_Clicks_on_Create_new()"
});
formatter.result({
  "duration": 1259095599,
  "status": "passed"
});
formatter.match({
  "location": "OutfitDetail.user_Clicks_on_Create_new_quote()"
});
formatter.result({
  "duration": 5291046701,
  "status": "passed"
});
formatter.match({
  "location": "FerrySearch.user_creates_a_ferry_search()"
});
formatter.result({
  "duration": 12788189500,
  "status": "passed"
});
formatter.match({
  "location": "ViewBasket.user_adds_the_ferry_to_the_basket()"
});
formatter.result({
  "duration": 210218600,
  "status": "passed"
});
formatter.match({
  "location": "NewBooking.user_confirms_the_booking()"
});
formatter.result({
  "duration": 15107763000,
  "status": "passed"
});
formatter.after({
  "duration": 4093326000,
  "status": "passed"
});
});