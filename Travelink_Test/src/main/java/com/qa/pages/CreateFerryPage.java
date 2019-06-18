package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	WebElement searchferry;

	
	
	public void newFerryQuote() throws InterruptedException {
				
		ferries.click();
				
		Select crossingType = new Select(crossing);
		crossingType.selectByIndex(0);
	   
		Thread.sleep(3000);
		
		//OutBoundRoute.clear();
		outBoundRoute.click();
		outBoundRoute.sendKeys("Calais");
		
		route.click();
		
		
		dateFrom.click();
		/*List<WebElement> allDates=driver.findElements(By.cssSelector(".pika-table"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
		*/
		WebDriverWait wait = new WebDriverWait(driver, 3);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
		 calender.click();
		 departureDate.click();
		    //Click departure day
		//driver.findElements(By.cssSelector("button[data-pika-year='2019'][data-pika-month='6'][data-pika-day='22']")).get(0).click();
		    
		//dateFrom.clear();
		//dateFrom.sendKeys("15-Dec-2019");
		
		//searchferry.click();
	}
	
	
	public static void selectElementByValue(WebElement element, String value) {
	//log.info("Selecting a value");
	Select selectitem = new Select(element);
	selectitem.selectByValue(value);
	}


}
