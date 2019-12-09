package com.qa.stepDefinations;

import com.qa.pages.ViewFullBasketPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class ViewBasket extends TestBase {

	
	ViewFullBasketPage viewBasket;
	
	@Then("^user adds the ferry to the basket$")
	public void user_adds_the_ferry_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		viewBasket = new ViewFullBasketPage(); 
		viewBasket.newFerryBooking();
	 
	}
	
	@Then("^user adds the accommodation to the basket$")
	public void user_adds_the_accommodation_to_the_basket() throws Throwable {
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
		viewBasket = new ViewFullBasketPage(); 
		viewBasket.newAccomBooking();
	}
	
	
	@Then("^user adds the extra to the basket$")
	public void user_adds_the_extra_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		viewBasket = new ViewFullBasketPage(); 
		viewBasket.newExtraBooking();
	}
	
	@Then("^user clicks on AddComponent$")
	public void user_clicks_on_AddComponent() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    viewBasket.addComponent();
	}

}
