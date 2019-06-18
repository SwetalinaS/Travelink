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
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname, String pwd, String db) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		database.sendKeys(db);
		btnLogin.click();
		
		return new HomePage();
	}
}
