package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Register")
	WebElement login;
	
	public WebElement clickOnRegister() {
		
		return login;
	}
	@FindBy(linkText="Sign up now")
	WebElement signup;
	public WebElement clickOnSignup()
	{
		return signup;
	}
	
	@FindBy(id="name")
	WebElement login1;
	public WebElement clickOnlogin1()
	{
		return login1;
	}
	
	@FindBy(id="email")
	WebElement email;
	public WebElement clickOnemail()
	{
		return email;
	}
	
	@FindBy(id="password")
	WebElement password;
	public WebElement clickOnpassword()
	{
		return password;
	}
	
	
	@FindBy(xpath="(//*[@value=\"CREATE ACCOUNT\"])")
	WebElement Register;
	public WebElement clickOnsignup1()
	{
		return Register;
	}
	
	
	

}
