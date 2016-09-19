package com.avenuecode.pages;

import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	@FindBy(className = "map-link")
	WebElement mapLink;

	@FindBy(className = "carousel-content")
	WebElement carouselContent;

	public void clickToShow(int amountOfClicks) {
		IntStream.rangeClosed(1, amountOfClicks).forEach(i -> mapLink.click());
	}

	public Boolean isTheMapVisible() {
		return currentMapDisplayStatus("block", "none");
	}
	
	public Boolean isTheMapHidden() {
		return currentMapDisplayStatus("none", "block");
	}
	
	private Boolean currentMapDisplayStatus(String iframeDisplayStatus, String mediaDivDisplayStatus) {
		WebElement activeLocationDisplay = carouselContent.findElement(By.cssSelector(".item.active"));
		WebElement mapIframe = activeLocationDisplay.findElement(By.className("iframe-map"));
		WebElement mediaDiv = activeLocationDisplay.findElement(By.className("media-div"));
		return (mapIframe.getCssValue("display").equals(iframeDisplayStatus) && mediaDiv.getCssValue("display").equals(mediaDivDisplayStatus));
	}

}
