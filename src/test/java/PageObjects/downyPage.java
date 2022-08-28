package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class downyPage {
	WebDriver driver;
	public downyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@alt=\"Downy icon\"])")
	WebElement downy;
	
	public WebElement clickOnDowny() {
		
		return downy;
	}
	@FindBy(xpath="(//*[@alt=\"Downy Offers\"])[2]")
	WebElement offers;
	
	public WebElement clickOnOffers()
	{
		return offers;
	}
	@FindBy(xpath="(//*[@class=\"icon-img float-left\"])[3]")
	WebElement login;
	
	public WebElement clickOnlogin3()
	{
		return login;
	}
	
	
	
	@FindBy(id="capture_signIn_signInEmailAddress")
	WebElement email2;
	
	public WebElement clickOnemail2()
	{
		return email2;
	}
	@FindBy(id="capture_signIn_currentPassword")
	WebElement pass;
	
	public WebElement clickOnpassw()
	{
		return pass;
	}
	@FindBy(xpath="(//*[@data-action-detail=\"https://downy.com\"])")
	WebElement signup3;
	
	public WebElement clickOnsignup3()
	{
		return signup3;
	}
}
