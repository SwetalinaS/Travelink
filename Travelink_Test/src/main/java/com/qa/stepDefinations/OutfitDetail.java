package com.qa.stepDefinations;

import com.qa.pages.OutfitDetailPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class OutfitDetail extends TestBase {

	
	OutfitDetailPage newQuote;
	
	@Then("^user enters the outfit details$")
	public void user_Clicks_on_Create_new_quote() throws Throwable {
	   newQuote = new OutfitDetailPage();
	   newQuote.enterOutfitDetails();
		
	}
}
