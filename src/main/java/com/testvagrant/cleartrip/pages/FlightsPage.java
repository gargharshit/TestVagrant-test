package com.testvagrant.cleartrip.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

	private WebDriver driver;

	@FindBy(id = "OneWay")
	private WebElement oneWay;

	@FindBy(id = "FromTag")
	private WebElement originCity;

	@FindBy(xpath = "//ul[@id='ui-id-1']/li")
	private List<WebElement> originOptions;

	@FindBy(id = "ToTag")
	private WebElement destinationCity;

	@FindBy(xpath = "//ul[@id='ui-id-2']/li")
	private List<WebElement> destinationOptions;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div[1]/table/tbody//td")
	private List<WebElement> allDatesOfMonth;

	@FindBy(id = "SearchBtn")
	private WebElement searchFlightButton;

	public FlightsPage(WebDriver driver) {
		this.driver = driver;
	}

	// to click on OneWay radio button if already not selected
	public void clickOneWayButton() {
		if (!(this.oneWay.isSelected())) {
			this.oneWay.click();
		}
	}

	// to enter origin city
	public void enterOriginCity(String originCity) {
		this.originCity.clear();
		this.originCity.sendKeys(originCity);
	}

	// to select the suggested origin city based on input entered
	public void selectOriginCity() {
		this.originOptions.get(0).click();
	}

	// to enter destination city
	public void enterDestinationCity(String destinationCity) {
		this.destinationCity.clear();
		this.destinationCity.sendKeys(destinationCity);
	}

	// to select the suggested destination city based on input entered
	public void selectDestinationCity() {
		this.destinationOptions.get(0).click();
	}

	// to select date
	public void selectDate(String date) {
		for (WebElement dateCell : allDatesOfMonth) {
			if (dateCell.getText().equals(date)) {
				dateCell.click();
				break;
			}
		}
	}

	// to click on search flight button
	public void clickSearchFlightButton() {
		this.searchFlightButton.click();
	}

}
