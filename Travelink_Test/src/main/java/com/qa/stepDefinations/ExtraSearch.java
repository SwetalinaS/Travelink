package com.qa.stepDefinations;

import com.qa.pages.ExtraSearchPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class ExtraSearch extends TestBase {
	
	
	ExtraSearchPage search ;
	@Then("^user creates a extra search$")
	public void user_creates_a_extra_search() throws Throwable {
	   search = new ExtraSearchPage();
	   search.newExtraQuote();
	}

	
}
