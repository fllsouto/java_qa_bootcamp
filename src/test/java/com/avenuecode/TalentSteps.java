package com.avenuecode;

import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.*;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class TalentSteps {

	@When("^I select a specific Talent$")
	public void i_select_a_specific_Talent_talent() throws Throwable {
		TalentPage talentPage = PageFactory.initElements(NavigationSteps.driver, TalentPage.class);
		talentPage.navigateToTalents();
	}

	@When("^I click in 'Show more' information of '(.+)'$")
	public void i_click_in_Show_more_information(String talent) throws Throwable {
		TalentPage talentPage = PageFactory.initElements(NavigationSteps.driver, TalentPage.class);
		talentPage.showMore(talent);
		Thread.sleep(2000);
	}

	@Then("^I should see a window with more informations about '(.+)'$")
	public void i_should_see_a_window_with_more_informations_about_talent(String talent) throws Throwable {
		TalentPage talentPage = PageFactory.initElements(NavigationSteps.driver, TalentPage.class);
		assertEquals(talentPage.isModalOf(), talent);
	}

}
