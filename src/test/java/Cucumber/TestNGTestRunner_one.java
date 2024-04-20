package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/CucumberFeatures/Admin_subscription.feature", glue={"CucumberDefinitions","Hooks"},
monochrome=true)
public class TestNGTestRunner_one extends AbstractTestNGCucumberTests {
	
	

}
