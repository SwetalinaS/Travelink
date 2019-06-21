package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ExtraSearchPage extends TestBase{

	public ExtraSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Extras")
	WebElement extras;
	
	
	@FindBy(xpath = "//input[@ng-model ='vm.search.description']")
	WebElement extradesc;
	
	@FindBy(xpath = "//button[contains(text(),'Search extras')]")
	WebElement searchExtra;
	
	public void newExtraQuote() throws InterruptedException {
		Thread.sleep(1000);
		extras.click();
		extradesc.sendKeys("Dog");
		
		searchExtra.click();
	}
}
