$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/addTariff/Addtariff.feature");
formatter.feature({
  "name": "To test the addTariff functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the Tariff plans generated",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user is in add tariff page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefine.the_user_is_in_add_tariff_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills in the details",
  "rows": [
    {
      "cells": [
        "rental1",
        "local_minutes",
        "inter_minutes",
        "sms_pack",
        "minutes_charges",
        "inter_charges",
        "sms_charges"
      ]
    },
    {
      "cells": [
        "111111",
        "222222",
        "33333",
        "44444",
        "55555",
        "6666",
        "7777"
      ]
    },
    {
      "cells": [
        "99999",
        "88888",
        "777777",
        "66666",
        "55555",
        "444444",
        "3333"
      ]
    },
    {
      "cells": [
        "11111",
        "7777",
        "8888",
        "55555",
        "66666",
        "77777",
        "222222"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefine.user_fills_in_the_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click submit",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.click_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "See the generated customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.see_the_generated_customer_id()"
});
formatter.result({
  "status": "passed"
});
});