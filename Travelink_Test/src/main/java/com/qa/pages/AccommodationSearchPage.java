package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class AccommodationSearchPage extends TestBase{

	
	public AccommodationSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Accom")
	WebElement accom;
	
	
	@FindBy(xpath = "//span[@class='icon icon-accom']")
	WebElement accomDest;
	
	
	@FindBy(xpath = "//input[@ng-model ='accomSearch.destination']")
	WebElement destination;
	
	@FindBy(xpath = "//input[@ng-model ='accomSearch.dateFrom']")
	WebElement dateFrom;
	
	@FindBy(xpath = "//input[@ng-model ='accomSearch.dateTo']")
	WebElement dateTo;
	
	@FindBy(xpath = "//button[contains(text(),'Search accommodations')]")
	WebElement searchAccom;
	
	OutfitDetailPage util = new OutfitDetailPage();
	public void newAccomQuote() throws InterruptedException {
		accom.click();
		//Thread.sleep(3000);
		util.waitForVisibility(destination);
		destination.click();
		destination.sendKeys("Le Domaine de la");
		accomDest.click();
		
		dateFrom.click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	   
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2019'][data-pika-month='6'][data-pika-day='22']")).get(0).click();
	    
	    
		
		
		dateTo.click();
		Thread.sleep(3000);
	
		dateTo.clear();
		dateTo.sendKeys("7/23/19");
		
		searchAccom.click();
	}
}
