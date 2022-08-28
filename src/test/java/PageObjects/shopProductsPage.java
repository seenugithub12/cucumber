package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopProductsPage
{
	WebDriver driver;
	public shopProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@data-action-detail=\"Shop Products\"])")
	WebElement shop;
	
	public WebElement ShopProducts() {
		
		return shop;
	}
	@FindBy(xpath="(//*[@data-action-detail=\"Browse other products\"])")
	WebElement liquid;
	public WebElement Liquid()
	{
		return liquid;
	}
	
	@FindBy(linkText="Laundry Booster")
	WebElement pacs;
	public WebElement clickonbooster()
	{
		return pacs;
	}

}
