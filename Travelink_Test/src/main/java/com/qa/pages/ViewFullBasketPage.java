package com.qa.pages;

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
	
	OutfitDetailPage util = new OutfitDetailPage();
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement addToBasket;

	@FindBy(xpath = "//input[@ng-model ='confirmedErrata']")
	WebElement confirmElement;
	
	@FindBy(xpath = "//span[@class='ng-binding ng-scope']")
	WebElement basket;
	
	
	@FindBy(xpath = "//a[contains(text(),'View full basket')]")
	WebElement viewBasket;
	
	@FindBy(xpath = "//input[@id='chkAll']")
	WebElement acceptComments;
	
	@FindBy(xpath = "//input[@name='btnProceed']")
	WebElement proceed;
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement add;
	
	@FindBy(xpath = "//input[@name='toldcustomer1']")
	WebElement comments;
	
	@FindBy(xpath = "//h4[contains(text(),'Add components')]")
	WebElement addcomponent;
	
	public void newFerryBooking() {
		addToBasket.click();
	    confirmElement.click();
	    addToBasket.click();
	    
	   // ValidateBasket();
	    
	}
	
	public void addComponent() {
		addcomponent.click();
	}
	public void newAccomBooking() throws InterruptedException {
		
		
		String parentWindow = driver.getWindowHandle();

		waitElementToBeClickableByLocator(driver, By.xpath("//button[contains(text(),'Add')]")).click();

		
		Thread.sleep(3000);
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    if(!winHandle.equals(parentWindow)) {
		        driver.switchTo().window(winHandle);
		    }
		}
		/*WebDriverWait wait = new WebDriverWait(driver, 10);   
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='chkAll']")));
*/
		util.waitForVisibility(acceptComments);
		
		acceptComments.click();

		Thread.sleep(6000);
		
		proceed.click();

		
		driver.switchTo().window(parentWindow);

		Thread.sleep(5000);
		
		
	}
	
	public void newExtraBooking() throws InterruptedException {
			String parentWindow = driver.getWindowHandle();
			
			waitElementToBeClickableByLocator(driver, By.xpath("//button[contains(text(),'Add')]")).click();
			

			Thread.sleep(3000);
			//Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    if(!winHandle.equals(parentWindow)) {
			        driver.switchTo().window(winHandle);
			    }
			}
		/*WebDriverWait wait = new WebDriverWait(driver, 10);   
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='toldcustomer1']")));
*/
			//Now find checkbox and click 
			
			util.waitForVisibility(comments);
			comments.click();

			Thread.sleep(3000);
			//Now close opened popup window 
			proceed.click();

			//Switch back to parent window 
			driver.switchTo().window(parentWindow);

			Thread.sleep(5000);
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
