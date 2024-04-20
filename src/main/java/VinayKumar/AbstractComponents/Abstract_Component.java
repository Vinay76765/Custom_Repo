package VinayKumar.AbstractComponents;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract_Component {
	
    public WebDriver driver;
	public Abstract_Component(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='toast-body']")
	WebElement Toast;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement Email;
	
	@FindBy(xpath ="//input[@formcontrolname='password']")
	WebElement passcode;
	
	@FindBy(xpath ="//button[normalize-space()='SIGN IN']")
	WebElement login_btn;
	
	@FindBy(xpath ="//input[@formcontrolname='siginEmail']")
	WebElement Email_user;
	
	@FindBy(xpath ="//input[@formcontrolname='loginPassword']")
	WebElement passcode_user;
	
	@FindBy(xpath="//button[.='Pay']")
	WebElement pay_frame_btn;
	
	@FindBy(xpath ="//button[.='Sign in']")
	WebElement Sign_in_user;
	
	@FindBy(xpath="//input[@id='cardnumber']")
	WebElement Cardnum;
	
	@FindBy(xpath="//input[@id='expiry']")
	WebElement expirynum;
	
	@FindBy(xpath="//input[@id='cvv']")
	WebElement cvvnum;
	
	@FindBy(xpath="//div[@class='payment__form']//button")
	WebElement pay_btn;
	
	@FindBy(xpath="//button[.='Proceed']")
	WebElement Proceed_btn;
	
	@FindBy(xpath="//input[@id='fake_otp']")
	WebElement Fake_Otp;
	
	@FindBy(xpath="//button[@id='mocksubmit']")
	WebElement Submit_Otp;
	
	@FindBy(xpath="//button[normalize-space()='Create course']")
	WebElement Create_course_btn;
	
	
	
	public void waitForWebElementToAppear(WebElement By) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(By));
		

	}
	
	public void waitForWebElementToAppear(List<WebElement> findBy) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfAllElements(findBy));

	}
	
	public void waitforelementoclickable(WebElement By)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(By));
	}
	
	public void click_side_menu(String s_menu)
	{
		
		driver.findElement(By.xpath("//ul[@id='accordionSidebar']//span[.='"+s_menu+"']")).click();
	}
	
	public String Login_message() {
		
		waitForWebElementToAppear(Toast);
		return Toast.getText();
	}
	
	
	public void adminlogin()
	{
		Email.sendKeys("admin@itwinetech.com");
		passcode.sendKeys("1234");
		login_btn.click();
	}
	
	public void goTo_User()
	{
		driver.get("http://64.227.160.66/upskhill/#/login");
	}
	
	public void goTo_admin()
	{
		driver.get("http://64.227.160.66/upskhill-admin/#/home");
	}
	
	public void click_menu(String menu)
	{
		
		driver.findElement(By.xpath("//li[@class='nav-item dropdown']//a//span[.='"+menu+"']")).click();
	}
	
	public void Click_submenu(String Submenu)
	{
		driver.findElement(By.xpath("//li[@class='nav-item show dropdown']//a[.='"+Submenu+"']")).click();
	}
	
	public void login_user(String username, String password)
	{
		Email_user.sendKeys(username);
		passcode_user.sendKeys(password);
		Sign_in_user.click();
	}
	
	public void click_pay()
	{	
		waitforelementoclickable(pay_frame_btn);
		pay_frame_btn.click();
	}
	
	public void Card_pay(String card, String expiry,int cvv) throws Exception {
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		
		waitForWebElementToAppear(Cardnum);
		Cardnum.sendKeys(card);
		
		expirynum.sendKeys(""+expiry.charAt(0));
		expirynum.sendKeys(""+expiry.charAt(1));
		expirynum.sendKeys(""+expiry.charAt(2));
		expirynum.sendKeys(""+expiry.charAt(3));
		
		System.out.println(expirynum.getCssValue("value"));
		cvvnum.sendKeys(Integer.toString(cvv));
		pay_btn.click();
		String parent=driver.getWindowHandle();
		waitForWebElementToAppear(Proceed_btn);
		Proceed_btn.click();
		Thread.sleep(2000);
		
		//Getting window handles
		Set<String> abc = driver.getWindowHandles();
		Iterator <String> it = abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
		}
		////
		//gfhtfhgfhfhg
		Fake_Otp.sendKeys("12345");
		Submit_Otp.click();
		driver.switchTo().parentFrame();
//		Create_course_btn.isEnabled();
		////gfsgdfshgsdha
		////676786767673682376$@#$@#$@#$
		
		
	}
		
	
	}
	


