@tag
Feature: Register to DemoWebshop site
 
  @tag1
  Scenario: Register to DemoWebshop site
    Given I navigate to "https://demowebshop.tricentis.com/"
    When I click on Register Link
    And I select gender
    And I enter FirstName "Shub"
    And I enter LastName "J"
    And I enter email "Shubh1435@gmail.com"
    Then I enter password "Test@12"
    And  I enter confirmPass "Test@12"
    And I click on Register button
    Then validate the "Your registration completed" message

  