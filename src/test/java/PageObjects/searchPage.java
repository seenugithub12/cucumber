package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {

	WebDriver driver;
	public searchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@aria-label=\"Search\"])")
	WebElement search;
	
	public WebElement clickOnsearch() {
		
		return search;
	}
	@FindBy(xpath="(//*[@class=\"lilo3746-iframe\"])")
	WebElement tide;
	@FindBy(xpath="//*[@id=\"lilo3746-wrapper\"]/div/a")
	WebElement popup2;
	
	public WebElement clickOntide()
	{
		
		
		return popup2;
		
	}
	public WebElement Switch()
	{
		return tide;
	}
	
	@FindBy(xpath="(//*[@alt=\"Brand Main Logo\"])")
	WebElement clicktide;
	public WebElement clickontide1()
	{
		return clicktide;
		
	}
	
	/*@FindBy(id="Line")
	WebElement enter;
	public WebElement clickonenter()
	{
		return enter;
		
	}*/
	
	
}



