Feature:

Scenario:
Given go landing page
When Enter your user name problem_user
And Enter your password secret_sauce
And click loging button 
And Add the 1st product to the cart
And Click on the cart icon the top right coner
And Click checkout button
And Enter his first name in the First Name textbox
And Enter  his last name in the Last Name textbox
And Entern his postel code in Postel Code textbox
And Click continue button then
And Verify the error message Error: Last Name is required 
Then closed browser