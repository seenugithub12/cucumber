package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bouncePage 
{
	WebDriver driver;
	public bouncePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@alt=\"Bounce icon\"])")
	WebElement bounce;
	
	public WebElement clickOnBounce() {
		
		return bounce;
	}
	
	@FindBy(xpath="(//*[@data-action-detail=\"Drying 101\"])")
	WebElement product;
	
	public WebElement clickOnProduct()
	{
		return product;
	}

}
