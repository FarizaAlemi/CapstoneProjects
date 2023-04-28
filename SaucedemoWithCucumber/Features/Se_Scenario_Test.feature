Feature: Second scenario test

Scenario: Second scenario 

Given go to the Landing page 
When Enter the usrname locked_out_user
And Enter password secret_sauce
And Click on the loging button
And Verify the Error message Epic sadface Sorry this user has been locked out
Then close browser 