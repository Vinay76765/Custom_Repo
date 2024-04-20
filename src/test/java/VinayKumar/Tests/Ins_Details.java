package VinayKumar.Tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import VinayKumar.Pageobjects.Login_Ins;
import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Instructor_Details;
import VinayKumar.TestComponents.Base_Test;

public class Ins_Details {
	
	WebDriver driver;
	
	@Test
	public void Entering_Details() throws InterruptedException, AWTException {
		Abstract_Component abs = new Abstract_Component(driver);
		Instructor_Details ins_details = new Instructor_Details(driver);
		Login_Ins loginins = new Login_Ins(driver);
		abs.goTo_User();
		ins_details.login("Patel@gmail.com", "Patel76765@");
		ins_details.details();
		ins_details.DOB(14, 8, 1998);
		Thread.sleep(2000);
		ins_details.Biography("Worked as a instructor in shephard university");
		ins_details.Professional_headline("QA Automation instructor");
		ins_details.Add_Interests("Reading Book");
		ins_details.Phone_number("8585859858");
		ins_details.Current_Address("Bagaluru Bengaluru");
		ins_details.Permanent_Address("Bagaluru Bengaluru");
//		ins_details.file_upload("C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Round-Shape-PNG.png");
		
		//Entering education details of instructor
		
		ins_details.click_Edu_add();
		ins_details.Edu_coll_type("RLJIT", "B.E");
		ins_details.Edu_title_status("Information Science", "Completed");
		ins_details.Edu_start_date(14, 8, 2016);
		ins_details.Edu_End_Date(14, 8, 2020);
		ins_details.Final_grade("A+");
		ins_details.upload_certificate("C:\\Users\\Vinay\\Desktop\\UPSKHILL\\Guidelines for quiz.pdf");
		Thread.sleep(5000);
	
	}

}
