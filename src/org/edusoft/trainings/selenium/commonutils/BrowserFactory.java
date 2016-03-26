package org.edusoft.trainings.selenium.commonutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {
	
	public static WebDriver getFireFoxDriver(){
		
		WebDriver driver = new FirefoxDriver();
		return driver;
		
	}

	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\lib\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/automation/chrome_profile");
		options.addArguments("--start-maximized");
		
		
		return driver;
		
	}
	
	public static WebDriver getIEDriver(){
		WebDriver driver = new InternetExplorerDriver();
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		return driver;
		
	}
}
