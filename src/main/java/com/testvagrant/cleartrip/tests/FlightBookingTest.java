package com.testvagrant.cleartrip.tests;

import com.testvagrant.cleartrip.pages.FlightsPage;
import com.testvagrant.cleartrip.utility.CommonUtil;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightBookingTest extends BaseTest {

	@Test
	public void testThatResultsAppearForAOneWayJourney() {

		// click in flight link
		FlightsPage flightPageObj = homePage.clickFlightsLink();

		// select oneWay option
		flightPageObj.clickOneWayButton();

		// enter origin city
		flightPageObj.enterOriginCity("Bangalore");

		// wait for the auto complete options to appear for the origin
		CommonUtil.waitFor(2000);

		// select origin city from auto suggestion
		flightPageObj.selectOriginCity();

		// enter destination city
		flightPageObj.enterDestinationCity("Delhi");

		// wait for the auto complete options to appear for the destination
		CommonUtil.waitFor(2000);

		// select the first item from the destination auto complete list
		flightPageObj.selectDestinationCity();

		// select date
		flightPageObj.selectDate();

		// all fields filled in. Now click on search
		flightPageObj.clickSearchFlightButton();

		CommonUtil.waitFor(5000);

		// verify that result appears for the provided journey search
		Assert.assertTrue(CommonUtil.isElementPresent(By.className("searchSummary"), this.driver));

	}

}
