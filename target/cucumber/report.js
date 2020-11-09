$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Background.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Background color Functionality",
  "description": "",
  "id": "validate-background-color-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7171530000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 699510700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to set Background",
  "description": "",
  "id": "validate-background-color-functionality;user-should-be-able-to-set-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_click_on_the_button()"
});
formatter.result({
  "duration": 201793100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 40600,
  "status": "passed"
});
});