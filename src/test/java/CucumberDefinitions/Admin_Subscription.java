package CucumberDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Admin_subscriptionFee_approve;
import VinayKumar.TestComponents.Base_Test;
import VinayKumar.Tests.Admin_subscription;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_Subscription {
	
	WebDriver driver;
	Base_Test base=new Base_Test();
	

	@Given("goto admin")
	public void goto_admin() {
//		driver=base.GetDriver();
		Abstract_Component abs=new Abstract_Component(driver);
	    abs.goTo_admin();
		
	}
	@When("login to admin")
	public void login_to_admin() {
		Abstract_Component abs=new Abstract_Component(driver);
	    abs.adminlogin();
		
	}
	

	@When("^Click on side menu (.*)$")
	public void click_on_side_menu(String s_menu) {
		Abstract_Component abs=new Abstract_Component(driver);
		abs.click_side_menu(s_menu);
	}


	@When("^Clicks on menu (.*) and submenu (.*)$")
	public void clicks_on_menu_and_submenu(String menu, String submenu) {
		Abstract_Component abs=new Abstract_Component(driver);
	    abs.click_side_menu(menu);
	    abs.Click_submenu(submenu);
		
	}
	@Then("^accepts payment request of instructor (.*)$")
	public void accepts_payment_request_of_instructor(String email) throws InterruptedException {
		Admin_subscriptionFee_approve a_approve = new Admin_subscriptionFee_approve(driver);
		a_approve.send_payment(email);
		Thread.sleep(5000);
		
	}
	
	
	
}
