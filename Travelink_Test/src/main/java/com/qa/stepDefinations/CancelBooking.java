package com.qa.stepDefinations;

import com.qa.pages.CancelBookingPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class CancelBooking extends TestBase{
	
	CancelBookingPage cancel = new CancelBookingPage();
	@Then("^user clicks on cancel booking$")
	public void user_clicks_on_cancel_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cancel.CancelBooking();
	}

	@Then("^user confirms cancellation$")
	public void user_confirms_cancellation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cancel.confirmCancellation();
	   
	}

}
