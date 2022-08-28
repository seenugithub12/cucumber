package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rewardsPage {
	
	
	WebDriver driver;
	public rewardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[@alt=\"P&G Everyday icon\"])")
	WebElement reward;
	
	public WebElement clickOnRewards() {
		
		return reward;
	}
	
	@FindBy(xpath="//*[@id=\"lilo3746-wrapper\"]/div/a")
	WebElement popup1;
	public WebElement pop1()
	{
		return popup1;
	}
	@FindBy(xpath="(//*[@aria-labelledby=\"icon\"])[2]")
	WebElement login;
	public WebElement rewardlogin1()
	{
		return login;
	}
	@FindBy(xpath="(//*[@name=\"signInEmailAddress\"])")
	WebElement email;
	public WebElement rewardemail1()
	{
		return email;
	}
	
	@FindBy(id="login-password")
	WebElement password;
	public WebElement password1()
	{
		return password;
	}
	
	@FindBy(xpath="(//*[@class=\"  submitBtn btn btn-primaryReceipt\"])")
	WebElement signup;
	public WebElement signup1()
	{
		return signup;
	}

}
