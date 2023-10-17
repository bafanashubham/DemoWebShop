Feature: login to DemowebShop

  @tag2
  Scenario: login to DemowebShop
    Given user navigate to "https://demowebshop.tricentis.com/"
    When user click on login link
    And user enter email id "Shubh1435@gmail.com"
    And user enter password "Test@12"
    And user click on Login button
    Then user should be successfully login
    When user click on Electronics link
    Then user click on Cell phone image
    And user click on add to cart
    Then user varify the success message after adding
