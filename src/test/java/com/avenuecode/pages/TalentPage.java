package com.avenuecode.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalentPage {
	private static HashMap<String, String> talentHash;
	  static {
	      talentHash = new HashMap<String, String>();
	      talentHash.put("Project Management", "Project-Management");
	      talentHash.put("Business Analysis", "Business-Analysis");
	      talentHash.put("Software Development", "Software-Development");
	      talentHash.put("Quality Assurance", "Quality-Assurance");
	      talentHash.put("Development Operations", "Development-Operations");
	      talentHash.put("Product Management", "Product-Management");
	  }
	  
	  @FindBy(tagName = "body")
	  private WebElement bodyContent;
	  
	  @FindBy(className = "arrow-down")
	  private WebElement navigationArrowStart;
	  
	  @FindBy(className = "body-content-section")
	  WebElement talentBody;

	public void showMore(String talent) {
		WebElement talentGNode = talentBody.findElement(By.id(talentHash.get(talent)));
		WebElement talentArticleNode = talentGNode.findElement(By.xpath("../.."));
		WebElement talentShowMoreNode = talentArticleNode.findElement(By.className("ac-link"));
		talentShowMoreNode.click();
		
	}

	public void navigateToTalents() {
		navigationArrowStart.click();		
	}

	public String isModalOf() {
		WebElement talentModal = bodyContent.findElement(By.cssSelector(".remodal-medium.remodal-is-opened"));
		String talentModalTitle = talentModal.findElement(By.tagName("h2")).getText();
		return talentModalTitle;
	}

}
