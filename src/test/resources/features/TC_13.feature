@TC13
  Feature: Automation Exercise
    Scenario: TC13 Verify Product quantity in Cart
      Given Navigate to url
      Then Verify that home page is visible successfully
      When  Click 'View Product' for any product on home page
      Then Verify product detail is opened
      When Increase quantity to 4
      And Click 'Add to cart' button
      And Click 'View Cart' button
      Then Verify that product is displayed in cart page with exact quantity
