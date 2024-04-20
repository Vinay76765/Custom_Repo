package VinayKumar.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Stu_enroll_part {
	
	WebDriver driver;
	public Stu_enroll_part(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
