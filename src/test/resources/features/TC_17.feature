@TC17
  Feature: Automation Exercise
    Scenario: TC17 Remove Products From Cart
      Given Navigate to url
      Then Verify that home page is visible successfully
      When  Add products to cart
      And Click 'Cart' button
      Then Verify that cart page is displayed
      When Click 'X' button corresponding to particular product
      Then Verify that product is removed from the cart
