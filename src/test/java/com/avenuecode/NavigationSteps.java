package com.avenuecode;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.HomePage;

public class NavigationSteps {
	public static WebDriver driver;
	String contactPageUrl = "https://www.avenuecode.com/contact#contact-form";
	String avenueCodeUrl = "https://www.avenuecode.com";

	@Before
	public void start() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Throwable{
    Thread.sleep(500);
		driver.close();
	}

	@Given("^I visit Avenue Code website$")
	public void i_visit_Avenue_Code_website() throws Throwable {
	    driver.get(avenueCodeUrl);
	}
	
	@Given("^I access the 'Academy Page'$")
	public void i_access_the_Academy_Page() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.navigateToAcademyPage();
	    Thread.sleep(1000);
	}
	
	@Given("^I access the 'Talent Page'$")
	public void i_access_the_Talent_Page() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.navigateToTalentPage();
	    Thread.sleep(1000);
	}
	
	@Given("^I access the Contact Page$")
	public void i_access_the_Contact_Page() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.navigateToContactPage();
	    Thread.sleep(1000);
	}
	
	@When("^I access to Careers page$")
	public void i_navigate_to_Careers_page() throws Throwable {
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	    homePage.navigateToCarrersPage();
	    Thread.sleep(1000);
	}
	

	@Then("^I should be in the Contact page$")
	public void i_should_be_in_the_Contact_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), contactPageUrl);
	}

	
}
