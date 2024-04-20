Feature: Course Creation

  Background: Login to user with credentials
    Given go to user
    When login to user application with valid username vinaykumarap.16is@saividya.ac.in and password Vinay76765@

  Scenario Outline: Create a course by entering all details
    And Enter working title of instructor <title>
    And Enter Intended learners page with outcomes <outcome1>, <outcome2> , <outcome3> and <outcome4>
    And Select requirements needed for learners
    And Select any one of the learner level <level>
    And Skip course structure, setup video and edit film screens
    
    #Adding module one with contents, quiz and assignment
    And Add module one with marks <total_marks> ,module marks <mod_marks> , Description "Module one" and  module name "Module one"
    And Add lesson contents1 with lesson name "lesson_one", lesson description "lesson_one" and save it
    And Add video with video title "video_title" and video path "Video_path"
    And Add audio with audio title "audio_title" and audio path "audio_path"
    And Add article with article title "article_title", article description "article_desc" and with article path"article_path"
    And Add Quiz with quiz title "quiz_title", quiz description "quiz_desc", quiz marks 50 and Duration of quiz timings 15
    And Add Quiz question one1 with question "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option three", "reason_three", "option_four", "reason_four" and select correct answer 0
    And Add Quiz question two1 with question "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option three", "reason_three", "option_four", "reason_four" and select correct answer 1
    And Add Quiz question three1 with question "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option three", "reason_three", "option_four", "reason_four" and select correct answer 2
    And Add Quiz question four1 with question "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option three", "reason_three", "option_four", "reason_four" and select correct answer 3
    And Add Assignment with assignment title "Assignment one", assignment description "Assignment one", assignment marks 50 and assignment time 15
    And Add Assignment instructions "instructions" and instructions file "C:\Users\admin\Desktop\Upskhill\contents\Article1.pdf"
    And Add Assignment questions with assignment questions 4, and questions, wordcount "Question one", 10, "Question two", 20, "Question three", 30, "Question four", 40
    
    #Adding module two with contents, quiz and assignment
    And Add module two with title "Module two", Description "Module two", marks 34
    And Add lesson contents2 with lesson name "lesson_two", lesson description "lesson_two" and save it
    And Add video two with video title "video_two" and video path "video_path_two"
    And Add audio two with audio title "audio_two" and audio path "audio_path_two"
    And Add article two with article title "article_title", article description "article_desc" and with article path"article_path"
    And Add Quiz two with quiz title "quiz_title", quiz description "quiz_desc", quiz_marks 50 and duration of quiz timings 15
    And Add Quiz question one2 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 0
    And Add Quiz question two2 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 1
    And Add Quiz question three2 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 2
    And Add Quiz question four2 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 3
    And Add Assignment two with assignment title "Assignment two", assignment description "Assignment two", assignment marks 50 and assignment time 15
    And Add Assignment two instructions "instructions" and instructions file "C:\Users\admin\Desktop\Upskhill\contents\Article1.pdf"
    And Add Assignment two questions with assignment two questions 4, and questions, wordcount "Question one", 10, "Question two", 20, "Question three", 30, "Question four", 40
    
    #Adding module three with contents, quiz and assignment
    And Add Module three with title "Module three", Description "Module three", marks 32
    And Add lesson contents3 with lesson name "lesson_three", lesson description "lesson_three" and save it
    And Add video three with video title "video_three" and video path "video_path_three"
    And Add audio three with audio title "audio_three" and audio path "audio_path_three"
    And Add article three with article title "article_title", article description "article_desc" and with "article_path"
    And Add Quiz three with quiz title "quiz_title", quiz description "quiz_description", quiz_marks 50 and duration of quiz timings 15
    And Add Quiz question one3 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 0
    And Add Quiz question two3 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 1
    And Add Quiz question three3 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 2
    And Add Quiz question four3 with "Question", options, reasons "option_one", "reason_one", "option_two", "reason_two", "option_three", "reason_three", "option_four", "reason_four" and select correct answer 3
    And Add Assignment three with assignment title "Assignment two", assignment description "Assignment two", assignment marks 50 and assignment time 15
    And Add Assignment three instructions "instructions" and instructions file "C:\Users\admin\Desktop\Upskhill\contents\Article1.pdf"
    And Add Assignment three questions with assignment two questions 4, and questions, wordcount "Question one", 10, "Question two", 20, "Question three", 30, "Question four", 40
    
    #Course landing page details
    Given User in course landing page
    Then Adds course title "Automation course", course subtitle "Automation course for beginners" and description "Have a Passion of learning Selenium but have no coding knowledge ? I will fulfill your wish with my easy teaching and life time query support  through QA Forum , Skype and Teamviewer"
    And Adds Basic info which includes language "English", course type "Corporate Course", Difficulty level "Beginner level", Category "Computer Science", sub category1 "Software Development" and sub category2 "Web Development"
    
    

    Examples: 
      | outcome1 | outcome2 | outcome3 | outcome4 | level | title                    | total_marks | name         | mod_marks | module_name | desc         | less_name  | less_desc  |
      | success  | good     | better   | great    |     0 | Automation test engineer |         100 | First module |        34 | Module one  | First module | Lesson one | Lesson one |
