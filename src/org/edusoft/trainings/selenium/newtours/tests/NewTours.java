package org.edusoft.trainings.selenium.newtours.tests;
import org.edusoft.trainings.selenium.newtours.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTours extends BaseTest
{
	

	@Test
	public  void testLogin(){
		
		//String userName, String passWord
		
		System.out.println("Entering testLogin");
		homepage.launchUrl(driver, url);
				
		homepage.username="abc";
		homepage.password="12";
		
		homepage.submit(driver);
		System.out.println("Exiting  testLogin");
				
	}
	
	@Test
	public  void testRegistration() {
		
		//click on registration 
		homepage.launchUrl(driver, url);
		
		
		RegistrationPage registrationpage = homepage.clickRegistration(driver);
		
		
		
		//fill details 
		registrationpage.fillDeatils(driver);
		
		//submit
		//registrationpage.submit(driver);
			
	}
	
	
	@Test
	public  void test01() {
		
		//click on registration 
		homepage.launchUrl(driver, url);
		
		//get current title
		
		if( driver.getTitle().equalsIgnoreCase("WELCOME: Mercury Tours")){
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		//compare with 
	
		//verification point 
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
		
		
		
		
			
	}


}
