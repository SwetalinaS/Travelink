package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	public static Properties prop;
	
	public static WebDriver driver;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	public static void initialization() throws InterruptedException
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath")+"chromedriver_win32 (1)/chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if (browserName.equals("ie"))
		{
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();

			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			System.setProperty("webdriver.ie.driver", prop.getProperty("driverPath")+"IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
			driver = new InternetExplorerDriver(caps);
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
       
        
	}

	
}
