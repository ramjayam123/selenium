package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/test/java/features/MakeMyTrip.feature"},
		dryRun =!true,
		glue = "steps/MakeMyTrip_step",
	   //snippets = SnippetType.CAMELCASE,
	   
		monochrome = true
				
		
		)
public class MakeMyTrip_runner extends AbstractTestNGCucumberTests {

	
}
