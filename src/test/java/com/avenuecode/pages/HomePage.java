package com.avenuecode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(className = "arrow-down")
	private WebElement navigationArrowStart;
	
	@FindBy(className = "careers-div")
	private WebElement careerContent;

	@FindBy(className = "talent-div")
	private WebElement talentContent;

	@FindBy(className = "cd-next")
	private WebElement navigationArrowNext;
	
	@FindBy(className = "ac-academy-home-button")
	private WebElement academyContent;
	
	@FindBy(tagName = "body")
	private WebElement bodyContent;
	
	public void navigateToCarrersPage(){
		navigationArrowStart.click();
		careerContent.click();
	}

	public void navigateToAcademyPage()  throws Throwable{
		navigationArrowStart.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		Thread.sleep(1000);
		academyContent.click();
	}

	public void navigateToTalentPage() throws Throwable {
		navigationArrowStart.click();
		navigationArrowNext.click();
		Thread.sleep(1000);
		talentContent.click();
		
	}
	
	public void navigateToContactPage() throws Throwable {
		navigationArrowStart.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		navigationArrowNext.click();
		Thread.sleep(1000);
		WebElement footerContent = bodyContent.findElement(By.className("footer-bg"));
		footerContent.findElement(By.className("home-page-contact-link")).click();
	}

}
