package com.avenuecode;

import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.AcademyPage;

import cucumber.api.java.en.When;

public class AcademySteps {

	@When("^I click in the '(.+)' for more informations$")
	public void i_click_in_the_course_for_more_informations(String course) throws Throwable {
		AcademyPage academyPage = PageFactory.initElements(NavigationSteps.driver, AcademyPage.class);
		academyPage.clickForMoreInformationsOf(course);
	}

	@When("^I click to register in the '(.+)'$")
	public void i_click_to_register_in_the_Chef_fundamentals(String course) throws Throwable {
		AcademyPage academyPage = PageFactory.initElements(NavigationSteps.driver, AcademyPage.class);
		NavigationSteps.driver.get(academyPage.getContactUrl(course));
		Thread.sleep(1000);
	}

}
