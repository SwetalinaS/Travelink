package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class ViewFullBasketPage extends TestBase {

	
	public ViewFullBasketPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	WebElement addToBasket;

	@FindBy(xpath = "//input[@ng-model ='confirmedErrata']")
	WebElement confirmElement;
	
	@FindBy(xpath = "//span[@class='ng-binding ng-scope']")
	WebElement basket;
	
	
	@FindBy(xpath = "//a[contains(text(),'View full basket')]")
	WebElement viewBasket;
	
	@FindBy(xpath = "//input[@id='chkAll']")
	WebElement acceptComments;
	
	/*@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement addAccom;*/
	
	
	
	public void newFerryBooking() {
		addToBasket.click();
	    confirmElement.click();
	    addToBasket.click();
	    
	   // ValidateBasket();
	    
	}
	
	public void newAccomBooking() throws InterruptedException {
		
		
		//waitElementToBeClickableByLocator(driver, By.xpath("//button[contains(text(),'Add')]")).click();
		
		
		//First store parent window to switch back
		String parentWindow = driver.getWindowHandle();

		waitElementToBeClickableByLocator(driver, By.xpath("//button[contains(text(),'Add')]")).click();

		
		Thread.sleep(3000);
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    if(!winHandle.equals(parentWindow)) {
		        driver.switchTo().window(winHandle);
		    }
		}
		WebDriverWait wait = new WebDriverWait(driver, 10);   
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='chkAll']")));

		//Now find checkbox and click 
		element.click();

		//Now close opened popup window 
		driver.close();

		//Switch back to parent window 
		driver.switchTo().window(parentWindow);

		
		
		
	}
	public static WebElement waitElementToBeClickableByLocator(
            WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        return wait.until(ExpectedConditions.elementToBeClickable(by));
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
}