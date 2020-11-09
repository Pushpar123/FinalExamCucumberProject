package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBluePage {
	
	WebDriver driver;
	public SkyBluePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]") WebElement CLICK_FOR_COLOR_CHANGE;
		
		//Interactive Methods
		public void Clickforcolorchange() {
			CLICK_FOR_COLOR_CHANGE.click();
			
		}
		
}
