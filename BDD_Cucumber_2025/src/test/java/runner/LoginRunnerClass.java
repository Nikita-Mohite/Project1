package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"src\\test\\resources\\applicationfeature\\Login.feature"},
	glue = {"steps"},
	publish = true,
	plugin = "pretty"
)

public class LoginRunnerClass extends AbstractTestNGCucumberTests{

}
