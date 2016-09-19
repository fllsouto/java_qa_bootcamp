package com.avenuecode.pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class CareerPage {
	private static HashMap<String, String> citiesHash;
	static {
		citiesHash = new HashMap<String, String>();
		citiesHash.put("Jacksonville, FL", "city-panel--jv");
		citiesHash.put("New York", "city-panel--ny");
		citiesHash.put("Pittsburgh", "city-panel--pb");
		citiesHash.put("Belo Horizonte", "city-panel--bh");
		citiesHash.put("San Francisco Bay Area", "city-panel--sf");
		citiesHash.put("São Paulo", "city-panel--sp");
	}
	@FindBys({
		@FindBy(className = "city-item")
	})
	private List<WebElement> cityItems;
		
	@FindBy(id = "city-panels")
	private WebElement cities;
	
	public int cityQuantity(){
		int totalCount = cityItems.size();
		return totalCount;
	}

	public void navigateToJobPositionPage(String location) {
		WebElement city = cities.findElement(By.className(citiesHash.get(location)));
		city.findElement(By.className("ac-btn")).click();
	}	
}
