@Ins_details
Feature: Instructor_details
  
  
  Scenario Outline: Entering Instructor details after registration
    Given Go to user application and login with "vinaykumarap.16is@saividya.ac.in" and "Vinay76765@"
    And Navigate to settings page by verifying the text
    And Enter DOB of instructor with 14, 8, 1998
    And Enter Biography "Worked as a instructor in shephard university" details of instructor
    And Enter Professional_headline "QA Automation instructor" of a instructor
    And Enter and save Phone "phone" number Current "Yelahanka Bengaluru" and Permanant "Yelahanka Bengaluru" address of instructor
    And Click on Education tab and enter college "AB" and type "Bachelors Degree" of instructor
    And Enter title "B.E" and status "Completed" of instructor
    And Enter Instructor education start date in 14, 8 and 2016
    And Enter Instructor education end date in 14, 8 and 2020
    When Enter final grade "A+" of instructor in his education.
    Then upload a certificate "C:\Users\Vinay\Desktop\UPSKHILL\Article.pdf" and save education details.
	
