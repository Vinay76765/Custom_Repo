package CucumberDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Instructor_create_course;
import VinayKumar.TestComponents.Base_Test;
import io.cucumber.java.en.*;

public class Ins_create_course {
	
	WebDriver driver;
	
	Base_Test base=new Base_Test();
	Instructor_create_course ins_course = new Instructor_create_course(driver);
	
	@Given("go to user")
	public void go_to_user() {
	  
		//driver=base.GetDriver();
		Abstract_Component abs=new Abstract_Component(driver);
		abs.goTo_User();
		
	}
	
	
	@When("^login to user application with valid username (.+) and password (.+)$")
	public void login_to_user_application_with_valid_username_username_and_password_password(String username, String password) {
		Abstract_Component abs=new Abstract_Component(driver);
		abs.login_user(username, password);
		
	}
	
	@When("^Enter working title of instructor (.+)$")
	public void enter_working_title_of_instructor_title(String title) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.working_title(title);
	}

	@When("^Enter Intended learners page with outcomes (.+), (.+), (.+) and (.+)$")
	public void enter_intended_learners_page_with_outcomes_outcome1_outcome2_and_outcome3(String outcome1, String outcome2, String outcome3, String outcome4) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		
		ins_course.learners_outcome(outcome1, outcome2, outcome3, outcome4);
		
		
		
	}

	@When("Select requirements needed for learners")
	public void select_requirements_needed_for_learners()  {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.requirements();
		
	}

	
	@When("Select any one of the learner level {int}")
	public void select_any_one_of_the_learner_level(Integer int1) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.bie_level(int1);
		
	}
	
	@When("Skip course structure, setup video and edit film screens")
	public void skip_course_structure_setup_video_and_edit_film_screens()  {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.course_structure();
		ins_course.setup_video();
		ins_course.film_edit();
		
	}
	

	@When("Add module one with marks {int} ,module marks {int} , Description {string} and  module name {string}")
	public void add_module_one_with_marks_module_marks_description_and_module_name(Integer total_marks, Integer mod_marks, String module_name, String desc){
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.course_marks(total_marks);
		ins_course.create_module_1(module_name,desc,mod_marks);
//		Assert.assertEquals(mod_marks,ins_course.marks_1[1]);
//		Assert.assertEquals(total_marks, ins_course.balance_marks_start1[1]);
		
	}
	
	
	@When("Add lesson contents1 with lesson name {string}, lesson description {string} and save it")
	public void add_lesson_contents1_with_lesson_name_lesson_description_and_save_it(String less_name, String less_desc) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.add_contents_mod1();
		ins_course.module_contents(less_name, less_desc);
	}


	@When("Add video with video title {string} and video path {string}")
	public void add_video_with_video_title_and_video_path(String string, String string2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents1();
		ins_course.upload_video("Video one", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Upskhill Mp4\\video.mp4");
	}
	

	@When("Add audio with audio title {string} and audio path {string}")
	public void add_audio_with_audio_title_and_audio_path(String string, String string2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents1();
		ins_course.upload_audio("Audio one", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Upskhill Mp3\\Audio_one.mp3");
	}
	

	@When("Add article with article title {string}, article description {string} and with article path\"article_path\"")
	public void add_article_with_article_title_article_description_and_with_article_path_article_path(String string, String string2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents1();
		ins_course.upload_article("Article one", "Article one", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Article.pdf");
	}
	
	
	@When("Add Quiz with quiz title {string}, quiz description {string}, quiz marks {int} and Duration of quiz timings {int}")
	public void add_quiz_with_quiz_title_quiz_description_quiz_marks_and_duration_of_quiz_timings(String string, String string2, Integer int1, Integer int2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.add_contents_mod1();
		ins_course.add_quiz("Quiz one", "Quiz one", 50, 15);
	}
	

	@When("Add Quiz question one1 with question {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_one1_with_question_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException 
	{
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_add_qsn1();
		ins_course.add_quiz_questions("Question one", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 0);
	
	}
	
	@When("Add Quiz question two1 with question {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_two1_with_question_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	 
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_add_qsn1();
		ins_course.add_quiz_questions("Question two", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 1);
	}

	@When("Add Quiz question three1 with question {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_three1_with_question_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_add_qsn1();
		ins_course.add_quiz_questions("Question three", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 2);
		
	}

	@When("Add Quiz question four1 with question {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_four1_with_question_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_add_qsn1();
		ins_course.add_quiz_questions("Question four", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 3);
		
	}
	
	@When("Add Assignment with assignment title {string}, assignment description {string}, assignment marks {int} and assignment time {int}")
	public void add_assignment_with_assignment_title_assignment_description_assignment_marks_and_assignment_time(String string, String string2, Integer int1, Integer int2) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.add_contents_mod1();
		ins_course.add_assignment("Assignment one", "Assignment one", "50", "15");
	}

	@When("Add Assignment instructions {string} and instructions file {string}")
	public void add_assignment_instructions_and_instructions_file(String string, String string2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.setup_assignment1();
		ins_course.add_assignment_instructions("Assignment instructions", "C:\\Users\\Vinay\\\\Desktop\\UPSKHILL\\Article.pdf");

	}

	@When("Add Assignment questions with assignment questions {int}, and questions, wordcount {string}, {int}, {string}, {int}, {string}, {int}, {string}, {int}")
	public void add_assignment_questions_with_assignment_questions_and_questions_wordcount(Integer int1, String string, Integer int2, String string2, Integer int3, String string3, Integer int4, String string4, Integer int5) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		
		ins_course.add_assignment_questions(4, "Question one", 10, "Question two", 20, "Question three", 30, "Question four", 40);

	}
	
	@When("Add module two with title {string}, Description {string}, marks {int}")
	public void add_module_two_with_title_description_marks(String module_name, String desc, Integer mod_marks) throws InterruptedException {
	   Instructor_create_course ins_course = new Instructor_create_course(driver);
	   ins_course.create_module_1(module_name, desc, mod_marks);
	   Thread.sleep(5000);
	}
	
	@When("Add lesson contents2 with lesson name {string}, lesson description {string} and save it")
	public void add_lesson_contents2_with_lesson_name_lesson_description_and_save_it(String string, String string2) throws InterruptedException {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_add_lesson_span2();
		ins_course.module_contents("Lesson_two", "Lesson_two");
	}
	
	@When("Add video two with video title {string} and video path {string}")
	public void add_video_two_with_video_title_and_video_path(String string, String string2) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents2();
		ins_course.upload_video("Video two", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Upskhill Mp4\\video.mp4");
	}
	
	@When("Add audio two with audio title {string} and audio path {string}")
	public void add_audio_two_with_audio_title_and_audio_path(String string, String string2) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents2();
		ins_course.upload_audio("Audio two", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Upskhill Mp3\\Audio_one.mp3");
	
	}

	
	@When("Add article two with article title {string}, article description {string} and with article path\"article_path\"")
	public void add_article_two_with_article_title_article_description_and_with_article_path_article_path(String string, String string2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents2();
		ins_course.upload_article("Article two", "Article two", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Article.pdf");
	}

	@When("Add Quiz two with quiz title {string}, quiz description {string}, quiz_marks {int} and duration of quiz timings {int}")
	public void add_quiz_two_with_quiz_title_quiz_description_quiz_marks_and_duration_of_quiz_timings(String string, String string2, Integer int1, Integer int2) throws InterruptedException {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_add_lesson_span2();
		ins_course.add_quiz("Quiz two", "Quiz two", 50, 15);
		
	}

	@When("Add Quiz question one2 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_one2_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn2();
		ins_course.add_quiz_questions("Question one", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 0);
		
	}

	@When("Add Quiz question two2 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_two2_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn2();
		ins_course.add_quiz_questions("Question two", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 1);
	}

	@When("Add Quiz question three2 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_three2_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	  
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn2();
		ins_course.add_quiz_questions("Question three", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 2);
		
	}

	@When("Add Quiz question four2 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void adds_quiz_question_four2_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn2();
		ins_course.add_quiz_questions("Question four", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 3);
	}

	@When("Add Assignment two with assignment title {string}, assignment description {string}, assignment marks {int} and assignment time {int}")
	public void add_assignment_two_with_assignment_title_assignment_description_assignment_marks_and_assignment_time(String string, String string2, Integer int1, Integer int2) throws InterruptedException {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_add_lesson_span2();
		ins_course.add_assignment("Assignment two", "Assignment two", "50", "15");
	}
	
	@When("Add Assignment two instructions {string} and instructions file {string}")
	public void add_assignment_two_instructions_and_instructions_file(String string, String string2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.setup_assignment2();
		ins_course.add_assignment_instructions("Assignment instructions", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Article.pdf");
		
	}

	@When("Add Assignment two questions with assignment two questions {int}, and questions, wordcount {string}, {int}, {string}, {int}, {string}, {int}, {string}, {int}")
	public void add_assignment_questions_with_assignment_two_questions_and_questions_wordcount(Integer int1, String string, Integer int2, String string2, Integer int3, String string3, Integer int4, String string4, Integer int5) throws InterruptedException {
	  
		Instructor_create_course ins_course = new Instructor_create_course(driver);
//		ins_course.setup_assignment2();
//		ins_course.add_assignment_instructions("Assignment instructions", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Article.pdf");
		ins_course.add_assignment_questions(4, "Question one", 10, "Question two", 20, "Question three", 30, "Question four", 40);
		
	}
	
	@When("Add Module three with title {string}, Description {string}, marks {int}")
	public void add_module_three_with_title_description_marks(String module_name, String desc, Integer mod_marks) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.create_module_1(module_name, desc, mod_marks);
		Thread.sleep(2000);
	}
	
	
	@When("Add lesson contents3 with lesson name {string}, lesson description {string} and save it")
	public void add_lesson_contents3_with_lesson_name_lesson_description_and_save_it(String string, String string2) {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_add_lesson_span3();
		ins_course.module_contents("Lesson_three", "Lesson_three");
	}
	
	
	
	@When("Add video three with video title {string} and video path {string}")
	public void add_video_three_with_video_title_and_video_path(String string, String string2) {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents3();
		ins_course.upload_video("Video three", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Upskhill Mp4\\video.mp4");
	}
	
	
	@When("Add audio three with audio title {string} and audio path {string}")
	public void add_audio_three_with_audio_title_and_audio_path(String string, String string2) {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents3();
		ins_course.upload_audio("Audio three", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Upskhill Mp3\\Audio_one.mp3");
	}
	
	@When("Add article three with article title {string}, article description {string} and with {string}")
	public void add_article_three_with_article_title_article_description_and_with(String string, String string2, String string3) throws InterruptedException {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_contents3();
		ins_course.upload_article("Article three", "Article three", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Article.pdf");
	}
	
	
	@When("Add Quiz three with quiz title {string}, quiz description {string}, quiz_marks {int} and duration of quiz timings {int}")
	public void add_quiz_three_with_quiz_title_quiz_description_quiz_marks_and_duration_of_quiz_timings(String string, String string2, Integer int1, Integer int2) throws InterruptedException {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_add_lesson_span3();
		ins_course.add_quiz("Quiz three", "Quiz three", 50, 15);
	}
	
	
	@When("Add Quiz question one3 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_one3_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn3();
		ins_course.add_quiz_questions("Question one", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 0);
		
	}
	
	
	@When("Add Quiz question two3 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_two3_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
	  
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn3();
		ins_course.add_quiz_questions("Question two", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 1);
	}
	
	
	@When("Add Quiz question three3 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_three3_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn3();
		ins_course.add_quiz_questions("Question three", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 2);
	}
	
	
	@When("Add Quiz question four3 with {string}, options, reasons {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and select correct answer {int}")
	public void add_quiz_question_four3_with_options_reasons_and_select_correct_answer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Integer int1) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_quiz_ques_btn3();
		ins_course.add_quiz_questions("Question four", "option_one", "reason_one", "option_two", "reason_one", "option_three", "reason_three", "option_four", "reason_four", 3);
	}
	
	
	@When("Add Assignment three with assignment title {string}, assignment description {string}, assignment marks {int} and assignment time {int}")
	public void add_assignment_three_with_assignment_title_assignment_description_assignment_marks_and_assignment_time(String string, String string2, Integer int1, Integer int2) {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.click_add_lesson_span3();
		ins_course.add_assignment("Assignment three", "Assignment three", "50", "15");
	}
	
	
	@When("Add Assignment three instructions {string} and instructions file {string}")
	public void add_assignment_three_instructions_and_instructions_file(String string, String string2) throws InterruptedException {
	    
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.setup_assignment3();
		ins_course.add_assignment_instructions("Assignment instructions", "C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Article.pdf");
		
	}
	
	
	@When("Add Assignment three questions with assignment two questions {int}, and questions, wordcount {string}, {int}, {string}, {int}, {string}, {int}, {string}, {int}")
	public void add_assignment_three_questions_with_assignment_two_questions_and_questions_wordcount(Integer int1, String string, Integer int2, String string2, Integer int3, String string3, Integer int4, String string4, Integer int5) throws InterruptedException {
	   
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.add_assignment_questions(4, "Question one", 10, "Question two", 20, "Question three", 30, "Question four", 40);
		Thread.sleep(2000);
		
	}
	
	@Given("User in course landing page")
	public void user_in_course_landing_page() {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.curr_continue();
	}
	
	@Then("Adds course title {string}, course subtitle {string} and description {string}")
	public void adds_course_title_course_subtitle_and_description(String crse_title, String crse_subtitle, String crse_desc) {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.course_details1(crse_title, crse_subtitle, crse_desc);
	}
	
	@Then("Adds Basic info which includes language {string}, course type {string}, Difficulty level {string}, Category {string}, sub category1 {string} and sub category2 {string}")
	public void adds_basic_info_which_includes_language_course_type_difficulty_level_category_sub_category1_and_sub_category2(String language, String crse_type, String diff_level, String category, String sub_cat1, String sub_cat2) throws InterruptedException {
		Instructor_create_course ins_course = new Instructor_create_course(driver);
		ins_course.basic_info(language, crse_type, diff_level, category, sub_cat1, sub_cat2);
		ins_course.upload_crs_video();
		
	}


	









}
