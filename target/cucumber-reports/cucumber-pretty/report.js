$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.features");
formatter.feature({
  "line": 1,
  "name": "feature name",
  "description": "",
  "id": "feature-name",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Authenication",
  "description": "",
  "id": "feature-name;authenication",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open Application and Enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter username",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "verify Msg",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});