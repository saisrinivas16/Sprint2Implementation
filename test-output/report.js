$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:yourlogo/yourlogo.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Signup with valid details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsofDef.user_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the URL \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepsofDef.user_navigates_to_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters EmailAddress as \"saisrinivas123@gmail.com\" and Password as \"Srinu123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.user_Enters_EmailAddress_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.click_on_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Women Menu",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.click_on_Women_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add an item to wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.add_an_item_to_wishlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on your profile",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.click_on_your_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on my wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.click_on_my_wishlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Remove an item from wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "StepsofDef.remove_an_item_from_wishlist()"
});
formatter.result({
  "status": "passed"
});
});