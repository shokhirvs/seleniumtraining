package org.edusoft.trainings.selenium.newtours.tests;
import org.edusoft.trainings.selenium.newtours.pages.RegistrationPage;
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
	


}
