$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/resources/featurefile/homepage.feature");
formatter.feature({
  "name": "Octopus Investments",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search people and verify the result",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.step({
  "name": "user click on the search bar",
  "keyword": "When "
});
formatter.step({
  "name": "user enter \"\u003cname\u003e\" in search field",
  "keyword": "And "
});
formatter.step({
  "name": "user should able to see name \"\u003cname\u003e\" at result",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "Alistair Seabright"
      ]
    },
    {
      "cells": [
        "Charles Street"
      ]
    },
    {
      "cells": [
        "Charlotte Fairhurst"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search people and verify the result",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnTheSearchBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Alistair Seabright\" in search field",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEnterInSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see name \"Alistair Seabright\" at result",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldAbleToObserveCorrectPerson(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search people and verify the result",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnTheSearchBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Charles Street\" in search field",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEnterInSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see name \"Charles Street\" at result",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldAbleToObserveCorrectPerson(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search people and verify the result",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnTheSearchBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Charlotte Fairhurst\" in search field",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEnterInSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see name \"Charlotte Fairhurst\" at result",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldAbleToObserveCorrectPerson(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify profile of person after clink on his image",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.step({
  "name": "user click on the person image\"\u003cimage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should able to see the profile of \"\u003cimage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "image"
      ]
    },
    {
      "cells": [
        "Alistair Seabright"
      ]
    },
    {
      "cells": [
        "Charles Street"
      ]
    },
    {
      "cells": [
        "Charlotte Fairhurst"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify profile of person after clink on his image",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the person image\"Alistair Seabright\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnThePersonImage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see the profile of \"Alistair Seabright\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldAbleToSeeTheProfileOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify profile of person after clink on his image",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the person image\"Charles Street\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnThePersonImage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see the profile of \"Charles Street\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldAbleToSeeTheProfileOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify profile of person after clink on his image",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the person image\"Charlotte Fairhurst\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnThePersonImage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see the profile of \"Charlotte Fairhurst\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldAbleToSeeTheProfileOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify and sort by Z-A",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on sort by Z to A",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnSortByZToA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shoule see the list in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouleSeeTheListInDescendingOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on sort by A to Z",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnSortByAToZ()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the list in ascending order",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldSeeTheListInAscendingOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});