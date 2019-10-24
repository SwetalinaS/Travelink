package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class ManualFerryPage extends TestBase {

	public ManualFerryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-sub-link icon icon-port']")
	public WebElement ferries;
	
	@FindBy(xpath = "//a[@class='btn tertiary']")
	public WebElement manualferry;
	
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.outBoundItinerary.departurePortCode']")
	WebElement departurePort;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.outBoundItinerary.arrivalPortCode']")
	WebElement arrivalPort;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.supplierId']")
	WebElement supplier;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.bookingReference']")
	WebElement reference;
	
	@FindBy(xpath = "//select[@ng-model ='vm.manualFerry.fareType']")
	WebElement fareType;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.displayCost']")
	WebElement totalCost;
	
	@FindBy(xpath = "//a[@class='btn secondary marks-up']")
	WebElement markup;
	
	
	@FindBy(xpath = "//button[contains(text(),'Add to Basket')]")
	WebElement createFerry;
	
	@FindBy(xpath = "//input[@id='date-outbound-from']")
	WebElement outBoundTimeFrom;
	
	@FindBy(xpath = "//input[@id='date-outbound-to']")
	WebElement outBoundTimeTo ;
	
	
	public void newManualFerry() throws InterruptedException
	{
		ferries.click();
		Thread.sleep(3000);
		manualferry.click();
		
		departurePort.click();
		departurePort.sendKeys("Cal");
		
		arrivalPort.click();
		arrivalPort.sendKeys("Dov");
		
		outBoundTimeFrom.click();
		outBoundTimeFrom.sendKeys("10/28/19");
		
		Thread.sleep(2000);
		
		outBoundTimeTo.click();
		outBoundTimeTo.sendKeys("10/29/19");
		Thread.sleep(2000);
		
		
		supplier.click();
		supplier.sendKeys("P & O Irish");
		
		Thread.sleep(2000);
			
		reference.click();
		reference.sendKeys("Test");
		
		Thread.sleep(2000);
		
		
		
		Select fare = new Select(fareType);
		fare.selectByIndex(2);
	
		totalCost.click();
		totalCost.clear();
		totalCost.sendKeys("100");
		
		markup.click();
		Thread.sleep(2000);
		createFerry.click();
		
		Thread.sleep(2000);
		
	}

}
