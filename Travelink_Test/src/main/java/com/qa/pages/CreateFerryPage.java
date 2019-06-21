package com.qa.pages;


import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class CreateFerryPage extends TestBase{

	public CreateFerryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-sub-link icon icon-port']")
	public WebElement ferries;
	
	
	@FindBy(css = "select[id^='input_']")
	WebElement crossing;
	
	@FindBy(css = "input[id^='input_']")
	WebElement outBoundRoute;
	
	@FindBy(xpath = "//span[contains(text(),'Calais - Dover (P and O Ferries)')]")
	WebElement route;
	
	@FindBy(xpath = "//input[@id='date-from']")
	WebElement dateFrom;
	
	@FindBy(css = ".pika-table")
	WebElement calender;
	
	@FindBy(css = "button[data-pika-year='2019'][data-pika-month='6'][data-pika-day='22']")
	WebElement departureDate;
	
	
	@FindBy(xpath = "//button[contains(text(),'Search for ferries')]")
	WebElement searchFerry;
	
	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	WebElement addToBasket;

	@FindBy(xpath = "//input[@ng-model ='confirmedErrata']")
	WebElement confirmElement;
	
	@FindBy(xpath = "//span[@class='ng-binding ng-scope']")
	WebElement basket;
	
	@FindBy(xpath = "//a[contains(text(),'Proceed')]")
	WebElement proceedBooking;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	WebElement proceed;
	
	@FindBy(xpath = "//button[contains(text(),'Book now')]")
	WebElement BookFerry;
	
	
	@FindBy(xpath = "//a[contains(text(),'View full basket')]")
	WebElement viewBasket;
	
	
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
	            ("button[data-pika-year='2019'][data-pika-month='6'][data-pika-day='22']")).get(0).click();
	    
	    searchFerry.click();
	    Thread.sleep(3000);
	    
	    
	   
	    
	    
	}
	
	public void newFerryBooking() {
		addToBasket.click();
	    confirmElement.click();
	    addToBasket.click();
	    
	    ValidateBasket();
	    
	}
	
	public void confirmBooking1() throws InterruptedException {
		 proceedBooking.click();
		    Thread.sleep(1000);
		    //wait.until(ExpectedConditions.visibilityOf(proceed));
		    proceed.click();
		    Thread.sleep(1000);
		    //wait.until(ExpectedConditions.visibilityOf(BookFerry));
		    BookFerry.click();
	}
		
	public void ValidateBasket() {
		if(basket.getText().contains("Calais - Dover"))
	    {
	    	System.out.println("Ferry Name is appropriate");
	    }
	    else
	    {
	    	System.out.println("Ferry Name is not appropriate");
	    }
		
		viewBasket.click();
		
		
	}
	
	public static void selectElementByValue(WebElement element, String value) {
	//log.info("Selecting a value");
	Select selectitem = new Select(element);
	selectitem.selectByValue(value);
	}

	public void confirmBooking() {
		// TODO Auto-generated method stub
		proceedBooking.click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //wait.until(ExpectedConditions.visibilityOf(proceed));
	    proceed.click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //wait.until(ExpectedConditions.visibilityOf(BookFerry));
	    BookFerry.click();
	}


}
