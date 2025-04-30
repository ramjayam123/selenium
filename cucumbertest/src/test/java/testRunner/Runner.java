package testRunner;


import org.testng.annotations.BeforeClass;

import basepack.Baseclass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/test/java/features/login.feature",
		dryRun = false,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		
		monochrome = true
		
		)
public class Runner extends Baseclass{
@BeforeClass
public static void start() {
	browserlaunch();
	
}
}
 



