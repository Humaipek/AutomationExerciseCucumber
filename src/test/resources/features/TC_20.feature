@TC20
  Feature: Automation Exercise
    Scenario: TC20  Search Products and Verify Cart After Login
      Given Navigate to url
      When Click on 'Products' button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      When Enter product name in search input and click search button
      Then Verify 'SEARCHED PRODUCTS' is visible
      Then Verify all the products related to search are visible
      When Add those products to cart
      And Click 'Cart' button and verify that products are visible in cart
      And Click 'Signup  Login' button and submit login details
      And Again, go to Cart page
      Then Verify that those products are visible in cart after login as well
