package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		
		features = {"src\\test\\resources\\applicationfeature\\Profile.feature"},
		glue = {"steps", "hooks"},
	//	publish = true,
		tags = "@sanity or @regression AND @functional" ,
		plugin = {"pretty"},
		dryRun = true
		)
public class ProfileRunnerClass extends AbstractTestNGCucumberTests{

}

