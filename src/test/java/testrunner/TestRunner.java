package testrunner;

import org.junit.runner.RunWith;
//import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\yourlogo\\yourlogo.feature",
		glue = "steps",
		monochrome =true,
		tags = {"@Test1"},
		plugin= {"pretty","html:test-output"}
		)



public class TestRunner {

}
