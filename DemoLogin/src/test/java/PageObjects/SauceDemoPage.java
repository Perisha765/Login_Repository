package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {

	public WebDriver driver;

	public SauceDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "user-name")
	WebElement txtUsername;

	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[name()='path'and contains(@fill, 'currentCol')]")
	WebElement label_Cart;

	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[@class='btn_primary btn_inventory']")
	WebElement AddToCart;
	
	//@FindBy(className = "svg-inline--fa fa-shopping-cart fa-w-18 fa-3x")
	@FindBy(xpath="//*[name()='path'and contains(@fill, 'currentColor')]")
	WebElement CartItems;
	
	@FindBy(xpath="//a[@class = 'btn_action checkout_button']")
	WebElement CheckoutBtn;
	
	

	public void EnterUsername(String Username) {
		txtUsername.sendKeys(Username);
	}
		
	public void EnterPassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	
	public void isCartDisplayed(){
		label_Cart.isDisplayed();
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	public void clickAddToCart() {
		AddToCart.click();
	}
	public void addedCartItems() {
		CartItems.click();
	}
	public void checkout() {
		CheckoutBtn.click();
	}
}
