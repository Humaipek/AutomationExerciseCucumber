@TC08
  Feature: Automation Exercise
    Scenario: TC08 Verify All Products and product detail page
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Products' button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      When The products list is visible
      And Click on 'View Product' of first product
      And User is landed to product detail page
      Then Verify that detail detail is visible: product name, category, price, availability, condition, brand
