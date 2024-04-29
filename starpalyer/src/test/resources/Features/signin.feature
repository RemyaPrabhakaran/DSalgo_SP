
Feature: DsAlgo Sign In page


Scenario: signin page validation
Given  The user is on Introduction page
When  User clicks sign in button
When User login by entering username and password
Then Verifies user is logged in 

Scenario: Signin page validation with wrong credentials 
Given The user is navigated to Introduction page
When User clicks on signin button 
When user login with wrong username and correct password 
Then verifies validation message for wrong credentials 


Scenario: Signin page validation with valid username  
Given The user landed to  Introduction page
When User clicks the signin button
When  User login with valid username and wrong password 
Then verify validation message for wrong password 

Scenario: Signin page validation with invalid username and invalid  password
Given  The user landed to Introductio page 
When User click on the signin button 
When user login with invalid username and password 
Then  verify validation message 

Scenario: Signin page validation with entering only Password 
Given The user  on Introduction page 
When  User clicking the signin button 
When user login with blank username  and password 
Then verify the  validation message 

Scenario: Signin page validation with blank password 
Given The user is checking the introduction page 
When   The user click signin button
When User login with valid username and empty password 
Then verifying the validation message 


Scenario: Signin page validation with username and password field blank 
Given User click the Introduction page 
When User is on Sign in screen and click signin button 
When User logged with out entering username and password 
Then Verify the validation Popup 



