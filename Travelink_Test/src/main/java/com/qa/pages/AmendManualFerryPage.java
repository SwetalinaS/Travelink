package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class AmendManualFerryPage extends TestBase{

	
	public AmendManualFerryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Main booking')]")
	WebElement mainbooking;
	
	@FindBy(xpath = "//button[contains(text(),'Amend Manual Ferry')]")
	WebElement amendmanualferry;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.outBoundItinerary.shipName']")
	WebElement shipname;
	
	@FindBy(xpath = "//button[contains(text(),'Amend')]")
	WebElement amend;
	
	@FindBy(xpath = "//button[contains(text(),'Yes - make changes')]")
	WebElement agree;
	
	@FindBy(xpath = "//select[@ng-model ='vm.manualFerry.vehicleType']")
	WebElement vehicle;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.vehicleMake']")
	WebElement vehicleMake;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.vehicleModel']")
	WebElement vehicleModel;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.vehicleRegistration']")
	WebElement vehicleRegistration;
	
	@FindBy(xpath = "//select[@ng-model ='vm.manualFerry.trailerType']")
	WebElement trailer;
	
	@FindBy(xpath = "//select[@ng-model ='vm.manualFerry.trailerLength']")
	WebElement trailerLength;
	
	@FindBy(xpath = "//select[@ng-model ='vm.manualFerry.trailerHeight']")
	WebElement trailerHeight;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.trailerMake']")
	WebElement trailerMake;
	
	@FindBy(xpath = "//input[@ng-model ='vm.manualFerry.trailerModel']")
	WebElement trailerModel;
	
	@FindBy(xpath = "//button[@ng-click ='vm.addManualFacility(0, true, true)']")
	WebElement accom;
	
	@FindBy(xpath = "//button[@ng-click ='vm.addManualFacility(0, false, true)']")
	WebElement extra;
	
	@FindBy(xpath = "//input[@ng-model ='accommodation.description']")
	WebElement accomdesc;
	
	@FindBy(xpath = "//input[@ng-model ='accommodation.quantity']")
	WebElement accomquantity;
	
	@FindBy(xpath = "//input[@ng-model ='accommodation.displayCost']")
	WebElement accomcost;
		
	@FindBy(xpath = "//button[contains(text(),'Mark up')]")
	WebElement markup;
	
	@FindBy(xpath = "//input[@ng-model ='selectedSupplement.description']")
	WebElement extradesc;
	
	@FindBy(xpath = "//input[@ng-model ='selectedSupplement.quantity']")
	WebElement extraquantity;
	
	@FindBy(xpath = "//input[@ng-model ='selectedSupplement.displayCost']")
	WebElement extracost;
	
	@FindBy(xpath = "//select[@ng-model ='vm.typeOfCrossing']")
	WebElement crossingType;
	
	@FindBy(xpath = "//input[@ng-model ='vm.inboundDepartureDate']")
	WebElement inboundDepartureDate;
	
	@FindBy(xpath = "//input[@ng-model ='vm.inboundArrivalDate']")
	WebElement inboundArrivalDate;
	
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	WebElement remove;
	
	@FindBy(xpath = "//a[contains(text(),'Cancellation Charge')]")
	WebElement cancellationcharge;
		
	public void amendManualFerry() throws InterruptedException{
		mainbooking.click();
		Thread.sleep(1000);
		amendmanualferry.click();
		shipname.sendKeys("Test");
		amend.click();
		agree.click();
		Thread.sleep(1000);
	}
	
	public void amendOutfit() throws InterruptedException{
		
		amendmanualferry.click();
		
		Select vehicletype = new Select(vehicle);
		vehicletype.selectByIndex(2);
		
		vehicleMake.sendKeys("Test123");
		vehicleModel.sendKeys("Test123");
		vehicleRegistration.sendKeys("Test123");
		
		amend.click();
		agree.click();
		Thread.sleep(1000);
	}
	public void removeFerry()  throws InterruptedException
	{
		remove.click();
		Thread.sleep(1000);
		remove.click();
		Thread.sleep(1000);
		if(cancellationcharge.isDisplayed())
		{
			System.out.print("cancellation charge is been applied");
		}
		
	}
	public void amendTowing() throws InterruptedException{
		
		amendmanualferry.click();
		
		Select trailertype = new Select(trailer);
		trailertype.selectByIndex(2);
		Thread.sleep(1000);
		Select length = new Select(trailerLength);
		length.selectByIndex(5);
		
		Select height = new Select(trailerHeight);
		height.selectByIndex(6);
		
		
		trailerMake.sendKeys("trailerMake");
		trailerModel.sendKeys("trailerModel");
		
		amend.click();
		agree.click();
		Thread.sleep(1000);
		
	}
	public void amendAccommodation() throws InterruptedException{
		
		amendmanualferry.click();
		accom.click();
		Thread.sleep(2000);
		accomdesc.sendKeys("Club Seat");
		accomquantity.sendKeys("1");
		accomcost.sendKeys("10");
		markup.click();
		Thread.sleep(2000);
		amend.click();
		agree.click();
		Thread.sleep(2000);
	}
	
	public void amendExtra() throws InterruptedException{
		
		amendmanualferry.click();
		extra.click();
		Thread.sleep(2000);
		extradesc.sendKeys("Pets");
		extraquantity.sendKeys("2");
		extracost.sendKeys("10");
		markup.click();
		Thread.sleep(2000);
		amend.click();
		agree.click();
		Thread.sleep(1000);
	}
	
	public void amendCrossing() throws InterruptedException{
		
		amendmanualferry.click();
		Select crossing = new Select(crossingType);
		crossing.selectByIndex(1);
		
		Thread.sleep(1000);
		inboundDepartureDate.sendKeys("12/4/19");
		inboundArrivalDate.sendKeys("12/7/19");
		Thread.sleep(1000);
		amend.click();
		agree.click();
		Thread.sleep(1000);
	}
	
	
}
