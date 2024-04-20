package VinayKumar.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import VinayKumar.Pageobjects.Landing_Page;
import VinayKumar.TestComponents.Base_Test;

public class upskhill_demo{
	
	WebDriver driver;
	Landing_Page landingpage = new Landing_Page(driver);
	@Test
	public void upskhill_Land() throws InterruptedException
	{
		
		landingpage.goTo();
		Assert.assertEquals(landingpage.Verify_Landing_Page(), "The online marketplace for skilled and vetted talent");
		
		
		//Login through email ID
		//landingpage.loginapp_email("vinaykumar98.vk44@gmail.com", "Vinay76765@");
		Thread.sleep(5000);
		
	
		
		
	}
		
	
		
		
}

