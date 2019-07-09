package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CancelBookingPage extends TestBase{

	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Cancel booking')]")
	WebElement cancelBooking;
	
	@FindBy(xpath = "//input[@ng-model ='vm.password']")
	WebElement pwd;
	
	@FindBy(xpath = "//input[@ng-model ='vm.cancelBookingCmd.comment']")
	WebElement comment;
	
	
	@FindBy(xpath = "//button[@class='btn negative cancel full close ng-scope ng-isolate-scope']")
	WebElement cancel;
	
	
	OutfitDetailPage util = new OutfitDetailPage();
	public void CancelBooking() {
		
		util.waitForVisibility(cancelBooking);
		cancelBooking.click();
		
		
		
	}
	public void confirmCancellation() throws InterruptedException {
		util.waitForVisibility(pwd);
		pwd.sendKeys("OMEGA");
		
		Thread.sleep(3000);
		util.waitForVisibility(comment);
		comment.sendKeys("test");
		
		util.waitForVisibility(cancel);
		cancel.click();
	}
}
