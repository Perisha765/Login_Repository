package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayHomepage {
	public WebDriver driver;

	public DisplayHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[name()='path'and contains(@fill, 'currentCol')]")
	WebElement label_Cart;
	public void isCartDisplayed()
	{
		label_Cart.isDisplayed();
	}

}
