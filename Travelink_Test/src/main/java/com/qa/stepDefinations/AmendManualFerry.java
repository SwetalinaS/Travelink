package com.qa.stepDefinations;

import com.qa.pages.AmendManualFerryPage;

import cucumber.api.java.en.Then;

public class AmendManualFerry {

	AmendManualFerryPage amendmanualferry = new AmendManualFerryPage();
	
	
	@Then("^user clicks on Amend Manual Ferry$")
	public void user_clicks_on_Amend_Manual_Ferry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		amendmanualferry.amendManualFerry();
		amendmanualferry.amendOutfit();
		amendmanualferry.amendTowing();
		amendmanualferry.amendAccommodation();
		amendmanualferry.amendExtra();
		amendmanualferry.amendCrossing();
		amendmanualferry.removeFerry();
	}
}
