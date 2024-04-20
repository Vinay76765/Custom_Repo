package VinayKumar.Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import VinayKumar.AbstractComponents.Abstract_Component;
import VinayKumar.Pageobjects.Login_Ins;


import VinayKumar.TestComponents.Base_Test;

public class Login_Instructor {
	
	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	Base_Test base = new Base_Test();
	@Test() 
	public void login_Ins() throws InterruptedException, IOException {
		
		Login_Ins loginins = new Login_Ins(driver);
		base.GetDriver();
//		abs.goTo_User();
		loginins.loginapp_phone("9964640485", "Vinay76765@");
     	//Assert.assertEquals(" Login Successfull ",loginins.Login_message());
		loginins.loginapp_email("vinaykumar98.vk44@gmail.com", "Vinay76765@");
		//Assert.assertEquals(" Login Successfull ",loginins.Login_message());
		
		
	}

}
