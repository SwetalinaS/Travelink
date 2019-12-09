package com.qa.pages;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	
	@FindBy(xpath = "//span[contains(text(),'Calais - Dover (P&O)')]")
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
		outBoundRoute.sendKeys("Calais");
		
		route.click();
		
		
		dateFrom.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//Wait until departure table visible
	    wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	   
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2019'][data-pika-month='11'][data-pika-day='29']")).get(0).click();
	    
	  
	    
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
		outBoundRoute.sendKeys("Calais");
		
		route.click();
		
		
		dateFrom.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//dateFrom.sendKeys(Keys.SHIFT, Keys.END, Keys.BACK_SPACE);
		//dateFrom.sendKeys("11/24/19");
		//Wait until departure table visible
	  wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
	 
	   
	    //Click departure day
	    driver.findElements(By.cssSelector
	            ("button[data-pika-year='2019'][data-pika-month='11'][data-pika-day='22']")).get(0).click();
	   
		Thread.sleep(3000);
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 22);
		dt = calendar.getTime();
		 
		 
		String tommorowsDate = new SimpleDateFormat("MM/dd/yy").format(dt);
		
	    dateTo.click();
	    dateTo.sendKeys(Keys.SHIFT, Keys.END, Keys.BACK_SPACE);
	    dateTo.sendKeys(tommorowsDate);
	     
	    
	    Thread.sleep(3000);
		Select fare = new Select(fareType);
		fare.selectByIndex(2);
	    
	    searchFerry.click();
	    Thread.sleep(3000);
		
	}

	


}
