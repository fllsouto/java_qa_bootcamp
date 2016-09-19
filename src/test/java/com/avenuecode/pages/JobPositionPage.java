package com.avenuecode.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class JobPositionPage {
	@FindAll({
		@FindBy(className = "job-title-link")
	})
	private List<WebElement> openPositions;
	
	public int openPositionQuantity(){
		return openPositions.size();
	}

}
