package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver, 60)
             .until(ExpectedConditions.visibilityOf(element));
 }
	
	public void enterOutfitDetails() throws InterruptedException
	{
		
		
		//Thread.sleep(3000);
		waitForVisibility(vehicleType);

		Select vehicle = new Select(vehicleType);
		vehicle.selectByIndex(1);
		
		waitForVisibility(length);
		Select Vehiclelength = new Select(length);
		Vehiclelength.selectByIndex(1);
		
		waitForVisibility(height);
		Select Vehicleheight = new Select(height);
		Vehicleheight.selectByIndex(1);
		
		waitForVisibility(make);
		make.sendKeys("test");
		model.sendKeys("test");
		registration.sendKeys("test");
		
		//Thread.sleep(3000);
		
		
		body.click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn primary needy']"))).click();
		waitForVisibility(save);
		save.click();
		
	}
	

	
}
