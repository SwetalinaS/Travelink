package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class NewBookingPage extends TestBase {
	
	public NewBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Proceed')]")
	WebElement proceedBooking;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	WebElement proceed;
	
	@FindBy(xpath = "//button[contains(text(),'Book now')]")
	WebElement bookNow;
	
	
	OutfitDetailPage util = new OutfitDetailPage();
	
	
	
	
	
	public void confirmBooking() throws InterruptedException {
		// TODO Auto-generated method stub
		proceedBooking.click();
	   
			Thread.sleep(3000);
		
	    proceed.click();
	    
			Thread.sleep(3000);
		
			bookNow.click();
	}
}
