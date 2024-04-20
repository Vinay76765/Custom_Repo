package VinayKumar.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VinayKumar.AbstractComponents.Abstract_Component;

public class Admin_subscriptionFee_approve{
	
	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	public Admin_subscriptionFee_approve(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[.='Send payment link']")
	WebElement Payment_lnk_btn;
	
	public void send_payment(String email)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		driver.findElement(By.xpath("//table[@class='table-resp table nomargin']//tr//td[.='"+email+"']/following-sibling::td//span//i")).click();
		abs.waitForWebElementToAppear(Payment_lnk_btn);
		Payment_lnk_btn.click();
	}
	
	
	
	
	
	
	
	

}
