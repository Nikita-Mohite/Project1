package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\LandingPage.feature"}, 
		glue = {"steps"},
		publish = true,
		plugin = "pretty"
		
		)

public class LandingPagerunnerClass extends AbstractTestNGCucumberTests {

}
