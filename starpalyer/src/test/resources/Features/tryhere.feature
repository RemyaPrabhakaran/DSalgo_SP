Feature: Python editor 
Scenario: Running valid code in Python editor
Given User clicks the try here button
When The user write the valid code and click on Run button
Then The user should able to see output in the console

Scenario: Running python editor without code 
Given User clicking the try here button 
When  The user clicks the runbutton without entering the code 
Then Nothing happens to the page and no error message is displayed

Scenario: Running python editor with invalid code
Given User clicks on the try here button
When User clicks the runbutton with invalid code 
Then The user should able to see an error message  alert window

Scenario: Practice Question link 
Given The user is on the TimeComplexity Page
When The user clicks the practise questionlink
Then  The user doesn't find any practice problems and page is blank