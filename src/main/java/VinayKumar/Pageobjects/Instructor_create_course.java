package VinayKumar.Pageobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import VinayKumar.AbstractComponents.Abstract_Component;

public class Instructor_create_course {
	
	WebDriver driver;
	
	public Instructor_create_course(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public String[] marks_1;
	public String[] balance_marks_start1;
	
	@FindBy (xpath= "//button[normalize-space()='Create course']")
	WebElement create_crse_btn;
	
	@FindBy(xpath = "//input[@formcontrolname='c_title']")
	WebElement working_title;
	
	@FindBy(xpath="//div[@formarrayname='outcomes']//input")
	List<WebElement> learners_take_away;
	
	@FindBy(xpath="//div[@formarrayname='requirementoption']//input")
	List<WebElement> l_requirements;
	
	@FindBy(xpath="//div[@class='mx-3 dark-clr']/div//input")
	List<WebElement> bie_levels;
	
	@FindBy(xpath="//div[@class='form-group mt-4'][1]//span")
	WebElement add_more__outcome;
			
	@FindBy(xpath="//button[.='Continue']")
	WebElement continue1;
	
	@FindBy(xpath="//a[.='Continue']")
	WebElement Continue;
	
	@FindBy(xpath = "//input[@formcontrolname='totalmark']")
	WebElement totalmark;
	
	@FindBy(xpath="//span[.=' Add Module']")
	WebElement Add_module_btn;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement Module_name_1;
	
	@FindBy(xpath="//input[@formcontrolname='description']")
	WebElement Description_1;
	
	@FindBy(xpath="//span[@class='float-end mt-2 col-lg-5']//span[2]")
	WebElement bal_marks;
	
	@FindBy(xpath="//button[.='Add']")
	WebElement add_tot_marks;
	
	@FindBy(xpath="//input[@formcontrolname='percentage']")
	WebElement mod_percentage;
	
	@FindBy(xpath="//div[@class='mx-3 mt-3']/label")
	WebElement ver_mod1_marks;
	
	@FindBy(xpath="//button[.='Add Module']")
	WebElement Add_mod_btn;
	
	@FindBy(xpath="//div[@class='mt-3 pb-2']/a")
	WebElement contents_add_btn;
	
	@FindBy(xpath="//span[.='Lesson']")
	WebElement add_lesson_span;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement lesson_name;
	
	@FindBy(xpath="//p[@class='ck-placeholder']")
	WebElement lesson_description;
	
	@FindBy(xpath="//button[.='Add Lesson']")
	WebElement add_lesson_btn;
	
	@FindBy(xpath="//label[.='Video title']/following-sibling::input")
	WebElement mod1_video_title;
	
	@FindBy(xpath="//span[.='Add content medium']")
	WebElement add_content_medbtn;
	
	@FindBy(xpath="//div[@class='row justify-content-center pb-3']/a")
	List<WebElement> contents;
	
	@FindBy(xpath="//p[.='video']")
	WebElement Video_lnk_btn;
	
	@FindBy(xpath="//div[@class='input-group mb-3 mt-2']/input")
	WebElement upload_file_input;
	
	@FindBy(xpath="//div[@class='input-group']/input")
	WebElement article_upload_input;
	
	@FindBy(xpath="//button[@class='input-group-text font16']")
	WebElement video_upload;
	
	@FindBy(xpath="//label[.='Audio title']/following-sibling::input")
	WebElement mod1_audio_title;
	
	@FindBy(xpath = "//label[.='Article title']/following-sibling::input")
	WebElement mod1_article_title;
	
	@FindBy(xpath= "//div[@class='ck ck-editor__main']//p")
	WebElement mod1_article_desc; 
	
	@FindBy(xpath="//span[.='Upload']")
	WebElement article_upload_btn;
	
	@FindBy(xpath= "//button[.='Upload file']")
	WebElement article_upload_btn1;
	
	@FindBy(xpath = "//div[@class='float-end mb-2']//button[.=' Save ']")
	WebElement article_save;
	
	@FindBy(xpath="//div[@class='modal-dialog modal-fullscreen']//button[@aria-label='Close']")
	WebElement article_close;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']//div[3]//div[@class='mt-3 pb-2']/a")
	WebElement add_plus;
	
	@FindBy(xpath="//span[.='Quiz']")
	WebElement Quiz_plus;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement Quiz_title;
	
	@FindBy(xpath="//div[@role='presentation']//p")
	WebElement Quiz_desc;
	
	@FindBy(xpath="//input[@formcontrolname='marks']")
	WebElement Quiz_marks;
	
	@FindBy(xpath="//input[@formcontrolname='duration']")
	WebElement Quiz_duration;
	
	@FindBy(xpath="//button[.='Add quiz']")
	WebElement Add_Quiz;
	
	@FindBy(xpath="//div[@class='row w-100 mb-2']/following-sibling::div[2]//div[@class='row w-100']//div[5]//span")
	WebElement Quiz_marks_ver;
	
	@FindBy(xpath="//div[@class='row w-100 mb-2']/following-sibling::div[2]//div[@class='row w-100']//div[3]//span")
	WebElement Quiz_duration_ver;
	
	@FindBy(xpath="//span[.='Add questions']")
	WebElement Add_questions_btn;
	
	@FindBy(xpath="//input[@formcontrolname='question']")
	WebElement Question_title;
	
	@FindBy(xpath="//div[@formarrayname='answers']")
	List<WebElement> answers;
	
	@FindBy(xpath="//input[@formcontrolname='answer']")
	List<WebElement> answer;
	
	@FindBy(xpath="//input[@formcontrolname='answerreason']")
	List<WebElement> answer_reason;
	
	@FindBy(xpath="//input[@formcontrolname='answertype']")
	List<WebElement> answer_type;
	
	@FindBy(xpath="//button[@class='btn btn-primary float-end mx-3'][normalize-space()='Save']")
	WebElement question_save_btn;
	
	@FindBy(xpath="//span[.='Assignment']")
	WebElement Assignmenet_plus;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement Assignment_title; 
	
	@FindBy(xpath="//div[@role='presentation']//p")
	WebElement Assignment_desc;
	
	@FindBy(xpath="//input[@formcontrolname='marks']")
	WebElement assignment_marks;
	
	@FindBy(xpath="//input[@formcontrolname='duration']")
	WebElement assignment_time;
	
	@FindBy(xpath="//button[.='Add assignment']")
	WebElement Add_assignment_btn;
	
	@FindBy(xpath="//span[.='Setup assignment']")
	WebElement Setup_assignment_btn;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[4]//div[8]//a//span")
	WebElement Setup_assignment_btn2;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[5]//div[11]//a//span")
	WebElement Setup_assignment_btn3;
	
	@FindBy(xpath="//div[@class='d-flex mt-4']//button[.='Continue']")
	WebElement overview_assignment_cont;
	
	@FindBy(xpath="//div[@role='presentation']//p")
	WebElement assignment_ins_desc;
	
	@FindBy(xpath="//div[@class='input-group mb-3']/input")
	WebElement ins_file_upload;
	
	@FindBy(xpath="//button[normalize-space()='Upload file']")
	WebElement ins_upload_btn;
	
	@FindBy(xpath="//button[.=' Save ']")
	WebElement instructions_save;
	
	@FindBy(xpath="//div[@class='d-flex mt-4']//button[.='Continue']")
	WebElement Instructions_cont;
	
	@FindBy(xpath="//div[@class='col-lg-10 tab-content']//span[.='Add questions']")
	WebElement Add_questions_asn;
	
	@FindBy(xpath="//textarea[@id='formatedtxt']")
	WebElement question;
	
	@FindBy(xpath="//input[@formcontrolname='wordcount']")
	WebElement wordcount;
	
	@FindBy(xpath="//button[.=' Submit']")
	WebElement question_submit;
	
	@FindBy(xpath="//button[.='Save and Continue']")
	WebElement ques_save_continue;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']//div[4]//div[@class='mt-3 pb-2']/a")
	WebElement mod2_add_plus;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']//div[5]//div[@class='mt-3 pb-2']/a")
	WebElement mod3_add_plus;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[3]//div[@class='row w-100']//a//span[.='Add content medium']")
	WebElement mod1_contents_add;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[4]//div[@class='row w-100']//a//span[.='Add content medium']")
	WebElement mod2_contents_add;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[5]//div[@class='row w-100']//a//span[.='Add content medium']")
	WebElement mod3_contents_add;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[4]//div[7]//a//span")
	WebElement quiz_addqsn_btn2;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[5]//div[10]//a//span")
	WebElement quiz_addqsn_btn3;
	
	@FindBy(xpath="//div[@id='ngb-panel-70-header']//div[5]//span")
	WebElement Quiz_marks_ver2;
	
	@FindBy(xpath="//button[.='Continue']")
	WebElement Curriculum_cont_btn;
	
	//Coure landing page elements
	
	@FindBy(xpath="//input[@formcontrolname='courselanding1']")
	WebElement course_title;
	
	@FindBy(xpath="//input[@formcontrolname='courselanding2']")
	WebElement course_subtitle;
	
	@FindBy(xpath="//p[@class='ck-placeholder']")
	WebElement course_desc;
	
	@FindBy(xpath="//select[@formcontrolname='languagedropdown']")
	WebElement language_drp;
	
	@FindBy(xpath="//select[@formcontrolname='catalogdropdown']")
	WebElement coursetype_drp;
	
	@FindBy(xpath="//select[@formcontrolname='leveldropdown']")
	WebElement diff_level_drp;
	
	@FindBy(xpath="//select[@formcontrolname='categorydropdown']")
	WebElement category_drp;
	
	@FindBy(xpath="//select[@formcontrolname='learningpathdrop']")
	WebElement sub_category1_drp;
	
	@FindBy(xpath="//select[@formcontrolname='coursesubdrop']")
	WebElement sub_category2_drp;
	
	@FindBy(xpath="//div[@class='border-padding py-3 px-4']/div[6]//div[@class='input-group mb-3']")
	WebElement course_image_upload;
	
	@FindBy(xpath="//div[@class='border-padding py-3 px-4']/div[7]//div[@class='input-group mb-3']/input")
	WebElement course_video_upload;
	
	@FindBy(xpath="//div[@class='form-group mt-3'][5]//button")
	WebElement video_upload_btn;
	
	@FindBy(xpath="//input[@formcontrolname='courselanding4']")
	WebElement instructor_profile;
	
	@FindBy(xpath="//span[.=' Add Co-Author']")
	WebElement add_coauthor_btn;
	
	@FindBy(xpath="//input[@formcontrolname='coauthorname']")
	WebElement coauthor_name;
	
	@FindBy(xpath="//input[@formcontrolname='coauthorphone']")
	WebElement coauthor_phone;
	
	@FindBy(xpath="//input[@formcontrolname='coauthormail']")
	WebElement coauthor_email;
	
	@FindBy(xpath="//button[@class='btn btn-outline mt-3 mx-2']")
	WebElement coauthor_save;
	
	//Pricing page elements
	
	@FindBy(xpath="//input[@formcontrolname='q14']")
	WebElement professional_headline;
	
	@FindBy(xpath="//input[@formcontrolname='q15']")
	WebElement biography;
	
	@FindBy(xpath="//div[@class='input-group mb-3']/input")
	WebElement profile_picture_upload;
	
	@FindBy(xpath="//input[@formcontrolname='basicfee']")
	WebElement basic_fee;
	
	@FindBy(xpath="//input[@formcontrolname='discountpercentage']")
	WebElement discount;
	
	@FindBy(xpath="//div[@class='font16 dark-clr mt-2']")
	WebElement fee_after_discount;
	
	//Courses messages screen
	
	@FindBy(xpath="//input[@formcontrolname='coursemessage1']")
	WebElement welcome_message;
	
	@FindBy(xpath="//input[@formcontrolname='coursemessage2']")
	WebElement congrats_message;
	
	@FindBy(xpath="//button[.='Submit For Review']")
	WebElement submit;
	
	//Marks, time and total hours verification xpaths
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='row']//a/span")
	WebElement total_c_hours;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[3]/div[@class='cus-bg-gray px-3']/div[2]/div[4]")
	WebElement mod1_time;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[3]/div[@class='cus-bg-gray px-3']/div[2]/div[5]")
	WebElement mod1_marks;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[3]/div[@class='cus-bg-gray px-3']/div[3]//button")
	WebElement Lesson_drop1;
	
	@FindBy(xpath="//div[@class='accordion-body shadow rounded']//tbody[5]//td[3]")
	WebElement audio_time1;
	
	@FindBy(xpath="//div[@class='accordion-body shadow rounded']//tbody[6]//td[3]")
	WebElement video_time1;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[3]//div[@class='cus-bg-gray px-3']/div[4]//div[@class='col-md-1'][3]//span")
	WebElement Quiz1_marks;
	
	@FindBy(xpath = "//div[@class='border-padding py-2 px-2']/div[3]//div[@class='cus-bg-gray px-3']/div[4]//div[@class='col-md-1'][1]//span")
	WebElement Quiz1_time;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[3]//div[@class='cus-bg-gray px-3']/div[5]//div[@class='col-md-1'][1]//span")
	WebElement Assignment1_time;
	
	@FindBy(xpath = "//div[@class='border-padding py-2 px-2']/div[3]//div[@class='cus-bg-gray px-3']/div[5]//div[@class='col-md-1'][3]//span")
	WebElement Assignment1_marks;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[4]/div[@class='cus-bg-gray px-3']/div[2]/div[4]")
	WebElement mod2_time;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[4]/div[@class='cus-bg-gray px-3']/div[2]/div[5]")
	WebElement mod2_marks;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[4]//div[@class='cus-bg-gray px-3']/div[6]//div[@class='accordion-header']/button")
	WebElement Lesson_drop2;
	
	@FindBy(xpath="//div[@class='accordion-body shadow rounded']//tbody[3]//td[3]")
	WebElement audio_time2;
	
	@FindBy(xpath="//div[@class='accordion-body shadow rounded']//tbody[4]//td[3]")
	WebElement video_time2;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[4]//div[@class='cus-bg-gray px-3']/div[7]//div[@class='col-md-1'][3]//span")
	WebElement Quiz2_marks;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[4]//div[@class='cus-bg-gray px-3']/div[7]//div[@class='col-md-1'][1]//span")
	WebElement Quiz2_time;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[4]//div[@class='cus-bg-gray px-3']/div[8]//div[@class='col-md-1'][1]//span")
	WebElement Assignment2_time;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[4]//div[@class='cus-bg-gray px-3']/div[8]//div[@class='col-md-1'][3]//span")
	WebElement Assignment2_marks;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[5]/div[@class='cus-bg-gray px-3']/div[2]/div[4]")
	WebElement mod3_time;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']//div[5]/div[@class='cus-bg-gray px-3']/div[2]/div[5]")
	WebElement mod3_marks;
	
	@FindBy(xpath="//div[@id='tab5']//div[@class='border-padding py-2 px-2']/div[5]//div[@class='cus-bg-gray px-3']/div[9]//div[@class='accordion-header']/button")
	WebElement Lesson_drop3;
	
	@FindBy(xpath="//div[@class='accordion-body shadow rounded']//tbody[1]//td[3]")
	WebElement audio_time3;
		
	@FindBy(xpath="//div[@class='accordion-body shadow rounded']//tbody[2]//td[3]")
	WebElement video_time3;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[5]//div[@class='cus-bg-gray px-3']/div[10]//div[@class='col-md-1'][1]//span")
	WebElement Quiz3_time;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[5]//div[@class='cus-bg-gray px-3']/div[10]//div[@class='col-md-1'][3]//span")
	WebElement Quiz3_marks;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[5]//div[@class='cus-bg-gray px-3']/div[11]//div[@class='col-md-1'][1]//span")
	WebElement Assignment3_time;
	
	@FindBy(xpath="//div[@class='border-padding py-2 px-2']/div[5]//div[@class='cus-bg-gray px-3']/div[11]//div[@class='col-md-1'][3]//span")
	WebElement Assignment3_marks;
	
	
	
	
	public void working_title(String title)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(create_crse_btn);
		create_crse_btn.click();
		
//		//entering outcomes that student will get
//		System.out.println(working_title.getSize());
		working_title.sendKeys(title);
		
	}
	
	public void learners_outcome(String outcome1, String outcome2, String outcome3, String outcome4)
	{
		add_more__outcome.click();
		List<String> outcomes=new ArrayList<String>(Arrays.asList(outcome1,outcome2,outcome3,outcome4));
		System.out.println(learners_take_away.size());
		for(int i=0;i<learners_take_away.size();i++)
		{
			//System.out.println(learners_take_away.get(i).getAttribute("placeholder"));
			learners_take_away.get(i).sendKeys(outcomes.get(i));
		}
		
	}
	
	public void requirements()
	{
		System.out.println(l_requirements.size());
		for(int i=0; i<l_requirements.size();i++)
		{
			l_requirements.get(i).click();
		}
		
	}
	
	public void bie_level(int level)
	{
		
		System.out.println(bie_levels.size());
		bie_levels.get(level).click();
		continue1.click();
	}
	
	public void course_structure()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitforelementoclickable(Continue);
		Continue.click();
	}
	
	public void setup_video()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitforelementoclickable(Continue);
		Continue.click();
	}
	
	public void film_edit()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitforelementoclickable(Continue);
		Continue.click();
	}
	
	public void course_marks(int total_marks)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(totalmark);
		totalmark.sendKeys(Integer.toString(total_marks));
		add_tot_marks.click();
		String balance_marks_start = bal_marks.getText();
		balance_marks_start1 = balance_marks_start.split(": ");
	}
	
	public void create_module_1(String name, String desc,int mod_marks)
	{
		
//		System.out.println(balance_marks_start1[1]);
		Add_module_btn.click();
		
		//entering details for module 1
		Module_name_1.sendKeys(name);
		Description_1.sendKeys(desc);
		
		mod_percentage.sendKeys(Integer.toString(mod_marks));
		String markss = ver_mod1_marks.getText();
//		System.out.println(markss);
		marks_1 = markss.split(": ");
//		System.out.println(marks_1[1]);
		Add_mod_btn.click();
		
	}
	
	public void module_contents(String less_name, String less_desc)
	{
		
		
		Abstract_Component abs=new Abstract_Component(driver);
		try
		{
			abs.waitforelementoclickable(add_lesson_span);
			add_lesson_span.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(add_lesson_span);
			add_lesson_span.click();
		}
		lesson_name.sendKeys(less_name);
		lesson_description.sendKeys(less_desc);
		add_lesson_btn.click();
	}
	
	
	public void click_contents1() 
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			abs.waitForWebElementToAppear(add_content_medbtn);
			add_content_medbtn.click();
		}catch(StaleElementReferenceException e) {
			abs.waitForWebElementToAppear(add_content_medbtn);
			add_content_medbtn.click();
		}
		
		
	}
	
	public void upload_video(String video_title, String path)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(contents);
		contents.get(0).click();
		abs.waitForWebElementToAppear(mod1_video_title);
		mod1_video_title.sendKeys(video_title);
		upload_file_input.sendKeys(path);
		video_upload.click();
//		video_input.getScreenshotAs("target.png");
	}	
	
	public void upload_audio(String article_title, String audio_path)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(contents);
		contents.get(1).click();
		mod1_audio_title.sendKeys(article_title);
		upload_file_input.sendKeys(audio_path);
		video_upload.click();
	}
	
	public void upload_article(String article_title, String article_desc, String article_path) throws InterruptedException
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(contents);
		contents.get(2).click();
		mod1_article_title.sendKeys(article_title);
		mod1_article_desc.sendKeys(article_desc);
		article_upload_btn.click();
		article_upload_input.sendKeys(article_path);
		article_upload_btn1.click();
		abs.waitforelementoclickable(article_save);
		Thread.sleep(2000);
		if(article_save.isEnabled());
		{
			article_save.click();
		}
		article_close.click();
		
	}
	
	
	public void add_quiz(String quiz_title, String quiz_desc, int quiz_marks, int quiz_time) throws InterruptedException 
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			abs.waitForWebElementToAppear(Quiz_plus);
			Quiz_plus.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitForWebElementToAppear(Quiz_plus);
			Quiz_plus.click();
		}
		
		Quiz_title.sendKeys(quiz_title);
		Quiz_desc.sendKeys(quiz_desc);
		Quiz_marks.sendKeys(Integer.toString(quiz_marks));
		Quiz_duration.sendKeys(Integer.toString(quiz_time));
		Add_Quiz.click();
		
		
	}
	
	public void add_quiz_questions(String question,String q1, String q2, String q3, String q4, String a1, String a2,String a3, String a4, int c_ans) throws InterruptedException
	{
		List<String> ques = new ArrayList<String>(Arrays.asList(q1,q2, q3, q4));
		List<String> ans = new ArrayList<String>(Arrays.asList(a1, a2, a3, a4));
		Abstract_Component abs=new Abstract_Component(driver);
		Thread.sleep(2000);
//		abs.waitforelementoclickable(Add_questions_btn);
//		Add_questions_btn.click();
		Question_title.sendKeys(question);
		System.out.println(answer.size());
		System.out.println(answer_reason.size());
		for(int i=0; i<answer.size(); i++)
		{	
			answer.get(i).sendKeys(ques.get(i));
			for(int j=0; j<answer_reason.size();j++) {
				answer_reason.get(j).sendKeys(ans.get(j));
			}
				
			
//			System.out.println(answer_type.size());
				
		}
		answer_type.get(c_ans).click();
		question_save_btn.click();
			
	}
	
	public void add_assignment(String asn_title, String asn_desc, String asn_marks, String asn_time)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try
		{
			abs.waitforelementoclickable(Assignmenet_plus);
			Assignmenet_plus.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(Assignmenet_plus);
			Assignmenet_plus.click();
		}
		Assignment_title.sendKeys(asn_title);
		Assignment_desc.sendKeys(asn_desc);
		assignment_marks.sendKeys(asn_marks);
		assignment_time.sendKeys(asn_time);
		Add_assignment_btn.click();
	}
	
	public void add_assignment_instructions(String asn_desc, String ins_path) throws InterruptedException
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitforelementoclickable(overview_assignment_cont);
		overview_assignment_cont.click();
		assignment_ins_desc.sendKeys(asn_desc);
		ins_file_upload.sendKeys(ins_path);
		ins_upload_btn.click();
		abs.waitforelementoclickable(instructions_save);
		instructions_save.click();
		Instructions_cont.click(); 
	}
	
	public void add_assignment_questions(int assignment, String q1,int w1, String q2, int w2, String q3, int w3, String q4, int w4) throws InterruptedException
	{
		int count=1;
		Abstract_Component abs=new Abstract_Component(driver);
		List<String> ques = new ArrayList<String>(Arrays.asList(q1, q2, q3, q4));
		int[] w1_count = {w1,w2,w3,w4};
		for(int i=0; i<assignment; i++)
		{
			abs.waitforelementoclickable(Add_questions_asn);
			Add_questions_asn.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@formarrayname='questions']["+count+"]//textarea")).sendKeys(ques.get(i));
			driver.findElement(By.xpath("//div[@formarrayname='questions']["+count+"]//div[@class='input-group']/input")).sendKeys(Integer.toString(w1_count[i]));
			driver.findElement(By.xpath("//div[@formarrayname='questions']["+count+"]//button[.=' Submit']")).click();
			Thread.sleep(2000);
			count++;
		}
		abs.waitforelementoclickable(ques_save_continue);
		ques_save_continue.click();
	}
	
	public void click_add_lesson_span2()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			abs.waitforelementoclickable(mod2_add_plus);
			mod2_add_plus.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(mod2_add_plus);
			mod2_add_plus.click();
		}
		
	}
	
	public void click_add_lesson_span3()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			
			abs.waitforelementoclickable(mod3_add_plus);
			mod3_add_plus.click();	
		}catch(StaleElementReferenceException e) 
		{
			abs.waitforelementoclickable(mod3_add_plus);
			mod3_add_plus.click();
		}
	}
	
	public void click_contents2()
	{	
		Abstract_Component abs=new Abstract_Component(driver);
		try {
		
		abs.waitforelementoclickable(mod2_contents_add);
		mod2_contents_add.click();
		}catch(StaleElementReferenceException e) {
			abs.waitforelementoclickable(mod2_contents_add);
			mod2_contents_add.click();
		}
	}
	
	public void click_contents3()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try
		{
			abs.waitforelementoclickable(mod3_contents_add);
			mod3_contents_add.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(mod3_contents_add);
			mod3_contents_add.click();
		}
		
	}
	
	public void click_add_plus1() throws InterruptedException
	{
		Abstract_Component abs=new Abstract_Component(driver);
		Thread.sleep(2000);
		abs.waitforelementoclickable(add_plus);
		add_plus.click();
	}
	
	public void add_contents_mod1()
	{
		add_plus.click();
	}
	
	public void click_quiz_add_qsn1()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try
		{
			abs.waitForWebElementToAppear(Add_questions_btn);
			Add_questions_btn.click();
		}catch(StaleElementReferenceException e)
		{
			
			abs.waitForWebElementToAppear(Add_questions_btn);
			Add_questions_btn.click();
		}
		
		
	}
	
	public void click_quiz_ques_btn2()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try
		{
			abs.waitforelementoclickable(quiz_addqsn_btn2);
			quiz_addqsn_btn2.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(quiz_addqsn_btn2);
			quiz_addqsn_btn2.click();
		}
		
	}
	
	public void click_quiz_ques_btn3()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try
		{
			abs.waitforelementoclickable(quiz_addqsn_btn3);
			quiz_addqsn_btn3.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(quiz_addqsn_btn3);
			quiz_addqsn_btn3.click();
		}
	}
	
	public void setup_assignment1() throws InterruptedException
	{	
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			abs.waitforelementoclickable(Setup_assignment_btn);
			Setup_assignment_btn.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(Setup_assignment_btn);
			Setup_assignment_btn.click();
		}
		
	}
	
	public void setup_assignment2() throws InterruptedException 
	{
		
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			abs.waitforelementoclickable(Setup_assignment_btn2);
			Setup_assignment_btn2.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(Setup_assignment_btn2);
			Setup_assignment_btn2.click();
		}
		
	}
	
	public void setup_assignment3()
	{
		Abstract_Component abs=new Abstract_Component(driver);
		try {
			abs.waitforelementoclickable(Setup_assignment_btn3);
			Setup_assignment_btn3.click();
		}catch(StaleElementReferenceException e)
		{
			abs.waitforelementoclickable(Setup_assignment_btn3);
			Setup_assignment_btn3.click();
		}
	}
	
	public void curr_continue()
	{
		Curriculum_cont_btn.click();
	}
	
//	Adding course title, course subtitle, and course description
	public void course_details1(String crse_title, String crse_subtitle, String crse_desc)
	{
		Abstract_Component abs=new Abstract_Component(driver);
		abs.waitForWebElementToAppear(course_title);
		course_title.sendKeys(crse_title);
		
		course_subtitle.sendKeys(crse_subtitle);
		
		course_desc.sendKeys(crse_desc);;
	}
	
	
	public void basic_info(String language, String crse_type, String diff_level, String category, String sub_cat1, String sub_cat2)
	{
		Select s = new Select(language_drp);
		s.selectByVisibleText(language);
		
		Select s1 = new Select(coursetype_drp);
		s1.selectByVisibleText(crse_type);
		
		Select s2 = new Select(diff_level_drp);
		s2.selectByVisibleText(diff_level);
		
		Select s3 = new Select(category_drp);
		s3.selectByVisibleText(category);
		
		Select s4 = new Select(sub_category1_drp);
		s4.selectByVisibleText(sub_cat1);
				
		Select s5 = new Select(sub_category2_drp);
		s5.selectByVisibleText(sub_cat2);
	}
	
	public void upload_crs_video() throws InterruptedException
	{
		course_video_upload.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	 
	
	
	

}
