package org.edusoft.trainings.selenium.newtours.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage
{
	
	//fields
	public String username;
	public String password;
	
public void submit3(WebDriver driver){
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("shashank");
		
	}
	
	public void submit2(WebDriver driver){
		
		List<WebElement> inputs = driver.findElements(By.tagName("input")); //4 elements
		
	
		
		System.out.println("number of inputs tag" + inputs.size());
		inputs.get(2).sendKeys("shashank");
		inputs.get(3).sendKeys("passs");
		inputs.get(4).click();
		
	}
	
	//method with no paramater or return value
	public void submit(WebDriver driver)
	{
		
		enterUserID( driver);
		enterPassword( driver);
	}
	
	//method with one paramater and no return value
	private void enterUserID(WebDriver driver)
	{
		
		//action 
		   // where -- locator 
			// what -- sendkey
		
		//locator
		By useridField = By.name("userName");
		
		//element
		WebElement userIdElement = driver.findElement(useridField);
		
		//type username
		userIdElement.sendKeys(username);
		
		
		
//		driver.findElement(By.name("userName")).sendKeys(username);
			
	}
	
	private void enterPassword(WebDriver driver)
	{
		//locator
				By pwField = By.name("password");
				
				//element
				WebElement pwElement = driver.findElement(pwField);
				
				//type username
				pwElement.sendKeys(password);
		
	}
	
	public void clicksignin(WebDriver driver){
		// locator
		By signinbutton = By.name("login");
		
		// element
		WebElement signinbuttonelement = driver.findElement(signinbutton);
		
		// click on it
		signinbuttonelement.click();
	}
	
	//method with one paramater and no return value
	public boolean validateLoginSuccess(String username)
	{
		
		
			return true;	
				
	}
	
	//method with 2 paramater and no return value
	public void launchUrl(WebDriver driver, String url)
	{
		driver.get(url);		
	}

	public RegistrationPage clickRegistration(WebDriver driver) {
		
		//click on he 
//		driver.findElement(By.linkText("REGISTER")).click();
		
		By linkRegister = By.linkText("REGISTER");
		List<WebElement> elements = driver.findElements(linkRegister);
		elements.get(0).click();
				
		
		
		return new RegistrationPage();
	}

}
