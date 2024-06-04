@TC03
  Feature: Automation Exercise
    Scenario: TC03 Login User with incorrect email and password
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Signup  Login' button
      Then Verify 'Login to your account' is visible
      When Enter incorrect email address and password
      And Click 'login' button
      Then Verify error 'Your email or password is incorrect!' is visible
