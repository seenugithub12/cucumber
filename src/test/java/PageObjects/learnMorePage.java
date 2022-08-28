package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class learnMorePage 

{
	
	WebDriver driver;
	public learnMorePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@data-action-detail=\"Learn More\"])[3]")
	WebElement learn;
	
	public WebElement LearnMore()
	{
		
		return learn;

	}
}
