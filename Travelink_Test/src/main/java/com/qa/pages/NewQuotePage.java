package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.stepDefinations.NewQuote;
import com.qa.util.TestBase;

public class NewQuotePage extends TestBase{

	@FindBy(linkText="Create new")
	WebElement createNew;
	
	@FindBy(linkText="Create new quote")
	WebElement createNewQuote;
	
	@FindBy(xpath = "//a[contains(text(),'CAMC Member Product')]")
	public WebElement members;
	
	@FindBy(xpath = "//select[@id='noofadults']")
	public WebElement numberOfAdults;
		
	
	@FindBy(xpath = "//select[@id='noofchildren']")
	public WebElement numberOfChild;
	
	@FindBy(xpath = "//input[@id='save']")
	public WebElement continueQuote;
	
	
	@FindBy(xpath = "//input[@id='childage1']")
	public WebElement childage1;
	
	@FindBy(xpath = "//input[@id='childage2']")
	public WebElement childage2;
	
	@FindBy(xpath = "//form[@id='newdetails']")
	public WebElement newdetails;
	
	public NewQuotePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public NewQuote newQuote() {
		createNew.click();
		createNewQuote.click();
		
//		driver.switchTo().defaultContent();
//	
//		driver.switchTo().frame(0);
//		//members.isDisplayed();
//		members.click();
//		
//		Select adults = new Select(numberOfAdults);
//		adults.selectByIndex(1); //One Adult
//		// adults.selectByIndex(2); // Two Adult
//		continueQuote.click();
//		
		return new NewQuote();
	}
	
	public void continueQuote(int adult, int child) {
//		createNew.click();
//		createNewQuote.click();
		
		driver.switchTo().defaultContent();
	
		driver.switchTo().frame(0);
		//members.isDisplayed();
		members.click();
		
		Select adults = new Select(numberOfAdults);
		adults.selectByIndex(adult);
	
		if(child > 0 )
		{
			numberOfChild.click();
			Select children = new Select(numberOfChild);
			children.selectByIndex(child);
			//childage1.sendKeys("6");
			
			if(childage1.isEnabled())
			{
				childage1.sendKeys("6");
			}
		}
		
		newdetails.click();
		continueQuote.click();
		
		
		//return new NewQuote();
	}

	
	
}
