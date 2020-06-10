package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features="classpath:features/login.feature", 
         glue={"StepDefinition"})

public class TestRunner {
	
	

}
