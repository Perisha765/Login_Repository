package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import PageObjects.DisplayHomepage;
import PageObjects.SauceDemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoSteps {
	public WebDriver driver;
	public SauceDemoPage SaucePage;
	//public DisplayHomepage Homepage;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik Perisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		SaucePage = new SauceDemoPage(driver);
		driver.get("https://www.saucedemo.com/v1/");
	    
	}
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String Username, String Password) {
	    SaucePage.EnterUsername(Username);
	    SaucePage.EnterPassword(Password);
	}
	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
	    SaucePage.clickLoginBtn();
	    Thread.sleep(5000);
	}
	@Then("User is navigated to Homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
	    //Homepage = new DisplayHomepage(driver);
	   // Homepage.isCartDisplayed();
		SaucePage.isCartDisplayed();
	    System.out.println("User is landed on SwagLabs homepage");
	    Thread.sleep(5000);
	}
	@Then("Click on ADD TO CART for selected products")
	public void Click_on_ADD_TO_CART_for_selected_products() throws InterruptedException {
		SaucePage.clickAddToCart();
		Thread.sleep(5000);
	}
	@Then("Click on Cart to see the items added")
	public void Click_on_Cart_to_see_the_items_added() throws InterruptedException {
		SaucePage.addedCartItems();
		Thread.sleep(5000);
	
	}	
	@Then("Click on Checkout")
	public void Click_on_Checkout() throws InterruptedException {
		SaucePage.checkout();
		Thread.sleep(5000);
		
	}
	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException {
	    driver.close();
	    Thread.sleep(3000);
	}
}
