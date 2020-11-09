package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyWhitePage {
	
	WebDriver driver;
	public SkyWhitePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]") WebElement CLICK_FOR_WHITE_COLOR_CHANGE;
		
		//Interactive Methods
		public void Clickforwhitecolorchange() {
			CLICK_FOR_WHITE_COLOR_CHANGE.click();
			
		}

}
