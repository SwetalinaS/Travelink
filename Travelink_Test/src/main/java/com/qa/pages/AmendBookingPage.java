package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AmendBookingPage extends TestBase {
	
	public AmendBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Amend booking')]")
	WebElement amendBtn;
	
	@FindBy(linkText = "Extras")
	WebElement extras;
	
	OutfitDetailPage util = new OutfitDetailPage();
	//String parentWindow;
	
	public void amend() throws InterruptedException
	{
		//parentWindow = driver.getWindowHandle();
		util.waitForVisibility(amendBtn);
		amendBtn.click();
		
		
	}
	
	public void clickExtras() throws InterruptedException
	{
		
		
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		
		String  myWindowHandle =driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		util.waitForVisibility(extras);
		extras.click();
		Thread.sleep(1000);
		
	}

}
