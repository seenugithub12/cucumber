package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsNewPage 

{
	WebDriver driver;
	public WhatsNewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@data-action-detail=\"What’s New\"])")
	WebElement New;
	
	public WebElement Whatsnew() {
		
		return New;
	}
	
	
			@FindBy(xpath="(//*[@data-action-detail=\"Learn More\"])[1]")
			WebElement talent;
			
			public WebElement Talent() {
				
				return talent;
			}
}
