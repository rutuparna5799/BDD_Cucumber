package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	
	//Declaration
	private By user=By.name("user-name");
	private By pwd=By.name("password");
	private By loginbtn=By.name("login-button");
	private By validateText=By.xpath("//div[text()='Swag Labs']");
	private By burgermenu=By.xpath("//button[text()='Open Menu']");
	private By about=By.xpath("//a[text()='About']");
	private By logout=By.xpath("//a[text()='Logout']");
	
	//Initialization
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterUser(String uname) {
		driver.findElement(user).sendKeys(uname);
		driver.findElement(user).sendKeys(Keys.TAB);
	}
	public void enterPassword(String pass) {
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(pwd).sendKeys(Keys.TAB);
	}
	public void clicklogin() {
		driver.findElement(loginbtn).click();
	}
	public void validate() {
		if(driver.findElement(validateText).isDisplayed()) {
			System.out.println("Validated Successfully");
		}
		else {
			System.out.println("Validated Unsuccessfully");
		}
	}
	public void clickMenu() throws Exception {
		driver.findElement(burgermenu).click();
		Thread.sleep(2000);
		driver.findElement(about).sendKeys(Keys.DOWN);
	}
	public void logout() {
		driver.findElement(logout).click();
	}
}