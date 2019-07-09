package com.qa.stepDefinations;

import com.qa.pages.AccommodationSearchPage;
import com.qa.pages.ViewFullBasketPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class AccommodationSearch extends TestBase {

	
	AccommodationSearchPage newAccom = new AccommodationSearchPage();
	ViewFullBasketPage basket;
	
	
	@Then("^user creates a accommodation search$")
	public void user_creates_a_accommodation_search() throws Throwable {
		newAccom.newAccomQuote();
	}
	
	
	
}
