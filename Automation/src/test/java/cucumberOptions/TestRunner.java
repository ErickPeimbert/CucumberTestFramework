package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// it searches for the feature file. you have to pass the feature file and filestep definition, It will trigger that feature file execution
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinition",
		 stepNotifications = true,
		 tags= "@SmokeTest1"
		//make sure both have the same parent
		)
	

public class TestRunner {
	
}


