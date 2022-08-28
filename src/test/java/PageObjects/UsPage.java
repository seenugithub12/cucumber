package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsPage {
	
	WebDriver driver;
	public UsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "(//*[@width=\"17\"])[1]")
	WebElement us;

	public WebElement clickonUS() {
		return us;

	}
	@FindBy(xpath = "//*[@id=\"lilo3746-wrapper\"]/div/a")
	WebElement pop;

	public WebElement clickonpop() {
		return pop;

	}
	
	

	@FindBy(xpath = "(//*[@alt=\"USA flag\"])[4]")
	WebElement us1;

	public WebElement clickonUS1() {
		return us1;

	}

	@FindBy(xpath = "(//*[@data-action-detail=\"En savoir plus\"])[3]")
	WebElement us2;

	public WebElement clickonUS2() {
		return us2;

	}

}
