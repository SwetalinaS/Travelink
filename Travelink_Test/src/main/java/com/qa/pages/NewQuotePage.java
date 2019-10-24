package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.stepDefinations.NewQuote;
import com.qa.util.TestBase;

public class NewQuotePage extends TestBase{

	@FindBy(linkText="Create new")
	WebElement createNew;
	
	@FindBy(linkText="Create new quote")
	WebElement createNewQuote;
	
	@FindBy(xpath = "//a[contains(text(),'CAMC Member Product')]")
	public WebElement members;
		
	@FindBy(xpath = "//input[@id='save']")
	public WebElement continueQuote;
	
	public NewQuotePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public NewQuote newQuote() {
		createNew.click();
		createNewQuote.click();
		
		driver.switchTo().defaultContent();
	
		driver.switchTo().frame(0);
		//members.isDisplayed();
		members.click();
		continueQuote.click();
		
		return new NewQuote();
	}

	
	
}
