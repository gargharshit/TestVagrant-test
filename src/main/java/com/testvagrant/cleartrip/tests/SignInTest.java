package com.testvagrant.cleartrip.tests;

import com.testvagrant.cleartrip.pages.SignInPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		// clicking on Trip link in home page
		homePage.clickYourTrips();

		// clicking on Sign-In link which will open the sign-in frame
		SignInPage signInPageObj = homePage.clickSignIn();

		// clicking on sign-in button
		signInPageObj.clickSignInButton();

		// storig the error text
		String errors1 = signInPageObj.getError1Text();

		Assert.assertTrue(errors1.contains("There were errors in your submission"));

	}

}
