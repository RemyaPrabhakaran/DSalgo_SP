Feature: Graph Page

  Scenario: Graph Page Validation
    Given The user is on the datastructure homepage after sign in
    When The user clicks Get Started button below Graph
    Then The user should be navigated to Graph page

  Scenario Outline: Pages in Graph Page Validation
    Given The user is in the Graph page after logged in
    When The user clicks <pagelink> link
    Then The user should be directed to <pagelink> Page

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |

  Scenario Outline: Try Here Page Navigation
    Given The user is in the <pagelink> Page
    When The user clicks Try Here button in <pagelink> page
    Then The user should be directed to Graph Try Editor Page

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |

  Scenario Outline: Try Here Page with Valid Python Code
    Given The user is in the <pagelink> try Editor Page
    When The User writes Valid python code and clicks Run button in Graph
    Then User is able to see the output in console in Graph Try Editor Page

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |

  Scenario Outline: Try Here with Invalid Python Code
    Given The user is in the <pagelink> try Editor Page
    When The User writes invalid python code and clicks Run button in Graph
    Then User is able to see the error msg in pop up window in Graph Try Editor Page
    Then The user click the ok button in the alert window in Graph Try Editor Page
    Then The user is on the same page having Editor and Run button in Graph Try Editor Page

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |

  Scenario Outline: Verify Practice Questions Page in all links
    Given The user is in the <pagelink> Page
    When The user clicks Practice Questions in <pagelink> Page
    Then The user should be directed to Practice Questions page of Graph

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |
