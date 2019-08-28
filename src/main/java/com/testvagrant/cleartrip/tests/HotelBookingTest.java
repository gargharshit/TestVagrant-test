package com.testvagrant.cleartrip.tests;

import com.testvagrant.cleartrip.pages.HotelsPage;
import com.testvagrant.cleartrip.utility.CommonUtil;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelBookingTest extends BaseTest {

	@Test
	public void shouldBeAbleToSearchForHotels() {

		// click on hotel link
		HotelsPage hotelsPageObj = homePage.clickHotelsLink();

		// enter locality
		hotelsPageObj.enterLocalityTextBox("Indiranagar, Bangalore");

		// wait for the auto complete options to appear for the origin
		CommonUtil.waitFor(2000);

		// select locality from auto suggestion
		hotelsPageObj.selectLocality();

		// select Travelers option from drop-down
		hotelsPageObj.selectTravellers("1 room, 2 adults");

		// click on hotel search button
		hotelsPageObj.clickSearchHotelsButton();

		// wait for page to load
		CommonUtil.waitFor(5000);

		Assert.assertTrue(
				CommonUtil.isElementPresent(By.xpath("//p/small[text()='Showing hotels around']"), this.driver));

	}

}
