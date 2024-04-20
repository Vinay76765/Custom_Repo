package VinayKumar.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Stu_course_completion {
	
	WebDriver driver;
	public Stu_course_completion(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
