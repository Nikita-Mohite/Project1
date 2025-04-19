package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\execution"},
		glue = {"execution"},
		tags = "@regression",
		plugin = "pretty"
		)

public class HomePageRunner extends AbstractTestNGCucumberTests {

}
