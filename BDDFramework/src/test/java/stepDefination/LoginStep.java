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

public class LoginStep {
	public WebDriver driver;
	@Given("User is in login page")
   public void user_is_in_login_page() {
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	String url = "https://www.saucedemo.com/";
	driver.get(url);
	driver.manage().window().maximize();
	}
	@When("User enter the username and password")
	public void user_enter_the_username_and_password() throws InterruptedException {
	  WebElement usr = driver.findElement(By.name("user-name"));
	  usr.sendKeys("standard_user");
	  Thread.sleep(4000);
	  WebElement pwd = driver.findElement(By.name("password"));
	  pwd.sendKeys("secret_sauce");
	  Thread.sleep(4000);
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
	   WebElement loginbtn = driver.findElement(By.name("login-button"));
	   Thread.sleep(3000);
	   loginbtn.click();
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	    WebElement hp = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	    System.out.println(hp.getText());
	    Thread.sleep(2000);
	    String ctext = hp.getText();
	    String etext = "Swag Labs";
	    if(ctext.equals(etext)) {
	    	System.out.println("Validation Correct");
	    }
	    else {
	    	System.out.println("Validation Incorrect");
	    }
	}
	@Then("user able to logout from that page")
	public void user_able_to_logout_from_that_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About']")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
    }
}
