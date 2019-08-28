package com.testvagrant.cleartrip.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelsPage {

	private WebDriver driver;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(xpath = "//ul[@id='ui-id-1']/li")
	private List<WebElement> localityOptions;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchHotelButton;

	public HotelsPage(WebDriver driver) {
		this.driver = driver;
	}

	//to enter locality
	public void enterLocalityTextBox(String localityText) {
		this.localityTextBox.clear();
		this.localityTextBox.sendKeys(localityText);
	}

	//to select locality based on auto suggestion
	public void selectLocality() {
		this.localityOptions.get(1).click();
	}

	//to select Travellers from the drop-sown
	public void selectTravellers(String travellerSelection) {
		Select travellersOption = new Select(this.travellerSelection);
		travellersOption.selectByVisibleText(travellerSelection);
	}

	//to click on the Search hotel button
	public void clickSearchHotelsButton() {
		this.searchHotelButton.click();
	}

}
