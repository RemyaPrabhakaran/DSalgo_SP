Feature: Array page

  Scenario: Launch Array
    Given The user is on the Array homepage
    When The user clicks Get Started button below the Array
    Then The user should land in Array- Introduction Page

  Scenario: Arrays in Python page
    Given The user is on the Array Introduction Page
    When The user clicks Arrays in Python
    Then The user clicks on Try here button below Arrays in Python
    And The User writes Valid python code and clicks Run button in array in python try editor page
    Then User is able to see the output in console in array python try editor page
    When The User writes invalid python code and clicks Run button in arrays in python page
    Then User is able to see the error msg in pop up window in arrays in python Try Editor Page
    And The user click the ok button in the alert window in arrays in python Try Editor Page
    And The user should be redirected to Arrays page

  Scenario: Arrays Using List
    Given The user is on the Arrays page
    When The user clicks on Arrays Using List
    Then The user clicks on Try here button below Arrays Using list
    And The User writes Valid python code and clicks Run button in arrays using list try editor page1
    Then User is able to see the output in console in arrays using list try editor page1
    When The User writes invalid python code and clicks Run button in arrays using list page1
    Then User is able to see the error msg in pop up window in arrays using list Try Editor Page1
    And The user click the ok button in the alert window in arrays using list Try Editor Page1
    Then The user should be redirected to main Arrays page

  Scenario: Basic Operations in Lists
    Given The user click on the Basic Operations in Lists page
    When The user clicks Try Here button of Operations in Lists
    And The User writes Valid python code and clicks Run button in arrays using list try editor page
    Then User is able to see the output in console in arrays using list try editor page
    When The User writes invalid python code and clicks Run button in arrays using list page
    Then User is able to see the error msg in pop up window in arrays using list Try Editor Page
    And The user click the ok button in the alert window in arrays using list Try Editor Page
    Then The user should be redirected to a main page

  Scenario: Applications of Array
    Given The user is on the Applications of Array page
    When The user clicks Try Here button of Application of Array page
    Then The user is on the Python Editor Page
    And The User writes Valid python code and clicks Run button
    Then User is able to see the output in console
    When The User writes invalid python code and clicks Run button in Apllication of array page
    Then User is able to see the error msg in pop up window in array Try Editor Page
    And The user click the ok button in the alert window in array Try Editor Page

  Scenario: Practice Questions
    Given The user is on the Application of Array page
    When The user clicks on Practice Questions of Application of Array page
    Then user should be directed to Practice Questions page
    And click on Serch the Array page
