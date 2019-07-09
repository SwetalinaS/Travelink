package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class LoginPage extends TestBase{

	@FindBy(name="txtUserName")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;

	@FindBy(name="ddlDatabase")
	WebElement database;

	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutBtn;
	
	OutfitDetailPage util = new OutfitDetailPage();
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public NewQuotePage login(String uname, String pwd, String db) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		database.sendKeys(db);
		btnLogin.click();
		
		return new NewQuotePage();
	}
	
	public void logout()
	{
		util.waitForVisibility(logoutBtn);
		logoutBtn.click();
	}
}
