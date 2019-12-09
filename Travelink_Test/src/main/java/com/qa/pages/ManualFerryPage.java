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
	
	@FindBy(xpath = "//a[contains(text(),'Manual Ferry')]")
	public WebElement manualferry;
	
	@FindBy(xpath = "//select[@ng-model ='vm.typeOfCrossing']")
	WebElement crossing;
		
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
	
	@FindBy(xpath = "//button[@class='btn secondary marks-up']")
	WebElement markup;
	
	
	@FindBy(xpath = "//button[contains(text(),'Add to Basket')]")
	WebElement createFerry;
	
	@FindBy(xpath = "//input[@id='date-outbound-from']")
	WebElement outBoundTimeFrom;
	
	@FindBy(xpath = "//input[@id='date-outbound-to']")
	WebElement outBoundTimeTo ;
	
	@FindBy(xpath = "//input[@id='date-inbound-from']")
	WebElement inBoundTimeFrom;
	
	@FindBy(xpath = "//input[@id='date-inbound-to']")
	WebElement inBoundTimeTo ;
	
	@FindBy(xpath = "//button[@ng-click ='vm.addManualFacility(0, true, true)']")
	WebElement accom;
	
	@FindBy(xpath = "//input[@ng-model ='accommodation.description']")
	WebElement accomdesc;
	
	@FindBy(xpath = "//input[@ng-model ='accommodation.quantity']")
	WebElement accomquantity;
	
	@FindBy(xpath = "//input[@ng-model ='accommodation.displayCost']")
	WebElement accomcost;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	WebElement remove;
	
	@FindBy(xpath = "//a[contains(text(),'Cancellation Charge')]")
	WebElement cancellationcharge;
	
	public void newManualFerry() throws InterruptedException
	{
		ferries.click();
		Thread.sleep(3000);
		manualferry.click();
		
		Select crossingType = new Select(crossing);
		crossingType.selectByIndex(0);
		
		departurePort.click();
		departurePort.sendKeys("Cal");
		
		arrivalPort.click();
		arrivalPort.sendKeys("Dov");
		
		outBoundTimeFrom.click();
		outBoundTimeFrom.sendKeys("11/28/19");
		
		Thread.sleep(2000);
		
		outBoundTimeTo.click();
		outBoundTimeTo.sendKeys("11/29/19");
		Thread.sleep(2000);
		
	}
	
	public void addToBasket() throws InterruptedException
	{

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
	
	public void removeFerry()  throws InterruptedException
	{
		remove.click();
		Thread.sleep(1000);
		if(cancellationcharge.isDisplayed())
		{
			System.out.print("cancellation charge is been applied");
		}
		
	}
	public void newReturnManualFerry() throws InterruptedException
	{
		ferries.click();
		Thread.sleep(3000);
		manualferry.click();
		
		Select crossingType = new Select(crossing);
		crossingType.selectByIndex(1);
		
		departurePort.click();
		departurePort.sendKeys("Cal");
		
		arrivalPort.click();
		arrivalPort.sendKeys("Dov");
		
		outBoundTimeFrom.click();
		outBoundTimeFrom.sendKeys("11/5/19");
		
		Thread.sleep(2000);
		
		outBoundTimeTo.click();
		outBoundTimeTo.sendKeys("11/7/19");
		Thread.sleep(2000);
		
		accom.click();
		Thread.sleep(2000);
		accomdesc.sendKeys("Club Seat");
		accomquantity.sendKeys("1");
		accomcost.sendKeys("10");
		
		
		inBoundTimeFrom.click();
		inBoundTimeFrom.sendKeys("11/12/19");
		
		Thread.sleep(2000);
		
		
		inBoundTimeTo.click();
		inBoundTimeTo.sendKeys("11/13/19");
		
		Thread.sleep(2000);
		
	
		
	}
}
