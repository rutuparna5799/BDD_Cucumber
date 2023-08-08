package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep1 {
	public WebDriver driver;
	
	@Given("User is in login home page")
	public void user_is_in_login_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@When("^User enter the valid (.*) and valid (.*)$")
	public void user_enter_the_valid_username_and_valid_password(String username,String password) throws Exception {
		WebElement usr = driver.findElement(By.name("user-name"));
		usr.sendKeys(username);
		Thread.sleep(1000);
		usr.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		Thread.sleep(1000);
		pwd.sendKeys(Keys.TAB);
	}

	@And("User click on login button")
	public void user_click_on_login_button() throws Exception {
		WebElement loginbtn = driver.findElement(By.name("login-button"));
		loginbtn.click();
		Thread.sleep(1000);
		WebElement validateText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if(validateText.isDisplayed()) {
			System.out.println("Displayed Successfully");
		}
		else {
			System.out.println("Displayed Unsuccessfully");
		}
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		WebElement burgermenu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		if(burgermenu.isDisplayed()) {
			burgermenu.click();
			System.out.println("Clicked Successfully");
		}
		else {
			System.out.println("Clicked Unsuccessfully");
		}
	}

	@Then("User able to click logout button in home page")
	public void user_able_to_click_logout_button_in_home_page() {
		WebElement about = driver.findElement(By.xpath("//a[text()='About']"));
		if(about.isDisplayed()) {
			System.out.println("Displayed Successfully");
			about.sendKeys(Keys.DOWN);
		}
		else {
			System.out.println("Displayed Unsuccessfully");
		}	
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		if(logout.getText().contains("Logout")) {
			logout.click();
			System.out.println("Clicked Successfully");
		}
		else {
			System.out.println("Clicked Unsuccessfully");
		}
	}
}