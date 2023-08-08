package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Ashutos Sahoo\\eclipse-workspace\\BDDFramework\\src\\test\\resources\\Features\\Login.feature",
	glue = {"stepDefination"},
	monochrome=true,
	plugin = {"pretty","html:target\\ashu"})
	public class TestRunner {

}