package com.qa.pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class FerrySearchPage extends TestBase{

	public FerrySearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-sub-link icon icon-port']")
	public WebElement ferries;
	
	
	@FindBy(css = "select[id^='input_']")
	WebElement crossing;
	
	@FindBy(css = "input[id^='input_']")
	WebElement outBoundRoute;
	
	
	@FindBy(xpath = "//select[@ng-model ='vm.search.fareType']")
	WebElement fareType;
	
	
	@FindBy(xpath = "//span[contains(text(),'Caen - Portsmouth (Brittany)')]")
	WebElement route;
	
	@FindBy(xpath = "//input[@id='date-from']")
	WebElement dateFrom;
	
	
	@FindBy(xpath = "//input[@id='date-to']")
	WebElement dateTo;
	
	
	@FindBy(xpath = "//button[contains(text(),'Search for ferries')]")
	WebElement searchFerry;
	
	
	
	
	public void newFerryQuote() throws InterruptedException {
				
		ferries.click();
		Thread.sleep(3000);
				
		Select crossingType = new Select(crossing);
		crossingType.selectByIndex(0);
	   
		Thread.sleep(3000);
		
		
		outBoundRoute.click();
		outBoundRoute.sendKeys("Caen");
		
		route.click();
		
		
		dateFrom.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	   
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2019'][data-pika-month='10'][data-pika-day='29']")).get(0).click();
	    
	  
	    
	    searchFerry.click();
	    Thread.sleep(6000);
	    
	    
	   
	    
	    
	}
	
		
	
	public static void selectElementByValue(WebElement element, String value) {
	//log.info("Selecting a value");
	Select selectitem = new Select(element);
	selectitem.selectByValue(value);
	}


	public void newReturnFerryQuote() throws InterruptedException {
		// TODO Auto-generated method stub
		
		ferries.click();
		Thread.sleep(3000);
				
		Select crossingType = new Select(crossing);
		crossingType.selectByIndex(1);
	   
		Thread.sleep(3000);
		
		
		outBoundRoute.click();
		outBoundRoute.sendKeys("Caen");
		
		route.click();
		
		
		dateFrom.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	   
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2019'][data-pika-month='11'][data-pika-day='22']")).get(0).click();
	    
	    
	    dateTo.click();
	    dateTo.sendKeys("7/24/19");
	     
	    
	    Thread.sleep(3000);
		Select fare = new Select(fareType);
		fare.selectByIndex(2);
	    
	    searchFerry.click();
	    Thread.sleep(3000);
		
	}

	


}
