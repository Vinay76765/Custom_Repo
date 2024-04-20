package VinayKumar.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VinayKumar.AbstractComponents.Abstract_Component;

public class Login_Ins  {

	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	public Login_Ins(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//div[@id='login']//div[@class='mb-2 p-2']//div[1]//input[1]")
	WebElement Phone_number;
	
	@FindBy(xpath="http://64.227.160.66/upskhill/#/login")
	WebElement Login_lnk;
	
	@FindBy(xpath="//div[@class='mb-2 p-2']//div[1]//input[@name='gender']")
	WebElement Phone_Radio;
	
	@FindBy(xpath="//div[@class='mb-2 p-2']//div[2]//input[@name='gender']")
	WebElement Email_Radio;
	
	@FindBy(xpath="//input[@formcontrolname='siginEmail']")
	WebElement Email;
	
	@FindBy(xpath="//input[@formcontrolname='loginPassword']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Sign in']")
	WebElement Login_btn;
	
	@FindBy(xpath="//input[@formcontrolname='loginPhone']")
	WebElement Phone_text;
	
	@FindBy(xpath="//button[@class='dropdown-toggle text-decoration-none bg-white']")
	WebElement Account_btn;
	
	@FindBy(xpath="//button[normalize-space()='Logout']")
	WebElement Logout_lnk;
	
	
	
	
	
	public void loginapp_phone(String Phone, String Password) throws InterruptedException
	{
		
		Phone_Radio.click();
		Phone_text.sendKeys(Phone);
		password.sendKeys(Password);
		Login_btn.click();
		String text =abs.Login_message();
		abs.waitForWebElementToAppear(Account_btn);
		Account_btn.click();
		Logout_lnk.click();
		Thread.sleep(5000);
	}
	
	public void loginapp_email(String username, String Password) throws InterruptedException
	{
		//Email_Radio.click();
		abs.waitForWebElementToAppear(Email);
		Email.sendKeys(username);
		password.sendKeys(Password);
		Login_btn.click();
		String text =abs.Login_message();
		abs.waitForWebElementToAppear(Account_btn);
		Account_btn.click();
		Logout_lnk.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
}
