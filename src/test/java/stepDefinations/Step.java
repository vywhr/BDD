package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.LoginPage;


    

public class Step {
	
	public WebDriver driver;
    public LoginPage lp;
   
	@Given("user launched chrome browser")
	public void user_launched_chrome_browser() {
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers/chromedriver-win64/chromedriver.exe");
     driver= new ChromeDriver();
     lp= new LoginPage(driver);
    
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String uname, String psword) {
		lp.setUserName(uname);
		lp.setPassword(psword);
		
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		lp.submit();
		
	}

	@Then("page tiltle should be {string}")
	public void page_tiltle_should_be(String title) {

		Assert.assertEquals(title, driver.getTitle());
		
	}

	@Then("user close browser.")
	public void user_close_browser() {
		driver.quit();
	}

	
	}
	
	
	
	
	
	
	
	
	

