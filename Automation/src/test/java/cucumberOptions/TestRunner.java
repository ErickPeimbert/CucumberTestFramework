package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// it searches for the feature file. you have to pass the feature file and filestep definition, It will trigger that feature file execution
@RunWith(Cucumber.class)
@CucumberOptions( //There are many options to run the scenarios
		features = "src/test/java/features",
		glue = "stepDefinition",
		 stepNotifications = true, //how which steps correspond to each scenario
		 tags= "@SmokeTest1", //Use tags to decide which tests to run, separate them with a coma
		//make sure both have the same parent
		 plugin= {"pretty","html:target/cucumber-reports"}, //Generate a report
		 monochrome =true  //better verbose in the console
		 //,dryRun = true //Whether the scenario has steps definitions, It will scan the test cases and tell you if it has steps definitions or not
		)
	

public class TestRunner {
	
}


