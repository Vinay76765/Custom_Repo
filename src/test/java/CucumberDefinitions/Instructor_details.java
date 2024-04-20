package CucumberDefinitions;

import org.openqa.selenium.WebDriver;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Instructor_Details;
import VinayKumar.TestComponents.Base_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Instructor_details {
	
	
	
	WebDriver driver;
	Instructor_Details ins_details;
	Base_Test base=new Base_Test();

	
	
	@Given("Go to user application and login with {string} and {string}")
	public void go_to_user_application_and_login_with_and(String username, String password) {
//		driver=base.GetDriver();
		Abstract_Component abs=new Abstract_Component(driver);
	    abs.goTo_User();
	    abs.login_user(username, password);
	}
	
	@Given("Navigate to settings page by verifying the text")
	public void navigate_to_settings_page_by_verifying_the_text() throws InterruptedException {
		
		ins_details = new Instructor_Details(driver);
		ins_details.details();
	    
	}
	
	@Given("Enter DOB of instructor with {int}, {int}, {int}")
	public void enter_dob_of_instructor_with(Integer date, Integer month, Integer year) {
	//	Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.DOB(date, month, year);
	}
	
	@Given("Enter Biography {string} details of instructor")
	public void enter_biography_details_of_instructor(String biography) {
	    // Write code here that turns the phrase above into concrete actions
	//	Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Biography(biography);
	}
	
	@Given("Enter Professional_headline {string} of a instructor")
	public void enter_professional_headline_of_a_instructor(String headline) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Professional_headline(headline);
		
	}
	
	@Given("Enter and save Phone {string} number Current {string} and Permanant {string} address of instructor")
	public void enter_and_save_phone_number_current_and_permanant_address_of_instructor(String phone, String current, String permanant) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Phone_number(phone);
		ins_details.Current_Address(current);
		ins_details.Permanent_Address(permanant);
	}
	
	@Given("Click on Education tab and enter college {string} and type {string} of instructor")
	public void click_on_education_tab_and_enter_college_and_type_of_instructor(String college, String type) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.click_Edu_add();
		ins_details.Edu_coll_type(college, type);
	}
	
	@Given("Enter title {string} and status {string} of instructor")
	public void enter_title_and_status_of_instructor(String title, String status) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Edu_title_status(title, status);
		
	}

	@Given("Enter Instructor education start date in {int}, {int} and {int}")
	public void enter_instructor_education_start_date_in_and(Integer int1, Integer int2, Integer int3) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Edu_start_date(14, 8, 2016);
		
	}
	
	@Given("Enter Instructor education end date in {int}, {int} and {int}")
	public void enter_instructor_education_end_date_in_and(Integer int1, Integer int2, Integer int3) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Edu_End_Date(14, 8, 2020);
		
	}
	
	@When("Enter final grade {string} of instructor in his education.")
	public void enter_final_grade_of_instructor_in_his_education(String grade) {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.Final_grade(grade);
	}
	
	@Then("upload a certificate {string} and save education details.")
	public void upload_a_certificate_and_save_education_details(String path) throws InterruptedException {
//		Instructor_Details ins_details = new Instructor_Details(driver);
		ins_details.upload_certificate(path);
		
	}

}
