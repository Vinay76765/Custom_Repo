package Hooks;


import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import VinayKumar.TestComponents.Base_Test;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class hooksclass {
	
	WebDriver driver;
	
	Base_Test base=new Base_Test();
	
	
	@Before
	public void init() throws IOException {
		driver=base.initializer();
		
	}
	
	@After(order = 1)
	public void takeScraenshotOnFailure(Scenario scenario) {

		if (scenario.isFailed()) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(src));
		}

		}
	
	
	
	@After(order = 0)
	public void close() {
		driver.close();
	}
}
