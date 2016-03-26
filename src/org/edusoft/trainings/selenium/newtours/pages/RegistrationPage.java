package org.edusoft.trainings.selenium.newtours.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	
	//login.fillRegistrationForm("First Name",":LastName","phone","email","address","city","state/province","postal code","country","username","password","confirm password");
	//login.register
		
		//fields
		public String Firstname;
		public String lastname;
		public String phone;
		public String email;
		public String address;
		public String city;
		public String State;
		public String postalcode;
		public String country;
		
	
		
		//method with no paramater or return value
		public void register(WebDriver driver)
		{
			
			enterFirstname( driver);
			enterLastname( driver);
		}
		
		//enter first name
		private void enterFirstname(WebDriver driver)
		{
			
			//locator
			By fnamefield = By.cssSelector("input[name='firstName']");
			
			//element
			WebElement fnameElement = driver.findElement(fnamefield);
			
			//type username
			fnameElement.sendKeys("avinash");
			
//			driver.findElement(By.name("userName")).sendKeys(username);
				
		}
		
		private void enterLastname(WebDriver driver)
		{
			//locator
					By pwField = By.cssSelector("input[name='lastName");
					
					//element
					WebElement pwElement = driver.findElement(pwField);
					
					//type username
					pwElement.sendKeys("");
			
		}
		
		private void enterPhone(WebDriver driver)
		{
			
			
			
			//locator
			By phone = By.cssSelector("input[name=phone");
			
					
					//element
					WebElement pwElement = driver.findElement(phone);
					
					//type username
					pwElement.sendKeys("asd");
			
		}
		
		private void enterEmail(WebDriver driver)
		{
			
			By email = By.xpath("//input[@name=userName");
			
//			By email = By.cssSelector("input[name='userName");
			
			
			
			
			//locator
					
					
					//element
					WebElement pwElement = driver.findElement(email);
					
					//type username
					pwElement.sendKeys("23");
			
		}
		
		public void clicksignin(WebDriver driver){
			// locator
			By signinbutton = By.name("login");
			
			// element
			WebElement signinbuttonelement = driver.findElement(signinbutton);
			
			// click on it
			signinbuttonelement.click();
		}

		public void fillDeatils(WebDriver driver) {
			enterFirstname(driver);
			enterLastname(driver);
			enterPhone(driver);
			enterEmail(driver);
			
		}
	
	//

}
