package com.avenuecode;

import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.ContactPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ContactSteps {

	@When("I click in the 'Show map' button \"([1-9]+[0-9]*)\" time$")
	public void i_click_in_the_Show_map_button(int amountOfClicks) throws Throwable {
		ContactPage contactPage = PageFactory.initElements(NavigationSteps.driver, ContactPage.class);
		contactPage.clickToShow(amountOfClicks);
		Thread.sleep(1000);
	}

	@Then("^I should '(.+)' the map of a office location$")
	public void i_should_map_visibility_the_map_of_a_office_location(String mapVisibility) throws Throwable {
		ContactPage contactPage = PageFactory.initElements(NavigationSteps.driver, ContactPage.class);
		assertEquals(contactPage.isTheMapVisible(), mapVisibility.equals("see"));
	}
}
