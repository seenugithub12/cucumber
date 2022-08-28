package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sensitivePage {
	
	WebDriver driver;
	public sensitivePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Sensitive")
	WebElement sensitive;
	
	public WebElement clickOnsensitive() {
		
		return sensitive;
	}
	
	@FindBy(xpath="(//*[@data-action-detail=\"Sensitive\"])[2]")
	WebElement sensitive1;
	
	public WebElement clickOnsensitive1() {
		
		return sensitive1;
	}
	
	
			@FindBy(xpath="(//*[@class=\"plp-filter-btn \"])[4]")
			WebElement sensitive2;
			
			public WebElement clickOnsensitive2() {
				
				return sensitive2;
			}
	
	

}
