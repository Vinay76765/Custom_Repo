package VinayKumar.Pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;


import VinayKumar.AbstractComponents.Abstract_Component;

public class Instructor_Details    {

	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	public Instructor_Details(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='tab-content mt-5 mx-4']//div[1]//p")
	WebElement Profile_Alert;

	@FindBy(xpath="//span[.='Settings']")
	WebElement Settings_Btn;
	
	@FindBy(xpath="//div[@class='card border border-1 mb-3']//div[@class='row'][1]//button")
	WebElement Edit_Personal;
	
	@FindBy(xpath="//input[@formcontrolname='dateofbirth']")
	WebElement DOB;
	
	@FindBy(xpath="//input[@formcontrolname='biography']")
	WebElement Bio_field;
	
	@FindBy(xpath="//input[@formcontrolname='headline']")
	WebElement Prof_head;
	
	@FindBy(xpath="//a[.='+ Add interests']")
	WebElement Interest;
	
	@FindBy(xpath="//div[@class='col mt-auto text-end']//button[@type='button'][normalize-space()='Edit']")
	WebElement Edit_contact;
	
	@FindBy(xpath="//input[@formcontrolname='alternatephone']")
	WebElement Alternate_Phone;
	
	@FindBy(xpath="//textarea[@formcontrolname='permanentaddress']")
	WebElement Permanent_address;
	
	@FindBy(xpath="//textarea[@formcontrolname='currentaddress']")
	WebElement Current_address;
	
	@FindBy(xpath="//div[@class='col-6 mt-2 text-end']//div//button")
	WebElement Save_Personal;
	
	@FindBy(xpath="//button[@class='btn btn-outline-primary mx-2']")
	WebElement Save_Contact;
	
	@FindBy(xpath="//div[@class='font-grey font14']")
	WebElement Image;
	
	@FindBy(xpath="//a[.='Education']")
	WebElement Education_Tab;
	
	@FindBy(xpath="//button[.='Add']")
	WebElement Edu_add;
	
	@FindBy(xpath="//input[@formcontrolname='university']")
	WebElement University;
	
	@FindBy(xpath="//select[@formcontrolname='qualificationtype']")
	WebElement Qual_type;
	
	@FindBy(xpath="//select[@formcontrolname='title']")
	WebElement Qual_title;
	
	@FindBy(xpath="//select[@formcontrolname='qualificationstatus']")
	WebElement Qual_Status;
	
	@FindBy(xpath="//input[@formcontrolname='startdate']")
	WebElement Startdate;
	
	@FindBy(xpath="//input[@formcontrolname='enddate']")
	WebElement EndDate;
	
	@FindBy(xpath="//input[@formcontrolname='grade']")
	WebElement Grade;
	
	@FindBy(xpath="//div[@class='col mt-2 text-end']//div//button[@type='button'][normalize-space()='Save']")
	WebElement Save_Education;
	
	@FindBy(xpath ="//a[.='Save changes']")
	WebElement Save_Img;
	
	@FindBy(xpath= "//input[@formcontrolname='certificate']")
	WebElement certificate;
	
	@FindBy(xpath = "//button[.=' Upload file ']")
	WebElement Upload_btn;
	
	public void login(String username, String password) throws InterruptedException
	{
		Login_Ins loginins = new Login_Ins(driver);
		loginins.Email.sendKeys(username);
		loginins.password.sendKeys(password);
		loginins.Login_btn.click();
		Thread.sleep(5000);
		Settings_Btn.click();
	}
	
	
	public void details() throws InterruptedException {
		Abstract_Component abs=new Abstract_Component(driver);
		
		abs.waitForWebElementToAppear(Profile_Alert);
		if((Profile_Alert.getText())!=null) 
		{
			System.out.println(Profile_Alert.getText());
			Settings_Btn.click();
			
		}
		else {
			Settings_Btn.click();
		}
		
		
		
	}
	
	public void DOB(int Date, int month, int year)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(Edit_Personal);
		Edit_Personal.click();
		DOB.click();
		DOB.click();
		DOB.sendKeys(Integer.toString(Date));
//		DOB.sendKeys(Keys.TAB);
		DOB.sendKeys(Integer.toString(month));
//		DOB.sendKeys(Keys.TAB);
		DOB.sendKeys(Integer.toString(year));
		
	}
	
	public void Biography(String Bio)
	{
		
		Bio_field.sendKeys(Bio);
	}
	
	
	public void Professional_headline(String headline)
	{
		
		Prof_head.sendKeys(headline);
		Save_Personal.click();
	}
	
	public void Add_Interests(String interest)
	{
//		for(int i=0; i<=num; i++)
//		{
//			Interest.click();
//			WebElement in =driver.findElement(By.xpath("//div[@formarrayname='inputs']//input["+i+"]"));
//			if(i==1)
//			{
//				in.sendKeys("Reading book");
//			}
//			else if(i==2)
//			{
//				in.sendKeys("Playing video games");
//			}
//			else if(i==3)
//			{
//				in.sendKeys("Spending time in nature");
//			}
//			}
		
		    Interest.click();
		    driver.findElement(By.xpath("//input[@formcontrolname='inputControlName']")).sendKeys(interest);
		   
		    
}
	
	public void Phone_number(String Phone)
	{
		Edit_contact.click();
		Alternate_Phone.sendKeys(Phone);
		
	}
	
	public void Permanent_Address(String Permanant)
	{
		Permanent_address.sendKeys(Permanant);
		Save_Contact.click();
		
		
	}
	
	public void Current_Address(String Current)
	{
		
		Current_address.sendKeys(Current);
		
	}
	
	public void file_upload(String path) throws InterruptedException, AWTException
	{	
		abs.waitForWebElementToAppear(Image);
		Image.click();
		
//		WebElement Path = driver.findElement((By) Image);
		
		
		Robot rb = new Robot();
		
		StringSelection str = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
		 rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	     
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
		
//		Image.sendKeys(path);
//		waitForWebElementToAppear(Save_Img);
		Save_Img.click();
		abs.waitForWebElementToAppear(Upload_btn);
		Upload_btn.click();
		
		
	}
	
	public void click_Edu_add()
	{
		Education_Tab.click();
		Edu_add.click();
	}
	
	public void Edu_coll_type(String College, String Type)
	{
		University.sendKeys(College);
		Qual_type.click();
		Select c = new Select(Qual_type);
		c.selectByVisibleText(Type);
	}
	
	public void Edu_title_status(String title, String status)
	{
		Qual_title.click();
		Select t = new Select(Qual_title);
		t.selectByVisibleText(title);
		Qual_Status.click();
		Select s = new Select(Qual_Status);
		s.selectByVisibleText(status);
		
	}
	
	public void Edu_start_date(int date, int month, int year)
	{	
		Startdate.click();
		Startdate.sendKeys(Integer.toString(date));
		Startdate.sendKeys(Integer.toString(month));
		Startdate.sendKeys(Integer.toString(year));
	}
	
	public void Edu_End_Date(int date, int month, int year)
	{
		EndDate.click();
		EndDate.sendKeys(Integer.toString(date));
		EndDate.sendKeys(Integer.toString(month));
		EndDate.sendKeys(Integer.toString(year));
	}
	
	
	public void Final_grade(String grade)
	{
		Grade.sendKeys(grade);
	}
	
	public void upload_certificate(String path) throws InterruptedException
	{
		Abstract_Component abs=new Abstract_Component(driver);
		certificate.sendKeys(path);
		abs.waitForWebElementToAppear(Upload_btn);
		Upload_btn.click();
		abs.waitforelementoclickable(Save_Education);
		Save_Education.click();
		Thread.sleep(5000);
	}
	
	}

