package com.testvagrant.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(linkText = "Flights")
	private WebElement flightLink;

	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;

	@FindBy(linkText = "Your trips")
	private WebElement yourTripsLink;

	@FindBy(id = "SignIn")
	private WebElement signInLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// to click on the flight link
	public FlightsPage clickFlightsLink() {
		this.flightLink.click();
		return PageFactory.initElements(this.driver, FlightsPage.class);
	}

	// to click on the hotel link
	public HotelsPage clickHotelsLink() {
		this.hotelLink.click();
		return PageFactory.initElements(this.driver, HotelsPage.class);
	}

	// to click on the Trip link
	public void clickYourTrips() {
		this.yourTripsLink.click();
	}

	// to click on the Sign-in link
	public SignInPage clickSignIn() {
		this.signInLink.click();
		return PageFactory.initElements(this.driver, SignInPage.class);
	}

}
