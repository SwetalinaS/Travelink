package com.qa.stepDefinations;

import com.qa.pages.CreateFerryPage;
import com.qa.pages.HomePage;
import com.qa.pages.QuotePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class NewQuote extends TestBase{
	
	HomePage homePage;
	NewQuote quotePage;
	QuotePage newQuote;
	CreateFerryPage newFerry;
	
	@Then("^user Clicks on Create new$")
	public void user_Clicks_on_Create_new() throws Throwable {
		homePage = new HomePage();
		quotePage= homePage.newQuote();
	}

	@Then("^user enters the outfit details$")
	public void user_Clicks_on_Create_new_quote() throws Throwable {
	   newQuote = new QuotePage();
	   newQuote.enterOutfitDetails();
		
	}

	@Then("^user creates a ferry search$")
	public void user_creates_a_ferry_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		newFerry = new CreateFerryPage();
		newFerry.newFerryQuote();
	    
	}

	@Then("^user adds the ferry to the basket$")
	public void user_adds_the_ferry_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
