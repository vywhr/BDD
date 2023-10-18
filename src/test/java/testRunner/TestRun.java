package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features=".//Features/login.feature",
	glue="stepDefinations",
	monochrome=true,
	dryRun=false,
	tags="@test1",
	plugin={"pretty","html:target/target-report"}
		
		
		)


public class TestRun {

	
}
