Feature: Stack

  Scenario: Stack Page Validation
    Given The user is on the datastructure homepage after sign in
    When The user clicks Get Started button below Stack
    Then The user should be navigated to Stack page

  Scenario Outline: Pages in Stack Page Validation
    Given The user is in the Stack page after logged in
    When The user clicks <pagelink> link
    Then The user should be directed to <pagelink> Page

    Examples: 
      | pagelink            |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: Try Here Page Navigation
    Given The user is in the <pagelink> Page
    When The user clicks Try Here button in <pagelink> page
    Then The user should be directed to Editor Page

    Examples: 
      | pagelink            |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: Try Here Page with Valid Python Code
    Given The user is in the <pagelink> try Editor Page
    When The User writes Valid python code and clicks Run button
    Then User is able to see the output in console

    Examples: 
      | pagelink            |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: Try Here with Invalid Python Code
    Given The user is in the <pagelink> try Editor Page
    When The User writes invalid python code and clicks Run button
    Then User is able to see the error msg in pop up window
    Then The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

    Examples: 
      | pagelink            |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: Verify Practice Questions Page in all links
    Given The user is in the <pagelink> Page
    When The user clicks Practice Questions in <pagelink> Page
    Then The user should be directed to Practice Questions page

    Examples: 
      | pagelink            |
      | Operations in Stack |
      | Implementation      |
      | Applications        |
