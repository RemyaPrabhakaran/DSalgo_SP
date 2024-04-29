Feature: DataStructure 
Scenario: DataStructure Homepage Validation
Given The user is on the datastructure homepage
When  The user clicks Get Started button below the Data structures-Introduction
Then  The user should land in Data Structures- Introduction Page page

Scenario: Data Structure Home page
Given  The user is on the Data Structure Introduction Page
When  The user clicks Time Complexity link
Then The user should be redirected to Time Complexity  page