package CucumberDefinitions;

import org.openqa.selenium.WebDriver;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.TestComponents.Base_Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Instructor_subscription {
	
	Abstract_Component abs;
	WebDriver driver;
	Base_Test base=new Base_Test();
	
	@Given("goto website")
	public void goto_website()
	{
//		driver=base.GetDriver();
		Abstract_Component abs= new Abstract_Component(driver);
	    abs.goTo_User();
	    
		
	}
	@When("enter username {string} and password {string}")
	public void enter_username_and_password(String username, String password)  {
		Abstract_Component abs= new Abstract_Component(driver);	
	  abs.login_user(username, password);
	  
	}
	
	@Then("payment page should display and payment is made with card number {string} expiry {string} and cvv {int}")
	public void payment_page_should_display_and_payment_is_made_with_card_number_expiry_and_cvv(String num, String exp, Integer cvv) throws Exception {
		Abstract_Component abs= new Abstract_Component(driver);	
		abs.click_pay();
		Thread.sleep(2000);
		abs.Card_pay(num, exp, cvv);

	}

}
