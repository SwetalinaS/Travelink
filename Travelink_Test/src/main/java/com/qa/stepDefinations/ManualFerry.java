package com.qa.stepDefinations;

import com.qa.pages.ManualFerryPage;

import cucumber.api.java.en.Then;

public class ManualFerry {
	
	ManualFerryPage manualferry = new ManualFerryPage();
	
	@Then("^user creates a manual ferry$")
	public void user_creates_a_manual_ferry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		manualferry.newManualFerry();
	}

	@Then("^user adds the manual ferry basket$")
	public void user_adds_the_manual_ferry_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
