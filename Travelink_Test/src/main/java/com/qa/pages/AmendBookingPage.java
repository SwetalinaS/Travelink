package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AmendBookingPage extends TestBase {
	
	public AmendBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Amend booking')]")
	WebElement amendBtn;
	
	@FindBy(linkText = "Extras")
	WebElement extras;
	
	@FindBy(linkText = "Accom")
	WebElement accom;
	
	@FindBy(xpath = "//input[@ng-model ='vm.search.description']")
	WebElement extradesc;
	
	@FindBy(xpath = "//button[contains(text(),'Search extras')]")
	WebElement searchExtra;
	
	@FindBy(xpath = "//span[contains(text(),'Overseas Site Night Voucher')]")
	WebElement extra;
	
	@FindBy(xpath = "//a[contains(text(),'Proceed')]")
	WebElement proceed;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	WebElement proceedbtn;
	
	OutfitDetailPage util = new OutfitDetailPage();
	//String parentWindow;
	
	public void amend() throws InterruptedException
	{
		String parentWindow = driver.getWindowHandle();
		util.waitForVisibility(amendBtn);
		amendBtn.click();
		

		Thread.sleep(3000);
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    if(!winHandle.equals(parentWindow)) {
		        driver.switchTo().window(winHandle);
		    }
		}
		
		util.waitForVisibility(extras);
		
		extras.click();

		Thread.sleep(6000);
		
		extradesc.sendKeys("Site Night Voucher");
		
		extra.click();
		searchExtra.click();
		
	}
	


}
