package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		
		features = {"src\\test\\resources\\applicationfeature\\ScenarioOutline.feature"},
		glue = {"steps"},
		publish = true,
		plugin = "pretty"
		)

public class ScenarioOutlineRunnerClass extends AbstractTestNGCucumberTests{

}
