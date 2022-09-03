Feature: Login to the Leaftabs Application 

@Smoke
Scenario: positive login 
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed 

@Sanity
Scenario: negative login 
Given Type the username as 'DemoSales'
And Type the password as 'crmsfa'
When Click on the Login button
But Verify the Error Message is displayed 