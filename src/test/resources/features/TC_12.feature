@TC12
  Feature: Automation Exercise
    Scenario: TC12 Add Products in Cart
      Given Navigate to url
      Then Verify that home page is visible successfully
      When  Click on 'Products' button
      And Hover over first product and click 'Add to cart'
      And Click 'Continue Shopping' button
      And Hover over second product and click 'Add to cart'
      And Click 'View Cart' button
      Then Verify both products are added to Cart
      Then Verify their prices, quantity and total price
