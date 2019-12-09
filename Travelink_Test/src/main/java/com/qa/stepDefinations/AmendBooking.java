package com.qa.stepDefinations;

import com.qa.pages.AmendBookingPage;
import com.qa.pages.ExtraSearchPage;
import com.qa.pages.NewBookingPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class AmendBooking extends TestBase{
	
	AmendBookingPage amendBooking;
	ExtraSearchPage extrasearch;
	NewBookingPage newbooking;
	@Then("^user clicks on amend booking$")
	public void user_clicks_on_amend_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		amendBooking = new AmendBookingPage();
		amendBooking.amend();
		
		
	}
	
	@Then("^user proceed ammending$")
	public void user_proceed_ammending() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		
		newbooking = new NewBookingPage();
		newbooking.confirmBooking();
		
	}

}
