
#Feature: Queue Page

  #Scenario: Queue Page Validation
   # Given The user is on the datastructure homepage after sign in
   # When The user clicks Get Started button below Queue
   # Then The user should be navigated to Queue page

  #Scenario Outline: Pages in Queue Page Validation
  #  Given The user is in the Queue page after logged in
  # When The user clicks <pagelink> link
  #  Then The user should be directed to <pagelink> Page

   # Examples: 
    #  | pagelink                               |
     # | Implementation of Queue in Python      |
    #  | Implementation using collections.deque |
    #  | Implementation using array             |
     # | Queue Operations                       |

  #Scenario Outline: Try Here Page Navigation
   # Given The user is in the <pagelink> Page
   # When The user clicks Try Here button in <pagelink> page
   # Then The user should be directed to Queue Try Editor Page

   # Examples: 
   #   | pagelink                               |
   #   | Implementation of Queue in Python      |
     # | Implementation using collections.deque |
     # | Implementation using array             |
     # | Queue Operations                       |

  #Scenario Outline: Try Here Page with Valid Python Code
  #  Given The user is in the <pagelink> try Editor Page
   # When The User writes Valid python code and clicks Run button in Queue
   # Then User is able to see the output in console in Queue Try Editor Page

    #Examples: 
     # | pagelink                               |
     # | Implementation of Queue in Python      |
      #| Implementation using collections.deque |
     # | Implementation using array             |
      #| Queue Operations                       |
      
   #Scenario Outline: Try Here with Invalid Python Code
   # Given The user is in the <pagelink> try Editor Page
   # When The User writes invalid python code and clicks Run button in Queue
    #Then User is able to see the error msg in pop up window in Queue Try Editor Page
    #Then The user click the ok button in the alert window in Queue Try Editor Page
    #Then The user is on the same page having Editor and Run button in Queue Try Editor Page

   # Examples: 
     # | pagelink                               |
     # | Implementation of Queue in Python      |
     # | Implementation using collections.deque |
     # | Implementation using array             |
     # | Queue Operations                       |
      
  # Scenario Outline: Verify Practice Questions Page in all links
   # Given The user is in the <pagelink> Page
   # When The user clicks Practice Questions in <pagelink> Page
   # Then The user should be directed to Practice Questions page of Queue

   # Examples: 
     # | pagelink                               |
     # | Implementation of Queue in Python      |
      #| Implementation using collections.deque |
     # | Implementation using array             |
     # | Queue Operations                       |
      
  
  