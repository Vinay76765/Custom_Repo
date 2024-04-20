package VinayKumar.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VinayKumar.AbstractComponents.Abstract_Component;

public class Landing_Page {
	
	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	public Landing_Page(WebDriver driver)
	{
		
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='banner container-fluid']//h1[@class='dark-clr']")
	WebElement Land_Text;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement Login_lnk;
	
	@FindBy(xpath="//div[@class='form-check form-check-inline']/input[@name='gender']/following-sibling::label[.='Phone number']")
	WebElement Phone_Radio;
	
	
	public void goTo() {
		
		driver.get("http://64.227.160.66/upskhill/#/");
	}
	
	public String Verify_Landing_Page()
	{
abs.waitForWebElementToAppear(Land_Text);
		String Text = Land_Text.getText();
		
		return Text;
	}
	
//	public void loginapp_email(String username, String Password)
//	{	
//		Login_lnk.click();
//		Email.sendKeys(username);
//		password.sendKeys(Password);
//		Login_btn.click();
//	}
//	
//	
	
	
}
