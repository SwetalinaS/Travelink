package com.qa.stepDefinations;

import com.qa.pages.OutfitDetailPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class OutfitDetail extends TestBase {

	
	OutfitDetailPage newQuote = new OutfitDetailPage();;
	
	@Then("^user enters the outfit details$")
	public void user_Clicks_on_Create_new_quote() throws Throwable {
	  
	   newQuote.enterOutfitDetails();
	   
		
	}
	
	@Then("^user enters the towing details$")
	public void user_enters_the_towing_details() throws Throwable {
	   
	   newQuote.enterTowingDetails();
	 
	}
	
	@Then("^user saves the outfit details$")
	public void user_saves_the_outfit_details() throws Throwable {
	  
	   newQuote.saveOutfitDetails();
		
	}
}
