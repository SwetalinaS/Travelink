package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class OutfitDetailPage extends TestBase {
	public OutfitDetailPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@ng-model ='vm.newVehicle.make']")
	WebElement make;
	
	@FindBy(xpath = "//input[@ng-model ='vm.newVehicle.model']")
	WebElement model;
	
	@FindBy(xpath = "//input[@ng-model ='vm.newVehicle.registration']")
	WebElement registration;
	
	@FindBy(xpath = "//button[@class='btn primary needy']")
	WebElement save;
	
	@FindBy(css = "select[id^='input_']")
	WebElement vehicleType;
	
	
	@FindBy(css = "select[id^='input_']")
	WebElement length;
	
	@FindBy(css = "select[id^='input_']")
	WebElement height;
	
	@FindBy(xpath = "//div[@id='content']")
	WebElement body;
	
	
	public void enterOutfitDetails() throws InterruptedException
	{
		Thread.sleep(1000);
		
		Select vehicle = new Select(vehicleType);
		vehicle.selectByIndex(1);
		
		Thread.sleep(3000);
		Select Vehiclelength = new Select(length);
		Vehiclelength.selectByIndex(1);
		
		Thread.sleep(3000);
		Select Vehicleheight = new Select(height);
		Vehicleheight.selectByIndex(1);
		
		Thread.sleep(3000);
		make.sendKeys("test");
		model.sendKeys("test");
		registration.sendKeys("test");
		body.click();
		save.click();
		
	}
	

	
}
