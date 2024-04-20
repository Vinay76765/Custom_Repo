package VinayKumar.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import VinayKumar.AbstractComponents.Abstract_Component;

public class Instructor_subscriptionFee_pay {

	WebDriver driver;
	
	public Instructor_subscriptionFee_pay(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[.=' Instructor Subscription Fee :- 500 ']")
	WebElement Subscription_fee;
	
	@FindBy(xpath="//button[.='Pay']")
	WebElement Payment_btn;
	
	public String Subscription_fee_text()
	{
		String Message = Subscription_fee.getText();
		return Message;
	}
	
	public void Payment() throws InterruptedException
	{	Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(Payment_btn);
		System.out.println(Payment_btn.isDisplayed());
		Payment_btn.click();
		Thread.sleep(5000);
		
	}
	

}
