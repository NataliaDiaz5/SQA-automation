#Author: erika.diaz@sqasa.com
@tag
Feature: New Register

  Scenario Outline: Create a New Register
    Given I want to register a new user in NewTours HomePage
    When I create a new register
      | firstName   | lastName   | phone   | email   | address   | city   | state   | postalCode   | userName   | password   | confirmPassword   |
      | <FirstName> | <LastName> | <Phone> | <Email> | <Address> | <City> | <State> | <PostalCode> | <UserName> | <Password> | <ConfirmPassword> |
    
    Then I validate a text saying "SIGN-OFF"

    Examples: 
      | FirstName | LastName | Phone       | Email                    | Address             | City         | State     | PostalCode | UserName | Password | ConfirmPassword |
      | Sebastian | Bastos   | 13112222222 | sebas.tian@algoritmo.com | 1007 Mountain Drive | Buenos Aires | Argentina |      10919 | Tian     | Tian$02  | Tian$02         |
