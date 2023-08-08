package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep2 {
	protected WebDriver driver;
	public LoginPage login;
	@Given("User launch the Chrome Brwoser")
	public void user_launch_the_chrome_brwoser() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}

	@When("User should launch the URL {string}")
	public void user_should_launch_the_url(String string) {
	  driver.get(string);
	  driver.manage().window().maximize();
	}

	@And("^User enters username as (.*) and password as (.*)$")
	public void user_enters_username_as_standard_user_and_password_as_secret_sauce(String username,String password) throws Exception {
	    login = new LoginPage(driver);
	    login.enterUser(username);;
	    Thread.sleep(2000);
	    login.enterPassword(password);
	}

	@And("Click on Login")
	public void click_on_login() {
	    login.clicklogin();
	}

	@Then("User should be validate text as {string}")
	public void user_should_be_validate_text_as(String string) {
	    login.validate();
	}
	
	@Then("Click on Open Menu bar")
	public void click_on_open_menu_bar() throws Exception {
	   login.clickMenu();
	}

	@And("Click on Logout")
	public void click_on_logout() {
	    login.logout();
	}
}