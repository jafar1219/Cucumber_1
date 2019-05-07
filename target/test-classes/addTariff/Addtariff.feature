
Feature: To test the addTariff functionality

 Scenario: To verify the Tariff plans generated
   Given The user is in add tariff page
    When User fills in the details
    |rental1|local_minutes|inter_minutes|sms_pack|minutes_charges|inter_charges|sms_charges|
    |111111|222222|33333|44444|55555|6666|7777|
    |99999|88888|777777|66666|55555|444444|3333|
    |11111|7777|8888|55555|66666|77777|222222|
    And Click submit
    Then See the generated customer id