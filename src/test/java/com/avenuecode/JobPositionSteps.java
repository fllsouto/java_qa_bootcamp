package com.avenuecode;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Then;

import org.openqa.selenium.support.PageFactory;

import com.avenuecode.pages.JobPositionPage;

public class JobPositionSteps {

	@Then("^I should see '([1-9]+[0-9]*)' open positions$")
	public void i_should_see_totalPositions_different_positions(int totalPositions) throws Throwable {
	    JobPositionPage jobPositionPage = PageFactory.initElements(NavigationSteps.driver, JobPositionPage.class);
		assertEquals(totalPositions, jobPositionPage.openPositionQuantity());
	}

}
