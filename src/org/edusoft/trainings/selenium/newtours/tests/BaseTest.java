package org.edusoft.trainings.selenium.newtours.tests;

import java.util.concurrent.TimeUnit;

import org.edusoft.trainings.selenium.commonutils.BrowserFactory;
import org.edusoft.trainings.selenium.newtours.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public static String url ; //default access modifier
	public static WebDriver driver;
	public HomePage homepage;
	
	 @BeforeSuite
	 protected void setupSuite(){
			System.out.println("Entering setup suite");
			url = "http://newtours.demoaut.com/";
			
			System.out.println("Exiting  setup suite ");
		}


	// pass browser name as parameter
	@BeforeMethod
//	@Parameters("browser")
//	@Optional String browser
	protected void setupTest() throws Exception{
		System.out.println("Entering setup test ");
		String browser = "chrome";
		
		
		if (browser.equalsIgnoreCase("chrome")){
			driver = BrowserFactory.getChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = BrowserFactory.getFireFoxDriver();
		}
		else{
			//stop execuiton
//			System.exit(0); //not recommeded
			throw new Exception("browser not started");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		homepage = new HomePage();
		System.out.println("Exiting  setup test ");
		
	}

	@AfterMethod
	protected void tearDownTest(){
//		driver.close(); // close current window
//		driver.quit(); //close all sessions
		
	}
	
	@AfterSuite
	protected void tearDownSuite(){
//		driver.close(); // close current window
//		driver.quit(); //close all sessions
		
	}
}
