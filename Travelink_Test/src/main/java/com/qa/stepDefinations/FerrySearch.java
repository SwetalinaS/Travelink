package com.qa.stepDefinations;

import com.qa.pages.FerrySearchPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class FerrySearch extends TestBase{
	
	FerrySearchPage newFerry = new FerrySearchPage();
	
	
	@Then("^user creates a ferry search$")
	public void user_creates_a_ferry_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		newFerry.newFerryQuote();
	    
	}
	
	@Then("^user creates a return ferry search$")
	public void user_creates_a_return_ferry_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		newFerry.newReturnFerryQuote();
	    
	}
}
