package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		
		features = {"src\\test\\resources\\applicationfeature\\Orders.feature"},
		glue = {"steps"},
		publish = true,
		plugin = "pretty"
		)



public class OrdersRunnerClass extends AbstractTestNGCucumberTests{

}
