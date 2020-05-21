#Author: erika.diaz@sqasa.com
@tag
Feature: Log In

  @tag1
  Scenario: I'm in NewTours HomePage
    Given I want to write NewTours HomePage
    When I write my credentials
      | user    | password  |
      | Batman05 | Batman05* |
      

Then I valida a text saying "SIGN-OFF"

   