package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)				
@CucumberOptions(features = "src/test/resources/features/",
				glue = {"src/main/java/stepDefinitions/"}, // step def files path
				tags = "@LoginDemo",
				monochrome = true, // displays readable console output
				strict = true, // verifies whether all steps are defined in step_def file or not.
				dryRun = true,// check mapping between feature file and step def file.
				plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
				           "json:target/cucumber-report/cucumber.json",
				           "junit:target/cucumber-report/cucumber.xml"}
)


public class Runner {

}
