package CucumberDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Stu_course_enroll;
import VinayKumar.TestComponents.Base_Test;
import io.cucumber.java.en.*;

public class Student_course_enroll {
	WebDriver driver;
	Base_Test base =new Base_Test();
			
	
	@Given("User is in upskhill login screen")
	public void user_is_in_upskhill_login_screen() {
//		driver = base.GetDriver();
		Abstract_Component abs = new Abstract_Component(driver);
		abs.goTo_User();
	}

	@Given("^user logs into application with (.*) and (.*)$")
	public void user_logs_into_application_with_username_and_password(String username, String password)  {
		Abstract_Component abs = new Abstract_Component(driver);
	    abs.login_user(username, password);
	    
	}
	
	
	@And("^Student clicks and search course (.*)$")
	public void student_clicks_and_search_course(String course) throws InterruptedException {
	  
		Stu_course_enroll enr = new Stu_course_enroll(driver);
		enr.go_course_cat_search(course);
		String course_text = enr.verify_course();
		Assert.assertEquals(course_text, course);
		
	}
	
	@Then("user gets instructor names and course amounts for verification")
	public void user_gets_instructor_names_and_course_amounts_for_verification() throws InterruptedException  {
	    
		Stu_course_enroll enr = new Stu_course_enroll(driver);
		String[] amt1 = enr.verify_instructor();
		String[] amt2 = enr.verify_course_amount();
		Assert.assertEquals(amt1, amt2);
		enr.enroll_course();
		Thread.sleep(4000);
		
	}
	
	@When("user enrolls to the course by giving payment details")
	public void user_enrolls_to_the_course_by_giving_payment_details() throws Exception {
	    
		Abstract_Component abs = new Abstract_Component(driver);
		abs.Card_pay("4242424242424242", "0131", 789);
	}
	
	@Then("user validates success messages with course name {string} after enrolling to the course")
	public void user_validates_success_messages_with_course_name_upskhill_test_after_enrolling_to_the_course(String course) {
		Stu_course_enroll enr = new Stu_course_enroll(driver);
		enr.verify_success_message(course);
	}

}
