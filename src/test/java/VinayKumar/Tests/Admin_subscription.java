package VinayKumar.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Admin_subscriptionFee_approve;
import VinayKumar.TestComponents.Base_Test;

public class Admin_subscription {
	
	WebDriver driver;
	
	@Test
	public void Subscription_Fee() throws InterruptedException {
		Abstract_Component abs = new Abstract_Component(driver);
		Admin_subscriptionFee_approve Admin_Subscription = new Admin_subscriptionFee_approve(driver);
		abs.goTo_admin();
		abs.adminlogin();
		abs.click_side_menu("Settings");
		abs.click_menu("User Management");
		abs.Click_submenu("Registration");
		Admin_Subscription.send_payment("Rajath@gmail.com");
		Thread.sleep(5000);
	
	}

}
