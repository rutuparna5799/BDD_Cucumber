package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Ashutos Sahoo\\eclipse-workspace\\BDDFramework\\src\\test\\resources\\Features\\Login1.feature",
glue = {"stepDefination"},
monochrome = true,
plugin = {"pretty","json:target\\Ashu.html"})
public class TestRunner1 {

}