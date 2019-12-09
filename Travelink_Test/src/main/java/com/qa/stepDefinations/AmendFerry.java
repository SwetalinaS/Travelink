package com.qa.stepDefinations;


import com.qa.pages.AmendFerryPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class AmendFerry extends TestBase{

	AmendFerryPage amendFerry = new AmendFerryPage();
	@Then("^user clicks on View extras and cabin options$")
	public void user_clicks_on_View_extras_and_cabin_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    amendFerry.viewExtra();
	}
	
	@Then("^user selects the accommodation and enters the quantity$")
	public void user_selects_the_accommodation_and_enters_the_quantity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		amendFerry.updateExtraAccom();
		amendFerry.updateExtra();
	}

	@Then("^user updates the basket$")
	public void user_updates_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		amendFerry.updateBasket();
	}
}
