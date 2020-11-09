package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBluePage;
import page.SkyWhitePage;
import util.BrowserFactory;

public class StepDef {
	WebDriver driver;
	SkyBluePage skybluepage;
	SkyWhitePage skywhite;
	
	@Before 
	public void BeforeRun() {
		driver = BrowserFactory.startBrowser();
		skybluepage = PageFactory.initElements(driver, SkyBluePage.class);
		skywhite = PageFactory.initElements(driver, SkyWhitePage.class);
	
	
	}
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		driver.get("https://techfios.com/test/101/");
		
	}
	
	
	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		skybluepage.Clickforcolorchange(); 
	    
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	    
	   
	}
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		driver.get("https://techfios.com/test/101/");   
	}

	@When("^I click on the button skyWhite$")
	public void i_click_on_the_button_skyWhite() throws Throwable {
		skywhite.Clickforwhitecolorchange();
	}

	@Then("^the background color will change to sky white$")
	public void the_background_color_will_change_to_sky_white() throws Throwable {
	   
	}
	@After
	public void AfterRun() throws InterruptedException
	{
		driver.close();
		driver.quit();
		Thread.sleep(9000);
	}	




}
