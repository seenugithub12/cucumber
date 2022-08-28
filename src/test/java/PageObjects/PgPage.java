package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgPage

{
	WebDriver driver;

	public PgPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[@alt=\"P&G icon\"])")
	WebElement pg;

	public WebElement Pg() {

		return pg;
	}

	@FindBy(xpath = "(//*[@data-entry-id=\"1VEjnlIyLjei9f0F5aKqi9\"])")
	WebElement pg1;

	public WebElement Pg1() {

		return pg1;
	}

	@FindBy(xpath = "(//*[@data-entry-id=\"C6mhNnS8tOEGQEOqdwa6L\"])")
	WebElement pg2;

	public WebElement Pg2() {

		return pg2;
	}
}
