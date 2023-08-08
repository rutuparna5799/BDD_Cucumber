package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.POMClass;
import io.cucumber.java.en.*;

public class Login4 {
	public WebDriver driver;
	public static POMClass pom;
	
	@Given("User should able to launch browser")
	public void user_should_able_to_launch_browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	   pom = new POMClass(driver);
	}

	@When("User should open the URL {string}")
	public void user_should_open_the_url(String url) {
	    driver.get(url);
	}

	@And("^User enters user as (.*) and pass as (.*)$")
	public void user_enters_user_as_and_pass_as(String username, String password) {
	  pom.enterUser(username);
	  pom.enterPassword(password);
	}

	@And("User clicked on login button successfully")
	public void user_clicked_on_login_button_successfully() {
	    pom.clickLogin();
	}

	@Then("User should validate text as {string} and {string}")
	public void user_should_validate_text_as_and(String string, String string2) throws Exception {
	   pom.validate();
	   Thread.sleep(1000);
	   pom.addCart();
	   Thread.sleep(1000);
	   pom.enterName();
	}

	@And("User should click on menu button to logout")
	public void user_should_click_on_menu_button_to_logout() throws Exception {
	   pom.logout();
	}

}
