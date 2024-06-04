@TC05
  Feature: Automation Exercise
    Scenario: TC05 Register User with existing email
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Signup  Login' button
      Then Verify 'New User Signup!' is visible
      When Enter name and already registered email address
      And Click 'Signup' button
      Then Verify error 'Email Address already exist!' is visible
