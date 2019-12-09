package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class AmendFerryPage extends TestBase {
	
	public AmendFerryPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'View extras & cabin options')]")
	WebElement viewextra;
	
	@FindBy(xpath = "//a[contains(text(),'Main booking')]")
	WebElement mainBooking;
	
	@FindBy(xpath = "//select[@ng-model ='selectedSupplement.selectedFacilityId']")
	WebElement extraAccom;
	
	@FindBy(xpath = "//input[@ng-model ='selectedSupplement.totalRequested']")
	WebElement extraAcccomQty;
	
	@FindBy(xpath = "//select[@ng-model ='selectedextra.selectedExtraId']")
	WebElement extra;
	
	@FindBy(xpath = "//input[@ng-model ='selectedextra.totalRequest']")
	WebElement extraQty;
	
	@FindBy(xpath = "//button[contains(text(),'Get prices')]")
	WebElement getPrice;
	
	@FindBy(xpath = "//button[contains(text(),'Update basket')]")
	WebElement updateBasket;
	
	@FindBy(xpath = "//a[contains(text(),'History')]")
	WebElement history;
	
	OutfitDetailPage util = new OutfitDetailPage();
	
	public void viewExtra() throws InterruptedException{
		mainBooking.click();
		viewextra.click();
	}
	
	public void updateExtraAccom() throws InterruptedException
	{
		Select extra = new Select(extraAccom);
		extra.selectByIndex(1);	
		extraAcccomQty.click();
		extraAcccomQty.sendKeys("1");
		
	}
	
	public void updateExtra() throws InterruptedException
	{
		Select extras = new Select(extra);
		extras.selectByIndex(1);	
		extraQty.click();
		extraQty.clear();
		extraQty.sendKeys("1");
		
	}
	
	public void updateBasket() throws InterruptedException
	{
	
		getPrice.click();
		Thread.sleep(2000);
		updateBasket.click();
		util.waitForVisibility(history);
		Thread.sleep(4000);
		history.click();
	}
	
	
}
