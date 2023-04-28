Feature: First scenario test

Scenario: Buy two items at the first scenario 

Given go to Landing page 
When Enter the usrname standard_user
And Enter the password secret_sauce
And Click on loging button
And Add the first two items to the cart
And Click on the cart icon at the top right coner 
And Click on checkout button 
And Enter your first name in the First Name textbox
And Enter your last name in the Last Name textbox
And Entern postel code in Postel Code textbox
And Click on continue button 
And Click on finished button on the next page 
And Verify the success message Your order has been dispatched, and will arrive just as fast as the pony can get there
Then close the browser 