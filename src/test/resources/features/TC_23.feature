   @TC23
  Feature: Automation Exercise
    Scenario: TC23   Verify address details in checkout page
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Signup  Login' button
      And Fill all details in Signup and create account
      Then Verify 'ACCOUNT CREATED!' and click 'Continue' button
      Then Verify ' Logged in as username' at top
      When Add products to cart
      And Click 'Cart' button
      Then Verify that cart page is displayed
      When Click Proceed To Checkout
      Then Verify that the delivery address is same address filled at the time registration of account
      Then Verify that the billing address is same address filled at the time registration of account
      When Click 'Delete Account' button
      Then Verify 'ACCOUNT DELETED!' and click 'Continue' button
