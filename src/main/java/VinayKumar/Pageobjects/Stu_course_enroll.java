package VinayKumar.Pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import VinayKumar.AbstractComponents.Abstract_Component;

public class Stu_course_enroll {
	
	WebDriver driver;
	Abstract_Component abs=new Abstract_Component(driver);
	String[] courseamount;
	String[] courseamount1;
	public Stu_course_enroll(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	String course=null;
	
	@FindBy(xpath="//button[.='Go to course catalog']")
	WebElement course_catalogue_btn;
	
	@FindBy(xpath= "//div[@class='has-search']//input")
	WebElement course_search_tb;
	
	@FindBy(xpath="//div[@class='container-fuild']/div[@class='row mx-3']//div[@class='card-body']/a")
	WebElement search_card;
	
	@FindBy(xpath="//div[@class='slide slick-slide slick-current slick-active']//div[@class='card-footer border-top-0 p-2']/a")
	WebElement enroll_course;
	
	@FindBy(xpath = "//div[@class='container-fuild']/div[@class='row mx-3']//div[@class='card-body']/p")
	WebElement Instructor;
	
	@FindBy(xpath= "//a[normalize-space()='view profile']")
	WebElement view_profile;
	
	@FindBy(xpath= "//div[@id='profilemodal']//p[1]")
	WebElement profile_ins_name;
	
	@FindBy(xpath="//div[@id='profilemodal']//button[.='Close']")
	WebElement close_profile;
	
	@FindBy(xpath="//div[@class='container-fuild']/div[@class='row mx-3']//div[@class='card-body']//div[@class='d-flex justify-content-between']/p")
	WebElement course_amount_os;
	
	@FindBy(xpath="//div[@class='container-fuild']//div[@class='mx-3']//div[@class='col-md-5']//span")
	WebElement course_amount_in;
	
	@FindBy(xpath="//button[.='Enroll Now']")
	WebElement enroll_btn;
	
	@FindBy(xpath="//button[.='Complete payment']")
	WebElement complete_pay_btn;
	
	@FindBy(xpath="//div[@class='card-body']/h3")
	WebElement success_message;
	
	@FindBy(xpath="//div[@class='row-cols-sm-auto mx-auto']/p")
	WebElement verify_course_pay_msg;
	
//	WebElement search_card = driver.findElement(By.xpath("//div[@class='slide slick-slide slick-current slick-active']//a[@class='card-title text-decoration-none'][.='Police']"));
	
	public void go_course_cat_search(String course)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(course_catalogue_btn);
		course_catalogue_btn.click();
		course_search_tb.sendKeys(course);
	}
	
	public String verify_course()
	{
		
		String text = search_card.getText();
		System.out.println(text);
		return text;
	}
	
	public String[] verify_instructor()
	{
		Abstract_Component abs = new Abstract_Component(driver);
		
		//getting instructor name, course amount and clicks on course card
		String ins_name = Instructor.getText();
		String crsamount = course_amount_os.getText();
		courseamount = crsamount.split("₦ ");
		System.out.println(courseamount[1]);
		abs.waitForWebElementToAppear(search_card);
		search_card.click();
		System.out.println(ins_name);
		
		//Clicking on instructor profile and getting instructor name inside the course, returning course amount
		view_profile.click();
		abs.waitForWebElementToAppear(profile_ins_name);
		String ins_name_pofile = profile_ins_name.getText();
		String[] ins_name_1 = ins_name_pofile.split(":");
		String ins_name_2 = ins_name_1[1];
		String new_ins_name = ins_name_2.strip();
		System.out.println(new_ins_name);
		close_profile.click();
		return courseamount;
	}
	
	//getting course amount inside the course to verify course amount outside and inside the course
	public String[] verify_course_amount()
	{
		String camount = course_amount_in.getText();
		courseamount1 = camount.split("₦ ");
		System.out.println(courseamount1[1]);
		return courseamount1;
	}
		
	public void enroll_course()
	{
		enroll_btn.click();
		complete_pay_btn.click();;
	}
	
	public void verify_success_message(String course)
	{
		String success = success_message.getText();
		Assert.assertEquals("Success", success);
		String course_msg = verify_course_pay_msg.getText();
		Assert.assertEquals("Your payment for "+course+" was received! Welcome to your journey.",course_msg);
		
	}
	
	
	
	
	
	

	
}
