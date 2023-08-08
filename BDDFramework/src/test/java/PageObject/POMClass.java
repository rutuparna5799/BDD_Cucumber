package PageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {

	public WebDriver driver;

	//Declaration

	@FindBy(id="user-name")private WebElement uname;
	@FindBy(id="password") private WebElement passwd;
	@FindBy(id="login-button")private WebElement loginbtn;
	@FindBy(xpath="//span[text()='Products']")private WebElement validateprod;
	@FindBy(xpath="//div[text()='Swag Labs']")private WebElement validateSwag;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement clickMenu;
	@FindBy(xpath="//a[text()='About']")private WebElement about;
	@FindBy(xpath="//a[text()='Logout']")private WebElement clickLogout;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")private WebElement clickbag;
	@FindBy(xpath="//button[text()='Add to cart']")private WebElement addtoCart;
	@FindBy(xpath="//div[@class='inventory_details_price']")private WebElement validatePrice;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement validateItem;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement clickCart;
	@FindBy(xpath="//span[text()='Your Cart']")private WebElement validateText;
	@FindBy(xpath="//button[text()='Checkout']")private WebElement clickCheckout;
	@FindBy(name="firstName")private WebElement firstName;
	@FindBy(name="lastName")private WebElement lastName;
	@FindBy(name="postalCode")private WebElement postalCode;
	@FindBy(name="continue")private WebElement clickCont;
	@FindBy(name="finish")private WebElement clickFinish;
	@FindBy(xpath="//h2[text()='Thank you for your order!']")private WebElement validateOrderText;
	@FindBy(xpath="//button[text()='Back Home']")private WebElement backHome;


	//Initialization
	public POMClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Utilization

	public void enterUser(String user) {
		uname.sendKeys(user);
	}

	public void enterPassword(String pass) {
		passwd.sendKeys(pass);
	}

	public void clickLogin() {
		if(loginbtn.isDisplayed()) {
			loginbtn.click();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void validate() {
		if(validateprod.isDisplayed()) {
		System.out.println(validateprod.getText());
		}
		else {
			Assert.assertTrue(false);
		}
		String ctext = validateSwag.getText();
		String etext = "Swag Labs";
		Assert.assertEquals(ctext, etext);
		System.out.println("Statement is Correctly Validated");
	}
	public void addCart() throws Exception {
		clickbag.click();
		Thread.sleep(2000);
		addtoCart.click();
		if(validatePrice.isDisplayed()) {
			System.out.println(validatePrice.getText());
		}
		System.out.println(validateItem.getText());
		Thread.sleep(1500);
		clickCart.click();
		if(validateText.isDisplayed()) {
			System.out.println(validateText.getText());
		}
		clickCheckout.click();
	}
	public void enterName() throws Exception {
		firstName.sendKeys("Ashutos");
		Thread.sleep(2000);
		lastName.sendKeys("Sahoo");
		Thread.sleep(2000);
		postalCode.sendKeys("751018");
		Thread.sleep(1000);
		clickCont.click();
		Thread.sleep(1000);
		clickFinish.click();
		if(validateOrderText.isDisplayed()) {
			System.out.println(validateOrderText.getText());
		}
		backHome.click();
	}
	
	public void logout() throws Exception {
		clickMenu.click();
		Thread.sleep(1000);
		about.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		clickLogout.click();
	}
}
