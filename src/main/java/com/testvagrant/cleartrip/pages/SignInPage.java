package com.testvagrant.cleartrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	private WebDriver driver;

	@FindBy(id = "signInButton")
	private WebElement signInButton;

	@FindBy(id = "errors1")
	private WebElement error1;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		this.driver.switchTo().frame("modal_window");
	}

	// to click on Sign-In button
	public void clickSignInButton() {
		this.signInButton.click();
	}

	// to get error1 text
	public String getError1Text() {
		return this.error1.getText();
	}

}
