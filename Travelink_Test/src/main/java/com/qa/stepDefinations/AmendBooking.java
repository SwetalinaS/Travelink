package com.qa.stepDefinations;

import com.qa.pages.AmendBookingPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class AmendBooking extends TestBase{
	
	AmendBookingPage amendBooking;
	@Then("^user clicks on amend booking$")
	public void user_clicks_on_amend_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		amendBooking = new AmendBookingPage();
		amendBooking.amend();
	}
	
	@Then("^user clicks on Extra$")
	public void user_clicks_on_Extra() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		amendBooking.clickExtras();
	}

}
