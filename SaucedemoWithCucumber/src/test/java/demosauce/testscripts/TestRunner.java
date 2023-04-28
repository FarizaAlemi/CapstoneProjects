package demosauce.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= "Features",
		glue    = "demosauce.testscripts"
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
