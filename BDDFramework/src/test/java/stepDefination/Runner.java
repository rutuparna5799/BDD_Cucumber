package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Ashutos Sahoo\\eclipse-workspace\\BDDFramework\\src\\test\\resources\\Features\\Login3.feature",
glue = {"stepDefination"},
dryRun = false,
monochrome = true,
plugin = {"pretty","html:target\\Ashutos.html",
		           "json:target\\Ashutos.json"}
)
public class Runner {
}