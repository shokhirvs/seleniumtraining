package org.edusoft.trainings.selenium.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	// login.fillRegistrationForm("First Name",":LastName","phone","email","address","city","state/province","postal code","country","username","password","confirm password");
	// login.register

	// fields
	public String Firstname;
	public String lastname;
	public String phone;
	public String email;
	public String address;
	public String city;
	public String State;
	public String postalcode;
	public String country;

	// method with no paramater or return value
	public void fillDetails(WebDriver driver) {
		enterFirstname(driver);
		enterLastname(driver);
		enterPhone(driver);
		enterEmail(driver);
		enteraddressL1(driver);
		enteraddressL2(driver);
		entercity(driver);
		enterstate(driver);
		enterpostalcode(driver);
		entercountry(driver);
		enterusername(driver);
		enterpassword(driver);
		enterconfirmpassword(driver);
		//clicksignin(driver);
	}

	// enter first name
	private void enterFirstname(WebDriver driver) {

		// locator
		By fnamefield = By.cssSelector("input[name='firstName']");

		// element
		WebElement fnameElement = driver.findElement(fnamefield);

		// type username
		fnameElement.sendKeys("Shashank");

		// driver.findElement(By.name("userName")).sendKeys(username);

	}

	private void enterLastname(WebDriver driver) {
		// locator
		By pwField = By.cssSelector("input[name='lastName");

		// element
		WebElement pwElement = driver.findElement(pwField);

		// type username
		pwElement.sendKeys("Gupta");

	}

	private void enterPhone(WebDriver driver) {

		// locator
		By phone = By.cssSelector("input[name=phone");

		// element
		WebElement pwElement = driver.findElement(phone);

		// type phone number
		pwElement.sendKeys("9818996090");

	}

	private void enterEmail(WebDriver driver) {

		// locator
		// By email = By.xpath("//input[name=userName");

		By email = By.cssSelector("input[name='userName']");

		// element
		WebElement pwElement = driver.findElement(email);

		// type username
		pwElement.sendKeys("shokhirvs@gmail.com");

	}

	private void enteraddressL1(WebDriver driver) {

		// locator
		// By address = By.xpath("//input[name= address1,address2");

		By address = By.cssSelector("input[name='address1']");

		// element
		WebElement pwElement = driver.findElement(address);

		// type username
		pwElement.sendKeys("137/8,Model Town");

	}
	
	private void enteraddressL2(WebDriver driver) {

		// locator
		
		By address = By.cssSelector("input[name='address2']");

		// element
		WebElement pwElement = driver.findElement(address);

		// type username
		pwElement.sendKeys("L 2,Model Town");

	}

	private void entercity(WebDriver driver) {

		// locator
		// By city = By.xpath("//input[name= city");

		By city = By.cssSelector("input[name='city");

		// element
		WebElement pwElement = driver.findElement(city);

		// type username
		pwElement.sendKeys("Gurgaon");

	}

	private void enterstate(WebDriver driver) {

		// locator
		// By state = By.xpath("//input[name= state");

		By state = By.cssSelector("input[name='state");

		// element
		WebElement pwElement = driver.findElement(state);

		// type username
		pwElement.sendKeys("Haryana");

	}

	private void enterpostalcode(WebDriver driver) {

		// locator
		// By postalcode = By.xpath("//input[@name=postalcode");

		By postalcode = By.cssSelector("input[name='postalCode");

		// element
		WebElement pwElement = driver.findElement(postalcode);

		// type username
		pwElement.sendKeys("122001");

	}

	private void entercountry(WebDriver driver) {

		// locator
		// By country = By.xpath("//input[name=country");

		By country = By.cssSelector("select[name='country']");

		// element
		WebElement pwElement = driver.findElement(country);
		
		Select countryDropdown = new Select(pwElement);

		// type username
		//countryDropdown.selectByValue("INDIA");
		countryDropdown.selectByVisibleText("INDIA");

	}

	private void enterusername(WebDriver driver) {

		// locator
		// By uname = By.xpath("//input[name=email");

		By uname = By.cssSelector("input[name='email");

		// element
		WebElement pwElement = driver.findElement(uname);

		// type username
		pwElement.sendKeys("shokhirvs");

	}

	private void enterpassword(WebDriver driver) {

		// locator
		By passname = By.xpath("//input[@name='password']");

		
		// element
		WebElement pwElement = driver.findElement(passname);

		// type username
		pwElement.sendKeys("rvs@12345");

	}

	private void enterconfirmpassword(WebDriver driver) {

		// locator
		By cpassname = By.xpath("//input[@name='confirmPassword']");

		//By cpassname = By.cssSelector("input[name='email");

		// element
		WebElement pwElement = driver.findElement(cpassname);

		// draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", pwElement);
	    }
	    
		// type username
		pwElement.sendKeys("rvs@12345");

	}

	public void clicksignin(WebDriver driver) {
		// locator
		By submitbutton = By.name("register");

		// element
		WebElement submitbuttonelement = driver.findElement(submitbutton);
		
		// draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", submitbuttonelement);
	    }
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// click on it
		submitbuttonelement.click();
	}

	//

}
