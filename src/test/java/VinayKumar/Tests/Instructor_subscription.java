package VinayKumar.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Instructor_subscriptionFee_pay;
import VinayKumar.TestComponents.Base_Test;

public class Instructor_subscription {
	
	WebDriver driver;
	Abstract_Component abs = new Abstract_Component(driver);
	@Test
	public void Subscription_payment() throws Exception {
		Instructor_subscriptionFee_pay ins_subscription = new Instructor_subscriptionFee_pay(driver);
		Abstract_Component abs = new Abstract_Component(driver);
		abs.goTo_User();
		abs.login_user("Rajath@gmail.com", "Rajath76765@");
		boolean Text = ins_subscription.Subscription_fee_text() != null;
		Assert.assertTrue(Text);
		abs.Card_pay("4242424242424242", "0131", 789);
		
	}
	
	

}
