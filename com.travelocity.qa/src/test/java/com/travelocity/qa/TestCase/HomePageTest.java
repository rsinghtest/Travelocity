package com.travelocity.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	@Test(priority=1)
	public void testLogo() {
		
		boolean flag = homeObj.verifyLogoPresent();
		System.out.println("logo is present or not :"+ flag);
		Assert.assertTrue(flag);
		
	}
	
	
	@Test(priority=2)
	public void testTitle() {

		String title = homeObj.verifyTitle();
		System.out.println(title);
	 	Assert.assertEquals("Wander Wisely with Cheap Hotels, Flights, Vacations & Travel Deals | Travelocity",title);
			
	 
	}
	
	@Test(priority=3)
	public void clickHeaderVacationPackage() {
		homeObj.clickHeaderVacationPackage();
		
	}
 
	@Test(priority=3)
	public void clickHeaderHotel() {
		homeObj.clickHeaderHotel();
	}
	
	
	
	

}
