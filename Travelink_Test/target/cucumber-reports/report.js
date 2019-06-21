$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/accommodationBooking.feature");
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
  "name": "Create Accommodation",
  "description": "",
  "id": "create-accommodation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10626099300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Create Accommodation Booking",
  "description": "",
  "id": "create-accommodation;create-accommodation-booking",
  "type": "scenario",
  "keyword": "Scenario"
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
  "name": "user enters the outfit details",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user creates a accommodation search",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user adds the accommodation to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_homePage()"
});
formatter.result({
  "duration": 2023845700,
  "status": "passed"
});
formatter.match({
  "location": "NewQuote.user_Clicks_on_Create_new()"
});
formatter.result({
  "duration": 4324535400,
  "status": "passed"
});
formatter.match({
  "location": "OutfitDetail.user_Clicks_on_Create_new_quote()"
});
formatter.result({
  "duration": 10624055000,
  "status": "passed"
});
formatter.match({
  "location": "AccommodationSearch.user_creates_a_accommodation_search()"
});
formatter.result({
  "duration": 10120538900,
  "status": "passed"
});
formatter.match({
  "location": "ViewBasket.user_adds_the_accommodation_to_the_basket()"
});
formatter.result({
  "duration": 7252047500,
  "status": "passed"
});
});