package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clothesPage 

{
	WebDriver driver;
	public clothesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@data-action-detail=\"How to Wash Clothes\"])")
	WebElement clothes;
	
	public WebElement HowToWashClothes() 
	{
		
		return clothes;
	}
	/*@FindBy(xpath="(//*[@style=\"color: rgb(240, 77, 36);\"])")
	WebElement pop;
	public WebElement popup()
	{
		return pop;
	}*/
	
	
	@FindBy(xpath="(//*[@loading=\"lazy\"])[3]")
	WebElement loundry;
	
	public WebElement HowToDoLoundry()
	{
		return loundry;
	}
}
