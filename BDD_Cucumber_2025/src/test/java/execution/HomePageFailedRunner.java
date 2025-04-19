package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\execution"},
		glue = {"execution"},
		tags = "@functional",
		plugin = {"pretty", "rerun:target/failedrun.txt"}
		)

public class HomePageFailedRunner extends AbstractTestNGCucumberTests {

}
