Feature: Student course enroll
  
  Scenario Outline: Student course enroll with valid details
    Given User is in upskhill login screen
    When  user logs into application with <username> and <password>
    And Student clicks and search course <course>
    And user gets instructor names and course amounts for verification
    When user enrolls to the course by giving payment details
    Then user validates success messages with course name "Cricket" after enrolling to the course
    
    Examples:
    |username                          | password    |course|
    |vinaykumarap.16is@saividya.ac.in  | Vinay76765@ |Cricket|
    

    
      
