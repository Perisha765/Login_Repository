package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id = "Email")
WebElement txtemail;

@FindBy(name = "Password")
WebElement txtpassword;

@FindBy(css = "button.button-1.login-button")
WebElement loginBtn;

@FindBy(linkText = "Logout")
WebElement logoutLink;

public void setEmail(String emailid) {
	txtemail.clear();
	txtemail.sendKeys(emailid);
}
	
public void setPassword(String password) {
	txtpassword.clear();
	txtpassword.sendKeys(password);
}
public void clickLoginBtn() {
	loginBtn.click();
}
public void clickLogoutLink() {
	logoutLink.click();
}
}