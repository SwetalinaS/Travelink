package com.qa.stepDefinations;

import com.qa.pages.NewQuotePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class NewQuote extends TestBase{
	
	NewQuotePage homePage;
	NewQuote quotePage;
	
	
	
	@Then("^user Clicks on Create new$")
	public void user_Clicks_on_Create_new() throws Throwable {
		homePage = new NewQuotePage();
		quotePage= homePage.newQuote();
	}

	@Then("^enter the number of (\\d+) and number of (\\d+)$")
	public void enter_the_number_of_and_number_of(int adult, int child) throws Throwable {
		homePage.continueQuote(adult,child);
	}
		
}
