package StepDefinitions;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import PageObjects.CouponsAndRewardsPage;
import PageObjects.LoginPage;
import PageObjects.PgPage;
import PageObjects.UsPage;
import PageObjects.WhatsNewPage;
import PageObjects.bouncePage;
import PageObjects.clothesPage;
import PageObjects.contactPage;
import PageObjects.downyPage;
import PageObjects.learnMorePage;
import PageObjects.rewardsPage;
import PageObjects.searchPage;
import PageObjects.sensitivePage;
import PageObjects.shopProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utlilities.ExcelData;
import utlilities.ReadConfiguration;
import utlilities.snaps;

public class MainClass {

	WebDriver driver;
	WhatsNewPage wp;
	CouponsAndRewardsPage cp;
	shopProductsPage sp;
	learnMorePage lp;
	PgPage pp;
	clothesPage cpa;
	downyPage dp;
	bouncePage bp;
	LoginPage lpa;
	Actions action;
	rewardsPage rp;
	searchPage search;
	UsPage up;
	contactPage contact;
	sensitivePage sensitive;
	
	ExcelData excel = new ExcelData();
	ReadConfiguration rc = new ReadConfiguration();
	Logger log ;
	//logs = Logger.getLogger("CucumberForCA");
	

	@Given("user launch browser")
	public void user_launch_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1084291\\eclipse-workspace\\CucumberForCA\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 log = Logger.getLogger("CucumberForCA");
		PropertyConfigurator.configure("Log4j.properties");
		log.info("home started succesfully");
		
	}

	@When("user open url")
	public void user_open_url() {
		wp = new WhatsNewPage(driver);
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();

	}

	@When("click on What'sNew")
	public void click_on_what_s_new() throws IOException {
		wp.Whatsnew().click();
		snaps.getScreenshot(driver, "new");
	
		log.info("succesfully clicked on product");
	}

	@When("click on talent")
	public void click_on_talent() throws IOException, Exception {
		wp.Talent().click();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "new");
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
		log.info("browser closed successfully");
	}

	// rewards
	@When("click on coupons and rewards")
	public void click_on_coupons_and_rewards() {
		cp = new CouponsAndRewardsPage(driver);
		cp.CouponsAndRewards();
	}

	@When("click Shop Products")
	public void click_shop_products() throws Exception {
		sp = new shopProductsPage(driver);
		action = new Actions(driver);
		// s action = new Actions(driver);
		// action.moveToElement(R.Resouresr1()).build().perform();
		action.moveToElement(sp.ShopProducts()).build().perform();
		Thread.sleep(3000);
		
		search = new searchPage(driver);
		search.clickOntide().click();
		Thread.sleep(3000);
		sp.ShopProducts().click();
		Thread.sleep(4000);
		//sp.Liquid().click();
		//Thread.sleep(3000);
		sp.clickonbooster().click();
		snaps.getScreenshot(driver, "shop");
		log.info("successfully clicked on shop and products");
		//Thread.sleep(3000);
	}
	//learn more
	@When("click on Learn More")
	public void click_on_learn_more() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		lp = new learnMorePage(driver);
		lp.LearnMore().click();
		snaps.getScreenshot(driver, "shop");
		log.info("successfully clicked on learn more");
		Thread.sleep(3000);

	}

	// pg
	@When("click on P&G")
	public void click_on_p_g() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		pp = new PgPage(driver);
		pp.Pg().click();
		Thread.sleep(3000);
	}

	@When("click on view and report")
	public void click_on_view_and_report() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		pp = new PgPage(driver);
		pp.Pg1().click();
		Thread.sleep(8000);
		snaps.getScreenshot(driver, "pg");
		log.info("succesfully clicked on view the report");
	}

	@When("click on export")
	public void click_on_export() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		pp = new PgPage(driver);
		pp.Pg2().click();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "pg1");
		//log.info("succesfully clicked on product");

	}

	// clothes feature
	@When("click on How to Wash Clothes")
	public void click_on_How_to_Wash_Clothes() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		cpa = new clothesPage(driver);
		action = new Actions(driver);
		action.moveToElement(cpa.HowToWashClothes()).build().perform();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "clothes");
		log.info("successfully clicked on how to wash clothes");
		 //Thread.sleep(3000);
		// cpa.popup().click();
		
		//cpa.HowToWashClothes().click();

	}

	/*@When("click on How to Do Loundry")
	public void click_on_How_to_Do_Loundry() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		cpa = new clothesPage(driver);
		cpa.HowToDoLoundry().click();
		//search = new searchPage(driver);
		//search.clickOntide();

	}*/

	// downy feature
	@When("click on Downy")
	public void click_on_downy() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		dp = new downyPage(driver);
		dp.clickOnDowny().click();
		// Thread.sleep(3000);
		// snaps.getScreenshot(driver, "img");
	}

	@And("click on offers")
	public void click_on_offers() throws Exception {
		dp.clickOnOffers().click();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "downy");
	}

	@When("click on login3")
	public void click_on_login3() throws Exception {
		dp.clickOnlogin3().click();
		Thread.sleep(3000);

	}

	@When("enter email2")
	public void enter_email2() throws Exception {
		dp.clickOnemail2().click();
		Thread.sleep(3000);
		dp.clickOnemail2().sendKeys("seenu.cnu@gmail.com");

	}

	@When("enter password2")
	public void enter_password2() throws Exception {
		dp.clickOnpassw().click();
		Thread.sleep(3000);
		dp.clickOnpassw().sendKeys("Seenu@12");

	}

	@When("click on signup3")
	public void click_on_signup3() throws Exception {
		dp.clickOnsignup3().click();
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "downy2");
		log.info("successfully clicked on all testcase for downy page");

	}

	// bounce feature
	@When("click on bounce")
	public void click_on_bounce() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		bp = new bouncePage(driver);
		bp.clickOnBounce().click();
		Thread.sleep(3000);
		// snaps.getScreenshot(driver, "CA");
	}
		//shop and product
	@When("click on product")
	public void click_on_product() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		bp = new bouncePage(driver);
		bp.clickOnProduct().click();
		snaps.getScreenshot(driver, "CA");
		log.info("succesfully clicked on product");
		Thread.sleep(3000);
	}

	// Register testcase
	@When("click on Register")
	public void click_on_register() throws Exception {
		lpa = new LoginPage(driver);
		lpa.clickOnRegister().click();
		snaps.getScreenshot(driver, "signup");
		//Thread.sleep(3000);

	}

	@When("click on signupPage")
	public void click_on_signup_page() throws Exception {
		lpa.clickOnSignup().click();
		// JavascriptExecutor jsn = (JavascriptExecutor)driver;
		// jsn.executeScript("window.scrollBy(0,600)");
		
		
		log.info("succesfully clicked on signup page");
		Thread.sleep(3000);
		
		
	}

	
		

	

	@When("click on create account")
	public void click_on_create_account() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		lpa.clickOnsignup1().click();
		Thread.sleep(3000);
	}

	@When("click on coupons and rewards1")
	public void click_on_coupons_and_rewards1() throws Exception {
		rp = new rewardsPage(driver);
		search = new searchPage(driver);
		search.clickOntide().click();
		rp.clickOnRewards().click();
		Thread.sleep(3000);
		
		
	}

	@When("click on login")
	public void click_on_login() throws IOException, Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		rp = new rewardsPage(driver);
		rp.clickOnRewards().click();
		snaps.getScreenshot(driver, "reward");
		log.info("successfully clicke don login button");
		Thread.sleep(3000);
		

	}

	/*@When("enter email")
	public void enter_email() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		rp.rewardemail1().click();
		rp.rewardemail1().sendKeys("seenu@gmail.com");
	}

	@When("enter password")
	public void enter_password() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		rp.password1().click();
		rp.password1().sendKeys("Seenu@123");
	}

	@When("click on signin")
	public void click_on_signin() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		rp.signup1().click();
	}*/

	// search

	@When("click on search")
	public void click_on_search() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		search = new searchPage(driver);
		search.clickOnsearch().click();

	}

	@When("enter washinhmachine")
	public void enter_washinhmachine() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		search.clickOnsearch().sendKeys(excel.getStringData(0, 0, 0));
		Thread.sleep(3000);
		snaps.getScreenshot(driver, "excel");
	}

	@When("click on tide")
	public void click_on_tide() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		// driver.switchTo().frame(search.Switch());
		search.clickOntide().click();

		Thread.sleep(3000);
	}
	/*
	 * @When("click on enter") public void click_on_enter() throws Exception { //
	 * Write code here that turns the phrase above into concrete actions //throw new
	 * io.cucumber.java.PendingException();
	 * //driver.switchTo().frame(search.Switch()); search.clickonenter().click();
	 * 
	 * Thread.sleep(3000); }
	 */

	@When("click on tide1")
	public void click_on_tide1() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		// driver.switchTo().frame(search.Switch());
		search.clickontide1().click();
		log.info("successfully getting the data from excel sheet");

		Thread.sleep(3000);

	}
	//us
	
	@When("click on US")
	public void click_on_US() throws Exception {
	   
		up=new UsPage(driver);
		//search = new searchPage(driver);
		//search.clickOntide().click();
		//up.clickonpop().click();
		up.clickonUS().click();
		//driver.getWindowHandle();
		//up.clickonpop().click();
		Thread.sleep(5000);
		log.info("successfully clicked on us page");
		snaps.getScreenshot(driver, "uspage");
		Thread.sleep(5000);
		
		
	}
	/*@When("click on french")
	public void click_on_french() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		up.clickonUS1().click();
	}
	@When("click on plus")
	public void click_on_plus() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		up.clickonUS2().click();
	}*/
	
	//contact
	@When("click on contact")
	public void click_on_contact() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		contact = new contactPage(driver);
		contact.clickOncontact().click();
		Thread.sleep(3000);
		//contact.clickoncontactpop().click();
		//Thread.sleep(3000);
		snaps.getScreenshot(driver, "contact");
		log.info("successfully clicked on contactus");
	}
	/*@When("click on chat")
	public void click_on_chat() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		contact.contact1().sendKeys("tide");
	}*/
	
	//scroll down
	@When("scroll down homepage")
	public void scroll_down_homepage() throws Exception 
	{
		JavascriptExecutor jsn = (JavascriptExecutor)driver;
		jsn.executeScript("window.scrollBy(0,4500)","");
		Thread.sleep(5000);
		action = new Actions(driver);
		 sensitive = new sensitivePage(driver);
	    driver.getWindowHandle();
	   action.moveToElement(sensitive.clickOnsensitive1()).build().perform();
	    search = new searchPage(driver);
	   // action.moveToElement(up.clickonpop()).click();
	    search.clickOntide().click();
	    snaps.getScreenshot(driver, "scrolldown");
		log.info("successfully perform scroll down");
		
	    
	}
	@When("click on sensitive")
	public void click_on_sensitive() throws Exception {
	    sensitive = new sensitivePage(driver);
	    
	    sensitive.clickOnsensitive().click();
	    Thread.sleep(3000);
	    sensitive.clickOnsensitive2().click();
	    Thread.sleep(3000);
	    log.info("successfully clicked on machine");
	    
	}


}
