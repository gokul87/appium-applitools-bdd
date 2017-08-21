$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "Wordpress test",
  "description": "In order check my posts\r\nAs a User\r\nI need a page to view my posts",
  "id": "wordpress-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26573301375,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Created brand selectable for a product",
  "description": "",
  "id": "wordpress-test;created-brand-selectable-for-a-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the wordpress app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see my wordpress account page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the \"pages\" section",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see my posts",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_am_on_the_wordpress_app()"
});
formatter.result({
  "duration": 6859168205,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_should_see_my_wordpress_account_page()"
});
formatter.result({
  "duration": 88195310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pages",
      "offset": 19
    }
  ],
  "location": "StepDefs.i_navigate_to_the_section(String)"
});
formatter.result({
  "duration": 1018378959,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_should_see_my_posts()"
});
formatter.result({
  "duration": 9167741673,
  "status": "passed"
});
formatter.after({
  "duration": 1075475265,
  "status": "passed"
});
});