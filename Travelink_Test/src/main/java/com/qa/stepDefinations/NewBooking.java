package com.qa.stepDefinations;

import com.qa.pages.NewBookingPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class NewBooking extends TestBase {
	NewBookingPage newBooking;

	@Then("^user confirms the booking$")
	public void user_confirms_the_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		newBooking = new NewBookingPage();
		newBooking.confirmBooking();
	}
}
