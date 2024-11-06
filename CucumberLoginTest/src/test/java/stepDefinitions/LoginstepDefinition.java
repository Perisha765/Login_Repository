package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefinition {
	public WebDriver driver;
	public LoginPage Page1;

	@Given("Open Chrome Browser")
	public void open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik Perisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Page1 = new LoginPage(driver);
	  }
	@Given("User opens the URL {string}")
	public void user_opens_the_url(String URL) {
	   driver.get(URL);
	}
	@When("User enters email {string} and password {string}")
	public void user_enters_email_and_password(String emailid, String password) {
	    Page1.setEmail(emailid);
	    Page1.setPassword(password);
	}
	@When("Click on {string} button")
	public void click_on_button(String string) throws InterruptedException {
	    Page1.clickLoginBtn();
	    Thread.sleep(3000);
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
		Thread.sleep(3000);
	   
	}
	@When("User click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	    Page1.clickLogoutLink();
	    Thread.sleep(3000);
	}
	@Then("Close the browser")
	public void close_the_browser() {
	     driver.close();
	}
}
