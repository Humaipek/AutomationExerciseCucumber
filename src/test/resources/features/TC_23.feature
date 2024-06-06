   @TC22
  Feature: Automation Exercise
    Scenario: TC22   Add to cart from Recommended items
      Given Navigate to url
      When Scroll to bottom of page
      Then Verify 'RECOMMENDED ITEMS' are visible
      When Click on 'Add To Cart' on Recommended product
      And Click 'View Cart' button
      Then Verify that product is displayed in cart page
