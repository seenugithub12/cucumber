package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
			
	WebDriver driver;
	public contactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Contact Us")
	WebElement contact;
	
	public WebElement clickOncontact() {
		
		return contact;
	}
	@FindBy(xpath="//*[@id=\"lilo3746-wrapper\"]/div/a")
	WebElement contactpop;
	
	public WebElement clickoncontactpop()
	{
		return contactpop;
	}
	
	@FindBy(className="searchInput")
	WebElement contact1;
	public WebElement contact1()
	
	{
		return contact1;
	}
}
