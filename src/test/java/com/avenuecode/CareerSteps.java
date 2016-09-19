package com.avenuecode;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.HomePage;
import com.avenuecode.pages.CareerPage;

public class CareerSteps {
	
	@And("^I'm in the Careers page$")
	public void i_at_Careers_page() throws Throwable {
	    HomePage homePage = PageFactory.initElements(NavigationSteps.driver, HomePage.class);
	    homePage.navigateToCarrersPage();
	}
	
	@When("^I click in '(.+)' location$")
	public void i_click_in_location(String location) throws Throwable {
	    CareerPage career = PageFactory.initElements(NavigationSteps.driver, CareerPage.class);
	    career.navigateToJobPositionPage(location);
	}

	@Then("^I should see '([1-9]+[0-9]*)' job locations$")
	public void i_should_see_totalJobLocations_job_locations(int jobLocationAmount) throws Throwable {
	    CareerPage careerPage = PageFactory.initElements(NavigationSteps.driver, CareerPage.class);
	    int currentQuantity = careerPage.cityQuantity();
	    assertEquals(jobLocationAmount, currentQuantity);
	}
}
