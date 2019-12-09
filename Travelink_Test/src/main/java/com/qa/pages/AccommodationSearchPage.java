package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
		Thread.sleep(3000);
		util.waitForVisibility(destination);
		destination.click();
		destination.sendKeys("Du Jard");
		accomDest.click();
		
		dateFrom.click();
		Thread.sleep(3000);
		
		/*WebDriverWait wait = new WebDriverWait(driver, 15);
		//Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	   
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2019'][data-pika-month='11'][data-pika-day='28']")).get(0).click();
	    
	    */
		dateFrom.sendKeys(Keys.SHIFT, Keys.END, Keys.BACK_SPACE);
		dateFrom.clear();
		dateFrom.sendKeys("11/22/19");
	
		
		dateTo.click();
		Thread.sleep(3000);
		dateTo.sendKeys(Keys.SHIFT, Keys.END, Keys.BACK_SPACE);
		dateTo.clear();
		dateTo.sendKeys("11/23/19");
	
		searchAccom.click();
	}
}
