package com.avenuecode.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcademyPage {
	private static HashMap<String, String> coursesHash;
	static {
	    coursesHash = new HashMap<String, String>();
	    coursesHash.put("Chef fundamentals", "academy-chef");
	    coursesHash.put("Scrum master certificantion", "academy-scrum");
	    coursesHash.put("Introduction to ATG", "academy-atg");
	    coursesHash.put("Advanced ATG", "academy-atg-adv");
	}
	
	@FindBy(id = "academy-body")
	WebElement academyBody;

	public void clickForMoreInformationsOf(String course) {
		WebElement courseDiv = academyBody.findElement(By.id(coursesHash.get(course)));
		WebElement parentCourseDiv = courseDiv.findElement(By.xpath(".."));
		parentCourseDiv.findElement(By.className("icon-more")).click();		
	}

	public String getContactUrl(String course) {
		WebElement courseDiv = academyBody.findElement(By.id(coursesHash.get(course)));
		return courseDiv.findElement(By.className("ac-btn")).getAttribute("href");
		
	}
}