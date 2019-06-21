package com.qa.stepDefinations;

import com.qa.pages.ExtraSearchPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class ExtraSearch extends TestBase {
	
	
	ExtraSearchPage search ;
	@Then("^user creates a extra search$")
	public void user_creates_a_extra_search() throws Throwable {
	   
	   search.newExtraQuote();
	}

	@Then("^user adds the extra to the basket$")
	public void user_adds_the_extra_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
